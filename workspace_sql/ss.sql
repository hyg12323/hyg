------------------------------------------------------------------------
-- 0) 유틸: 이미 존재하면 드롭하려면 여기서 처리(선택)
--    개발 반복 시 편의용. 운영 DB에서는 주의!
------------------------------------------------------------------------
-- DROP TABLE ... CASCADE CONSTRAINTS;  -- 필요시 수동 정리

/* ==========================================================
   1) 공통 마스터
   ========================================================== */

---------------------------------------------------
-- USERS
---------------------------------------------------
CREATE TABLE users (
  user_id       NUMBER PRIMARY KEY,
  username      VARCHAR2(50) UNIQUE NOT NULL,
  password_hash VARCHAR2(200) NOT NULL,
  role          VARCHAR2(20) NOT NULL,         -- ADMIN / WORKER / VIEWER ...
  created_at    DATE DEFAULT SYSDATE
);
CREATE SEQUENCE seq_users START WITH 1 INCREMENT BY 1 NOCACHE;
CREATE OR REPLACE TRIGGER trg_users_pk
BEFORE INSERT ON users
FOR EACH ROW
BEGIN
  :NEW.user_id := NVL(:NEW.user_id, seq_users.NEXTVAL);
END;
/

---------------------------------------------------
-- WORK_SHIFT
---------------------------------------------------
CREATE TABLE work_shift (
  shift_code VARCHAR2(10) PRIMARY KEY,
  name       VARCHAR2(50) NOT NULL
);

---------------------------------------------------
-- EQUIPMENT_STATUS
---------------------------------------------------
CREATE TABLE equipment_status (
  status_code VARCHAR2(20) PRIMARY KEY,   -- RUN/IDLE/DOWN/PM
  status_name VARCHAR2(50) NOT NULL
);

---------------------------------------------------
-- EQUIPMENT
---------------------------------------------------
CREATE TABLE equipment (
  eq_id       NUMBER PRIMARY KEY,
  eq_code     VARCHAR2(30) UNIQUE NOT NULL,  -- FILL01, MIX02 ...
  eq_name     VARCHAR2(100) NOT NULL,
  line        VARCHAR2(50),
  status_code VARCHAR2(20) NOT NULL
);
CREATE SEQUENCE seq_equipment START WITH 1 INCREMENT BY 1 NOCACHE;
CREATE OR REPLACE TRIGGER trg_equipment_pk
BEFORE INSERT ON equipment
FOR EACH ROW
BEGIN
  :NEW.eq_id := NVL(:NEW.eq_id, seq_equipment.NEXTVAL);
END;
/
ALTER TABLE equipment
  ADD CONSTRAINT fk_eq_status
  FOREIGN KEY (status_code) REFERENCES equipment_status(status_code);

---------------------------------------------------
-- ITEM (완제품)
---------------------------------------------------
CREATE TABLE item (
  product_id NUMBER PRIMARY KEY,
  item_code  VARCHAR2(30) UNIQUE NOT NULL,
  item_name  VARCHAR2(100) NOT NULL,
  unit       VARCHAR2(10)
);
CREATE SEQUENCE seq_item START WITH 1 INCREMENT BY 1 NOCACHE;
CREATE OR REPLACE TRIGGER trg_item_pk
BEFORE INSERT ON item
FOR EACH ROW
BEGIN
  :NEW.product_id := NVL(:NEW.product_id, seq_item.NEXTVAL);
END;
/

---------------------------------------------------
-- MATERIAL (원료)
---------------------------------------------------
CREATE TABLE material (
  material_id   NUMBER PRIMARY KEY,
  material_code VARCHAR2(40) UNIQUE NOT NULL,
  material_name VARCHAR2(100) NOT NULL,
  unit          VARCHAR2(10)
);
CREATE SEQUENCE seq_material START WITH 1 INCREMENT BY 1 NOCACHE;
CREATE OR REPLACE TRIGGER trg_material_pk
BEFORE INSERT ON material
FOR EACH ROW
BEGIN
  :NEW.material_id := NVL(:NEW.material_id, seq_material.NEXTVAL);
END;
/

---------------------------------------------------
-- ORDER_STATUS
---------------------------------------------------
CREATE TABLE order_status (
  code VARCHAR2(20) PRIMARY KEY,      -- ISSUED / IN_PROGRESS / DONE
  name VARCHAR2(50) NOT NULL
);

---------------------------------------------------
-- DEFECT
---------------------------------------------------
CREATE TABLE defect (
  defect_code VARCHAR2(20) PRIMARY KEY,  -- CAP_LEAK ...
  defect_name VARCHAR2(100) NOT NULL,
  cause       VARCHAR2(200)
);

/* ==========================================================
   2) 생산 지시 / LOT / 원료 LOT
   ========================================================== */

---------------------------------------------------
-- PRODUCTION_ORDER
---------------------------------------------------
CREATE TABLE production_order (
  po_id        NUMBER PRIMARY KEY,
  created_by   NUMBER NOT NULL,
  product_id   NUMBER NOT NULL,
  eq_id        NUMBER,
  product_name VARCHAR2(100),
  target_qty   NUMBER NOT NULL,
  due_date     DATE,
  status       VARCHAR2(20) NOT NULL,
  created_at   DATE DEFAULT SYSDATE,
  CONSTRAINT fk_po_user   FOREIGN KEY (created_by) REFERENCES users(user_id),
  CONSTRAINT fk_po_item   FOREIGN KEY (product_id) REFERENCES item(product_id),
  CONSTRAINT fk_po_eq     FOREIGN KEY (eq_id)     REFERENCES equipment(eq_id),
  CONSTRAINT fk_po_status FOREIGN KEY (status)    REFERENCES order_status(code)
);
CREATE SEQUENCE seq_po START WITH 1 INCREMENT BY 1 NOCACHE;
CREATE OR REPLACE TRIGGER trg_po_pk
BEFORE INSERT ON production_order
FOR EACH ROW
BEGIN
  :NEW.po_id := NVL(:NEW.po_id, seq_po.NEXTVAL);
END;
/

---------------------------------------------------
-- LOT (완제품 LOT)
---------------------------------------------------
CREATE TABLE lot (
  lot_id     NUMBER PRIMARY KEY,
  lot_no     VARCHAR2(60) UNIQUE NOT NULL,
  product_id NUMBER NOT NULL,
  po_id      NUMBER,
  eq_id      NUMBER NOT NULL,
  shift_code VARCHAR2(10) NOT NULL,
  mfg_date   DATE NOT NULL,
  exp_date   DATE,
  remarks    VARCHAR2(200),
  CONSTRAINT fk_lot_item  FOREIGN KEY (product_id) REFERENCES item(product_id),
  CONSTRAINT fk_lot_po    FOREIGN KEY (po_id)      REFERENCES production_order(po_id),
  CONSTRAINT fk_lot_eq    FOREIGN KEY (eq_id)      REFERENCES equipment(eq_id),
  CONSTRAINT fk_lot_shift FOREIGN KEY (shift_code) REFERENCES work_shift(shift_code)
);
CREATE SEQUENCE seq_lot START WITH 1 INCREMENT BY 1 NOCACHE;
CREATE OR REPLACE TRIGGER trg_lot_pk
BEFORE INSERT ON lot
FOR EACH ROW
BEGIN
  :NEW.lot_id := NVL(:NEW.lot_id, seq_lot.NEXTVAL);
END;
/

---------------------------------------------------
-- RAW_LOT (원료 LOT)
---------------------------------------------------
CREATE TABLE raw_lot (
  raw_lot_id  NUMBER PRIMARY KEY,
  raw_lot_no  VARCHAR2(60) UNIQUE NOT NULL,
  material_id NUMBER NOT NULL,
  vendor      VARCHAR2(100),
  recv_date   DATE NOT NULL,
  exp_date    DATE,
  qty_on_hand NUMBER,
  remarks     VARCHAR2(200),
  CONSTRAINT fk_rawlot_material FOREIGN KEY (material_id) REFERENCES material(material_id)
);
CREATE SEQUENCE seq_rawlot START WITH 1 INCREMENT BY 1 NOCACHE;
CREATE OR REPLACE TRIGGER trg_rawlot_pk
BEFORE INSERT ON raw_lot
FOR EACH ROW
BEGIN
  :NEW.raw_lot_id := NVL(:NEW.raw_lot_id, seq_rawlot.NEXTVAL);
END;
/

/* ==========================================================
   3) 작업 세션 / 실적 / 불량 상세 / 자재투입 / 알림
   ========================================================== */

---------------------------------------------------
-- JOB_SESSION (공정 단위 실행)
---------------------------------------------------
CREATE TABLE job_session (
  run_id        NUMBER PRIMARY KEY,
  po_id         NUMBER NOT NULL,
  eq_id         NUMBER NOT NULL,
  lot_id        NUMBER,
  worker_id     NUMBER,
  status        VARCHAR2(20) DEFAULT 'RUNNING' NOT NULL, -- RUNNING/PAUSED/COMPLETED
  start_time    DATE NOT NULL,
  end_time      DATE,
  total_minutes NUMBER,
  remarks       VARCHAR2(200),
  CONSTRAINT fk_run_po     FOREIGN KEY (po_id)     REFERENCES production_order(po_id),
  CONSTRAINT fk_run_eq     FOREIGN KEY (eq_id)     REFERENCES equipment(eq_id),
  CONSTRAINT fk_run_lot    FOREIGN KEY (lot_id)    REFERENCES lot(lot_id),
  CONSTRAINT fk_run_worker FOREIGN KEY (worker_id) REFERENCES users(user_id)
);
CREATE SEQUENCE seq_run START WITH 1 INCREMENT BY 1 NOCACHE;
CREATE OR REPLACE TRIGGER trg_run_pk
BEFORE INSERT ON job_session
FOR EACH ROW
BEGIN
  :NEW.run_id := NVL(:NEW.run_id, seq_run.NEXTVAL);
END;
/

---------------------------------------------------
-- PRODUCTION_RESULT (작업 실적)
---------------------------------------------------
CREATE TABLE production_result (
  pr_id       NUMBER PRIMARY KEY,
  po_id       NUMBER NOT NULL,
  eq_id       NUMBER NOT NULL,
  lot_id      NUMBER,
  worker_id   NUMBER,
  defect_code VARCHAR2(20),
  good_qty    NUMBER,
  defect_qty  NUMBER,
  result_time DATE,
  start_time  DATE,
  end_time    DATE,
  run_id      NUMBER,
  CONSTRAINT fk_pr_po     FOREIGN KEY (po_id)       REFERENCES production_order(po_id),
  CONSTRAINT fk_pr_eq     FOREIGN KEY (eq_id)       REFERENCES equipment(eq_id),
  CONSTRAINT fk_pr_lot    FOREIGN KEY (lot_id)      REFERENCES lot(lot_id),
  CONSTRAINT fk_pr_worker FOREIGN KEY (worker_id)   REFERENCES users(user_id),
  CONSTRAINT fk_pr_defect FOREIGN KEY (defect_code) REFERENCES defect(defect_code),
  CONSTRAINT fk_pr_run    FOREIGN KEY (run_id)      REFERENCES job_session(run_id)
);
CREATE SEQUENCE seq_pr START WITH 1 INCREMENT BY 1 NOCACHE;
CREATE OR REPLACE TRIGGER trg_pr_pk
BEFORE INSERT ON production_result
FOR EACH ROW
BEGIN
  :NEW.pr_id := NVL(:NEW.pr_id, seq_pr.NEXTVAL);
END;
/

---------------------------------------------------
-- PRODUCTION_DEFECT_DETAIL (불량코드별 수량)
---------------------------------------------------
CREATE TABLE production_defect_detail (
  pdd_id      NUMBER PRIMARY KEY,
  pr_id       NUMBER NOT NULL,
  defect_code VARCHAR2(20) NOT NULL,
  qty         NUMBER NOT NULL,
  notes       VARCHAR2(200),
  CONSTRAINT fk_pdd_pr     FOREIGN KEY (pr_id)       REFERENCES production_result(pr_id),
  CONSTRAINT fk_pdd_defect FOREIGN KEY (defect_code) REFERENCES defect(defect_code)
);
CREATE SEQUENCE seq_pdd START WITH 1 INCREMENT BY 1 NOCACHE;
CREATE OR REPLACE TRIGGER trg_pdd_pk
BEFORE INSERT ON production_defect_detail
FOR EACH ROW
BEGIN
  :NEW.pdd_id := NVL(:NEW.pdd_id, seq_pdd.NEXTVAL);
END;
/

---------------------------------------------------
-- MATERIAL_ISSUE (자재 투입 실적)
---------------------------------------------------
CREATE TABLE material_issue (
  issue_id    NUMBER PRIMARY KEY,
  run_id      NUMBER NOT NULL,
  material_id NUMBER NOT NULL,
  raw_lot_id  NUMBER NOT NULL,
  planned_qty NUMBER,
  actual_qty  NUMBER NOT NULL,
  unit        VARCHAR2(10),
  used_time   DATE NOT NULL,
  status      VARCHAR2(20) DEFAULT 'OK' NOT NULL,  -- OK/SHORTAGE/MISMATCH
  notes       VARCHAR2(200),
  CONSTRAINT fk_mi_run      FOREIGN KEY (run_id)      REFERENCES job_session(run_id),
  CONSTRAINT fk_mi_material FOREIGN KEY (material_id) REFERENCES material(material_id),
  CONSTRAINT fk_mi_rawlot   FOREIGN KEY (raw_lot_id)  REFERENCES raw_lot(raw_lot_id)
);
CREATE SEQUENCE seq_mi START WITH 1 INCREMENT BY 1 NOCACHE;
CREATE OR REPLACE TRIGGER trg_mi_pk
BEFORE INSERT ON material_issue
FOR EACH ROW
BEGIN
  :NEW.issue_id := NVL(:NEW.issue_id, seq_mi.NEXTVAL);
END;
/

---------------------------------------------------
-- ALERT_EVENT (공정 알림)
---------------------------------------------------
CREATE TABLE alert_event (
  alert_id   NUMBER PRIMARY KEY,
  run_id     NUMBER NOT NULL,
  alert_type VARCHAR2(30) NOT NULL,           -- SHORTAGE/MISMATCH/DEFECT_SPIKE ...
  severity   VARCHAR2(10) DEFAULT 'INFO' NOT NULL,  -- INFO/WARN/CRIT
  message    VARCHAR2(300) NOT NULL,
  created_at DATE NOT NULL,
  resolved_at DATE,
  CONSTRAINT fk_alert_run FOREIGN KEY (run_id) REFERENCES job_session(run_id)
);
CREATE SEQUENCE seq_alert START WITH 1 INCREMENT BY 1 NOCACHE;
CREATE OR REPLACE TRIGGER trg_alert_pk
BEFORE INSERT ON alert_event
FOR EACH ROW
BEGIN
  :NEW.alert_id := NVL(:NEW.alert_id, seq_alert.NEXTVAL);
END;
/

/* ==========================================================
   4) 품질 (QC 결과 & 부적합)
   ========================================================== */

---------------------------------------------------
-- QC_RESULT
---------------------------------------------------
CREATE TABLE qc_result (
  qc_id      NUMBER PRIMARY KEY,
  lot_id     NUMBER NOT NULL,
  param_name VARCHAR2(50) NOT NULL,
  measured   NUMBER,
  unit       VARCHAR2(20),
  result     VARCHAR2(10),     -- PASS/FAIL
  checked_at DATE,
  checked_by NUMBER,
  CONSTRAINT fk_qc_lot  FOREIGN KEY (lot_id)    REFERENCES lot(lot_id),
  CONSTRAINT fk_qc_user FOREIGN KEY (checked_by) REFERENCES users(user_id)
);
CREATE SEQUENCE seq_qc START WITH 1 INCREMENT BY 1 NOCACHE;
CREATE OR REPLACE TRIGGER trg_qc_pk
BEFORE INSERT ON qc_result
FOR EACH ROW
BEGIN
  :NEW.qc_id := NVL(:NEW.qc_id, seq_qc.NEXTVAL);
END;
/

---------------------------------------------------
-- QC_NONCONFORMANCE (QC 부적합)
---------------------------------------------------
CREATE TABLE qc_nonconformance (
  nc_id       NUMBER PRIMARY KEY,
  qc_id       NUMBER NOT NULL,
  defect_code VARCHAR2(20) NOT NULL,
  qty         NUMBER,
  severity    VARCHAR2(10),     -- MINOR/MAJOR/CRIT
  cause_note  VARCHAR2(200),
  action_note VARCHAR2(200),
  created_at  DATE DEFAULT SYSDATE,
  created_by  NUMBER,
  pr_id       NUMBER,
  run_id      NUMBER,
  CONSTRAINT fk_nc_qc      FOREIGN KEY (qc_id)       REFERENCES qc_result(qc_id),
  CONSTRAINT fk_nc_defect  FOREIGN KEY (defect_code) REFERENCES defect(defect_code),
  CONSTRAINT fk_nc_user    FOREIGN KEY (created_by)  REFERENCES users(user_id),
  CONSTRAINT fk_nc_pr      FOREIGN KEY (pr_id)       REFERENCES production_result(pr_id),
  CONSTRAINT fk_nc_run     FOREIGN KEY (run_id)      REFERENCES job_session(run_id)
);
CREATE SEQUENCE seq_nc START WITH 1 INCREMENT BY 1 NOCACHE;
CREATE OR REPLACE TRIGGER trg_nc_pk
BEFORE INSERT ON qc_nonconformance
FOR EACH ROW
BEGIN
  :NEW.nc_id := NVL(:NEW.nc_id, seq_nc.NEXTVAL);
END;
/

/* ==========================================================
   5) BOM / 반제품 / 소비(투입) / 팔레트 / 출하
   ========================================================== */

---------------------------------------------------
-- BOM (자재명세서)
---------------------------------------------------
CREATE TABLE bom (
  bom_id      NUMBER PRIMARY KEY,
  product_id  NUMBER NOT NULL,
  material_id NUMBER NOT NULL,
  qty         NUMBER NOT NULL,
  unit        VARCHAR2(10),
  notes       VARCHAR2(200),
  CONSTRAINT fk_bom_product  FOREIGN KEY (product_id)  REFERENCES item(product_id),
  CONSTRAINT fk_bom_material FOREIGN KEY (material_id) REFERENCES material(material_id),
  CONSTRAINT uq_bom UNIQUE (product_id, material_id)
);
CREATE SEQUENCE seq_bom START WITH 1 INCREMENT BY 1 NOCACHE;
CREATE OR REPLACE TRIGGER trg_bom_pk
BEFORE INSERT ON bom
FOR EACH ROW
BEGIN
  :NEW.bom_id := NVL(:NEW.bom_id, seq_bom.NEXTVAL);
END;
/

---------------------------------------------------
-- SEMI_LOT (반제품 LOT)
---------------------------------------------------
CREATE TABLE semi_lot (
  semi_lot_id NUMBER PRIMARY KEY,
  product_id  NUMBER NOT NULL,     -- 어떤 완제품의 반제품인지
  eq_id       NUMBER,
  worker_id   NUMBER,
  qty         NUMBER NOT NULL,
  unit        VARCHAR2(10),
  start_time  DATE,
  end_time    DATE,
  created_at  DATE DEFAULT SYSDATE,
  CONSTRAINT fk_semi_product FOREIGN KEY (product_id) REFERENCES item(product_id),
  CONSTRAINT fk_semi_eq      FOREIGN KEY (eq_id)     REFERENCES equipment(eq_id),
  CONSTRAINT fk_semi_worker  FOREIGN KEY (worker_id) REFERENCES users(user_id)
);
CREATE SEQUENCE seq_semi START WITH 1 INCREMENT BY 1 NOCACHE;
CREATE OR REPLACE TRIGGER trg_semi_pk
BEFORE INSERT ON semi_lot
FOR EACH ROW
BEGIN
  :NEW.semi_lot_id := NVL(:NEW.semi_lot_id, seq_semi.NEXTVAL);
END;
/

---------------------------------------------------
-- SEMI_CONSUMPTION (원료 LOT → 반제품 LOT 투입)
---------------------------------------------------
CREATE TABLE semi_consumption (
  sc_id       NUMBER PRIMARY KEY,
  semi_lot_id NUMBER NOT NULL,
  raw_lot_id  NUMBER NOT NULL,
  qty_used    NUMBER NOT NULL,
  unit        VARCHAR2(10),
  CONSTRAINT fk_sc_semi   FOREIGN KEY (semi_lot_id) REFERENCES semi_lot(semi_lot_id),
  CONSTRAINT fk_sc_rawlot FOREIGN KEY (raw_lot_id)  REFERENCES raw_lot(raw_lot_id)
);
CREATE SEQUENCE seq_sc START WITH 1 INCREMENT BY 1 NOCACHE;
CREATE OR REPLACE TRIGGER trg_sc_pk
BEFORE INSERT ON semi_consumption
FOR EACH ROW
BEGIN
  :NEW.sc_id := NVL(:NEW.sc_id, seq_sc.NEXTVAL);
END;
/

---------------------------------------------------
-- LOT_SEMI_CONSUMPTION (반제품 LOT → 완제품 LOT 투입)
---------------------------------------------------
CREATE TABLE lot_semi_consumption (
  lsc_id      NUMBER PRIMARY KEY,
  lot_id      NUMBER NOT NULL,
  semi_lot_id NUMBER NOT NULL,
  qty_used    NUMBER NOT NULL,
  unit        VARCHAR2(10),
  CONSTRAINT fk_lsc_lot  FOREIGN KEY (lot_id)      REFERENCES lot(lot_id),
  CONSTRAINT fk_lsc_semi FOREIGN KEY (semi_lot_id) REFERENCES semi_lot(semi_lot_id)
);
CREATE SEQUENCE seq_lsc START WITH 1 INCREMENT BY 1 NOCACHE;
CREATE OR REPLACE TRIGGER trg_lsc_pk
BEFORE INSERT ON lot_semi_consumption
FOR EACH ROW
BEGIN
  :NEW.lsc_id := NVL(:NEW.lsc_id, seq_lsc.NEXTVAL);
END;
/

---------------------------------------------------
-- PALLET_LOT (팔레트)
---------------------------------------------------
CREATE TABLE pallet_lot (
  pallet_id  NUMBER PRIMARY KEY,
  pallet_no  VARCHAR2(60) UNIQUE NOT NULL,
  lot_id     NUMBER NOT NULL,
  qty        NUMBER NOT NULL,
  created_at DATE NOT NULL,
  location   VARCHAR2(50),
  CONSTRAINT fk_pallet_lot FOREIGN KEY (lot_id) REFERENCES lot(lot_id)
);
CREATE SEQUENCE seq_pallet START WITH 1 INCREMENT BY 1 NOCACHE;
CREATE OR REPLACE TRIGGER trg_pallet_pk
BEFORE INSERT ON pallet_lot
FOR EACH ROW
BEGIN
  :NEW.pallet_id := NVL(:NEW.pallet_id, seq_pallet.NEXTVAL);
END;
/

---------------------------------------------------
-- SHIPMENT (출하)
---------------------------------------------------
CREATE TABLE shipment (
  ship_id   NUMBER PRIMARY KEY,
  pallet_id NUMBER NOT NULL,
  customer  VARCHAR2(100) NOT NULL,
  ship_date DATE NOT NULL,
  qty       NUMBER NOT NULL,
  driver    VARCHAR2(50),
  CONSTRAINT fk_ship_pallet FOREIGN KEY (pallet_id) REFERENCES pallet_lot(pallet_id)
);
CREATE SEQUENCE seq_ship START WITH 1 INCREMENT BY 1 NOCACHE;
CREATE OR REPLACE TRIGGER trg_ship_pk
BEFORE INSERT ON shipment
FOR EACH ROW
BEGIN
  :NEW.ship_id := NVL(:NEW.ship_id, seq_ship.NEXTVAL);
END;
/

/* ==========================================================
   6) 성능용 인덱스(권장)
   ========================================================== */

-- PRODUCTION_ORDER
CREATE INDEX idx_po_status ON production_order(status);
CREATE INDEX idx_po_due    ON production_order(due_date);

-- PRODUCTION_RESULT
CREATE INDEX idx_pr_po      ON production_result(po_id);
CREATE INDEX idx_pr_time    ON production_result(result_time);
CREATE INDEX idx_pr_run     ON production_result(run_id);

-- RAW_LOT
CREATE INDEX idx_rawlot_mat ON raw_lot(material_id);

-- MATERIAL_ISSUE
CREATE INDEX idx_mi_run     ON material_issue(run_id);
CREATE INDEX idx_mi_time    ON material_issue(used_time);

-- JOB_SESSION
CREATE INDEX idx_run_po     ON job_session(po_id);
CREATE INDEX idx_run_status ON job_session(status);

-- QC_RESULT / NC
CREATE INDEX idx_qc_lot     ON qc_result(lot_id);
CREATE INDEX idx_nc_qc      ON qc_nonconformance(qc_id);

-- LOT / 팔레트 / 출하
CREATE INDEX idx_lot_po     ON lot(po_id);
CREATE INDEX idx_pallet_lot ON pallet_lot(lot_id);
CREATE INDEX idx_ship_pallet ON shipment(pallet_id);

-- BOM
CREATE INDEX idx_bom_prod   ON bom(product_id);
CREATE INDEX idx_bom_mat    ON bom(material_id);


SELECT table_name 
FROM user_tables;

select * from semi_lot;