package yaDTO;

import java.sql.Date;

public class Job_sessionDTO {

	private int run_id;
	private int po_id;
	private int eq_id;
	private int lot_id;
	private int worker_id;
	private String status;
	private Date start_time;
	private Date end_time;
	private int total_minutes;
	private String remarks;
	public int getRun_id() {
		return run_id;
	}
	public void setRun_id(int run_id) {
		this.run_id = run_id;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	public int getTotal_minutes() {
		return total_minutes;
	}
	public void setTotal_minutes(int total_minutes) {
		this.total_minutes = total_minutes;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "Job_sessionDTO [run_id=" + run_id + ", po_id=" + po_id + ", eq_id=" + eq_id + ", lot_id=" + lot_id
				+ ", worker_id=" + worker_id + ", status=" + status + ", start_time=" + start_time + ", end_time="
				+ end_time + ", total_minutes=" + total_minutes + ", remarks=" + remarks + "]";
	}
	
	
	
}
