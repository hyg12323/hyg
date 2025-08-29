package yaDTO;

import java.sql.Date;

public class Production_resultDTO {

	private int pr_id;
	private int po_id;
	private int eq_id;
	private int lot_id;
	private int worker_id;
	private String defect_code;
	private int good_qty;
	private int defect_qty;
	private Date result_time;
	private Date start_time;
	private Date end_time;
	private int run_id;
	public int getPr_id() {
		return pr_id;
	}
	public void setPr_id(int pr_id) {
		this.pr_id = pr_id;
	}
	public int getPo_id() {
		return po_id;
	}
	public void setPo_id(int po_id) {
		this.po_id = po_id;
	}
	public int getEq_id() {
		return eq_id;
	}
	public void setEq_id(int eq_id) {
		this.eq_id = eq_id;
	}
	public int getLot_id() {
		return lot_id;
	}
	public void setLot_id(int lot_id) {
		this.lot_id = lot_id;
	}
	public int getWorker_id() {
		return worker_id;
	}
	public void setWorker_id(int worker_id) {
		this.worker_id = worker_id;
	}
	public String getDefect_code() {
		return defect_code;
	}
	public void setDefect_code(String defect_code) {
		this.defect_code = defect_code;
	}
	public int getGood_qty() {
		return good_qty;
	}
	public void setGood_qty(int good_qty) {
		this.good_qty = good_qty;
	}
	public int getDefect_qty() {
		return defect_qty;
	}
	public void setDefect_qty(int defect_qty) {
		this.defect_qty = defect_qty;
	}
	public Date getResult_time() {
		return result_time;
	}
	public void setResult_time(Date result_time) {
		this.result_time = result_time;
	}
	public Date getStart_time() {
		return start_time;
	}
	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	}
	public Date getEnd_time() {
		return end_time;
	}
	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}
	public int getRun_id() {
		return run_id;
	}
	public void setRun_id(int run_id) {
		this.run_id = run_id;
	}
	@Override
	public String toString() {
		return "Production_resultDTO [pr_id=" + pr_id + ", po_id=" + po_id + ", eq_id=" + eq_id + ", lot_id=" + lot_id
				+ ", worker_id=" + worker_id + ", defect_code=" + defect_code + ", good_qty=" + good_qty
				+ ", defect_qty=" + defect_qty + ", result_time=" + result_time + ", start_time=" + start_time
				+ ", end_time=" + end_time + ", run_id=" + run_id + "]";
	}
	
}
