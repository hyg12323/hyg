package yaDTO;

import java.sql.Date;

public class Material_issueDTO {

	private int issue_id;
	private int run_id;
	private int material_id;
	private int raw_lot_id;
	private int planned_qty;
	private int actual_qty;
	private String unit;
	private Date used_time;
	private String status;
	private String notes;
	public int getIssue_id() {
		return issue_id;
	}
	public void setIssue_id(int issue_id) {
		this.issue_id = issue_id;
	}
	public int getRun_id() {
		return run_id;
	}
	public void setRun_id(int run_id) {
		this.run_id = run_id;
	}
	public int getMaterial_id() {
		return material_id;
	}
	public void setMaterial_id(int material_id) {
		this.material_id = material_id;
	}
	public int getRaw_lot_id() {
		return raw_lot_id;
	}
	public void setRaw_lot_id(int raw_lot_id) {
		this.raw_lot_id = raw_lot_id;
	}
	public int getPlanned_qty() {
		return planned_qty;
	}
	public void setPlanned_qty(int planned_qty) {
		this.planned_qty = planned_qty;
	}
	public int getActual_qty() {
		return actual_qty;
	}
	public void setActual_qty(int actual_qty) {
		this.actual_qty = actual_qty;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public Date getUsed_time() {
		return used_time;
	}
	public void setUsed_time(Date used_time) {
		this.used_time = used_time;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	@Override
	public String toString() {
		return "Material_issueDTO [issue_id=" + issue_id + ", run_id=" + run_id + ", material_id=" + material_id
				+ ", raw_lot_id=" + raw_lot_id + ", planned_qty=" + planned_qty + ", actual_qty=" + actual_qty
				+ ", unit=" + unit + ", used_time=" + used_time + ", status=" + status + ", notes=" + notes + "]";
	}
	
	
}
