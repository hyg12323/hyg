package yaDTO;

import java.sql.Date;

public class Qc_nonconformanceDTO {

	
	private int nc_id;
	private int qc_id;
	private String defect_code;
	private int qty;
	private String severity;
	private String cause_note;
	private String action_note;
	private Date created_at;
	private int created_by;
	private int pr_id;
	private int run_id;
	
	public int getNc_id() {
		return nc_id;
	}
	public void setNc_id(int nc_id) {
		this.nc_id = nc_id;
	}
	public int getQc_id() {
		return qc_id;
	}
	public void setQc_id(int qc_id) {
		this.qc_id = qc_id;
	}
	public String getDefect_code() {
		return defect_code;
	}
	public void setDefect_code(String defect_code) {
		this.defect_code = defect_code;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	public String getCause_note() {
		return cause_note;
	}
	public void setCause_note(String cause_note) {
		this.cause_note = cause_note;
	}
	public String getAction_note() {
		return action_note;
	}
	public void setAction_note(String action_note) {
		this.action_note = action_note;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public int getCreated_by() {
		return created_by;
	}
	public void setCreated_by(int created_by) {
		this.created_by = created_by;
	}
	public int getPr_id() {
		return pr_id;
	}
	public void setPr_id(int pr_id) {
		this.pr_id = pr_id;
	}
	public int getRun_id() {
		return run_id;
	}
	public void setRun_id(int run_id) {
		this.run_id = run_id;
	}
	@Override
	public String toString() {
		return "Qc_nonconformanceDTO [nc_id=" + nc_id + ", qc_id=" + qc_id + ", defect_code=" + defect_code + ", qty="
				+ qty + ", severity=" + severity + ", cause_note=" + cause_note + ", action_note=" + action_note
				+ ", created_at=" + created_at + ", created_by=" + created_by + ", pr_id=" + pr_id + ", run_id="
				+ run_id + "]";
	}
	
}
