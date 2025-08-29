package yaDTO;

import java.sql.Date;

public class Production_orderDTO {
	
	private int po_id;
	private int created_by;
	private int product_id;
	private int eq_id;
	private String product_name;
	private int target_qty ;
	private Date due_date;
	private String status;
	private Date created_at
	;
	public int getPo_id() {
		return po_id;
	}
	public void setPo_id(int po_id) {
		this.po_id = po_id;
	}
	public int getCreated_by() {
		return created_by;
	}
	public void setCreated_by(int created_by) {
		this.created_by = created_by;
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
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getTarget_qty() {
		return target_qty;
	}
	public void setTarget_qty(int target_qty) {
		this.target_qty = target_qty;
	}
	public Date getDue_date() {
		return due_date;
	}
	public void setDue_date(Date due_date) {
		this.due_date = due_date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	@Override
	public String toString() {
		return "Production_orderDTO [po_id=" + po_id + ", created_by=" + created_by + ", product_id=" + product_id
				+ ", eq_id=" + eq_id + ", product_name=" + product_name + ", target_qty=" + target_qty + ", due_date="
				+ due_date + ", status=" + status + ", created_at=" + created_at + "]";
	}
	
	

}
