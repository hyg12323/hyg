package yaDTO;

import java.time.LocalDateTime;

public class QualityDefectDTO {
	private int defect_id;
	private int result_id;
	private String defect_code;
	private int quantity;
	private int registered_by;
	private LocalDateTime created_at;
	public int getDefect_id() {
		return defect_id;
	}
	public void setDefect_id(int defect_id) {
		this.defect_id = defect_id;
	}
	public int getResult_id() {
		return result_id;
	}
	public void setResult_id(int result_id) {
		this.result_id = result_id;
	}
	public String getDefect_code() {
		return defect_code;
	}
	public void setDefect_code(String defect_code) {
		this.defect_code = defect_code;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getRegistered_by() {
		return registered_by;
	}
	public void setRegistered_by(int registered_by) {
		this.registered_by = registered_by;
	}
	public LocalDateTime getCreated_at() {
		return created_at;
	}
	public void setCreated_at(LocalDateTime created_at) {
		this.created_at = created_at;
	}
	@Override
	public String toString() {
		return "QualityDefectDTO [defect_id=" + defect_id + ", result_id=" + result_id + ", defect_code=" + defect_code
				+ ", quantity=" + quantity + ", registered_by=" + registered_by + ", created_at=" + created_at + "]";
	}
	
	
}
