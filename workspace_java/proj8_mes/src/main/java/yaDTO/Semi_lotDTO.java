package yaDTO;

import java.sql.Date;

public class Semi_lotDTO {

	private int semi_lot_id;
	private int product_id;
	private int eq_id;
	private int worker_id;
	private int qty;
	private String unit;
	private Date start_time;
	private Date end_time;
	private Date created_at;
	public int getSemi_lot_id() {
		return semi_lot_id;
	}
	public void setSemi_lot_id(int semi_lot_id) {
		this.semi_lot_id = semi_lot_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getEq_id() {
		return eq_id;
	}
	public void setEq_id(int eq_id) {
		this.eq_id = eq_id;
	}
	public int getWorker_id() {
		return worker_id;
	}
	public void setWorker_id(int worker_id) {
		this.worker_id = worker_id;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
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
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	@Override
	public String toString() {
		return "Semi_lotDTO [semi_lot_id=" + semi_lot_id + ", product_id=" + product_id + ", eq_id=" + eq_id
				+ ", worker_id=" + worker_id + ", qty=" + qty + ", unit=" + unit + ", start_time=" + start_time
				+ ", end_time=" + end_time + ", created_at=" + created_at + "]";
	}
	
}
