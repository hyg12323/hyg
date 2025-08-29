package yaDTO;

import java.sql.Date;

public class Qc_resultDTO {

	
	private int qc_id;
	private int lot_id;
	private String param_name;
	private int measured;
	private String unit;
	private String result;
	private Date checked_at;
	private int checked_by;
	public int getQc_id() {
		return qc_id;
	}
	public void setQc_id(int qc_id) {
		this.qc_id = qc_id;
	}
	public int getLot_id() {
		return lot_id;
	}
	public void setLot_id(int lot_id) {
		this.lot_id = lot_id;
	}
	public String getParam_name() {
		return param_name;
	}
	public void setParam_name(String param_name) {
		this.param_name = param_name;
	}
	public int getMeasured() {
		return measured;
	}
	public void setMeasured(int measured) {
		this.measured = measured;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public Date getChecked_at() {
		return checked_at;
	}
	public void setChecked_at(Date checked_at) {
		this.checked_at = checked_at;
	}
	public int getChecked_by() {
		return checked_by;
	}
	public void setChecked_by(int checked_by) {
		this.checked_by = checked_by;
	}
	@Override
	public String toString() {
		return "Qc_resultDTO [qc_id=" + qc_id + ", lot_id=" + lot_id + ", param_name=" + param_name + ", measured="
				+ measured + ", unit=" + unit + ", result=" + result + ", checked_at=" + checked_at + ", checked_by="
				+ checked_by + "]";
	}
	
	
}
