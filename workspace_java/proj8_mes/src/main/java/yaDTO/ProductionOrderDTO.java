package yaDTO;

import java.sql.Date;
import java.time.LocalDateTime;

public class ProductionOrderDTO {
	private int order_id;
	private int target_id;
	private int quantity;
	private Date due_date;
	private String status;
	private LocalDateTime created_at;
	private int created_by;
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getTarget_id() {
		return target_id;
	}
	public void setTarget_id(int target_id) {
		this.target_id = target_id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
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
	public LocalDateTime getCreated_at() {
		return created_at;
	}
	public void setCreated_at(LocalDateTime created_at) {
		this.created_at = created_at;
	}
	public int getCreated_by() {
		return created_by;
	}
	public void setCreated_by(int created_by) {
		this.created_by = created_by;
	}
	@Override
	public String toString() {
		return "ProductionOrderDTO [order_id=" + order_id + ", target_id=" + target_id + ", quantity=" + quantity
				+ ", due_date=" + due_date + ", status=" + status + ", created_at=" + created_at + ", created_by="
				+ created_by + "]";
	}
	
	
}
