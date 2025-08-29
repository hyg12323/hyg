package yaDTO;

import java.sql.Date;

public class LotDTO {
	
	private int lot_id;
	private String lot_no;
	private int product_id;
	private int po_id;
	private int eq_id;
	private Date mfg_date;
	private Date exp_date;
	private String shift_code;
	private String remarks;
	
	
	
	public String getShift_code() {
		return shift_code;
	}
	public void setShift_code(String shift_code) {
		this.shift_code = shift_code;
	}
	public int getLot_id() {
		return lot_id;
	}
	public void setLot_id(int lot_id) {
		this.lot_id = lot_id;
	}
	public String getLot_no() {
		return lot_no;
	}
	public void setLot_no(String lot_no) {
		this.lot_no = lot_no;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
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
	public Date getMfg_date() {
		return mfg_date;
	}
	public void setMfg_date(Date mfg_date) {
		this.mfg_date = mfg_date;
	}
	public Date getExp_date() {
		return exp_date;
	}
	public void setExp_date(Date exp_date) {
		this.exp_date = exp_date;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "LotDTO [lot_id=" + lot_id + ", lot_no=" + lot_no + ", product_id=" + product_id + ", po_id=" + po_id
				+ ", eq_id=" + eq_id + ", mfg_date=" + mfg_date + ", exp_date=" + exp_date + ", shift_code="
				+ shift_code + ", remarks=" + remarks + "]";
	}

	
	
}
