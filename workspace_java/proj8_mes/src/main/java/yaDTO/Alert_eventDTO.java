package yaDTO;

import java.sql.Date;

public class Alert_eventDTO {

	private int alert_id;
	private int run_id;
	private String alert_type;
	private String severity;
	private String message;
	private Date created_at;
	private Date resolved_at;
	public int getAlert_id() {
		return alert_id;
	}
	public void setAlert_id(int alert_id) {
		this.alert_id = alert_id;
	}
	public int getRun_id() {
		return run_id;
	}
	public void setRun_id(int run_id) {
		this.run_id = run_id;
	}
	public String getAlert_type() {
		return alert_type;
	}
	public void setAlert_type(String alert_type) {
		this.alert_type = alert_type;
	}
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getResolved_at() {
		return resolved_at;
	}
	public void setResolved_at(Date resolved_at) {
		this.resolved_at = resolved_at;
	}
	@Override
	public String toString() {
		return "Alert_eventDTO [alert_id=" + alert_id + ", run_id=" + run_id + ", alert_type=" + alert_type
				+ ", severity=" + severity + ", message=" + message + ", created_at=" + created_at + ", resolved_at="
				+ resolved_at + "]";
	}
	
}
