package yaDTO;

public class EquipmentDTO {
	
	private int eq_id;
	private String eq_code;
	private String eq_name;
	private String line;
	private String status_code;
	
	
	public int getEq_id() {
		return eq_id;
	}
	public void setEq_id(int eq_id) {
		this.eq_id = eq_id;
	}
	public String getEq_code() {
		return eq_code;
	}
	public void setEq_code(String eq_code) {
		this.eq_code = eq_code;
	}
	public String getEq_name() {
		return eq_name;
	}
	public void setEq_name(String eq_name) {
		this.eq_name = eq_name;
	}
	public String getLine() {
		return line;
	}
	public void setLine(String line) {
		this.line = line;
	}
	public String getStatus_code() {
		return status_code;
	}
	public void setStatus_code(String status_code) {
		this.status_code = status_code;
	}

	@Override
	public String toString() {
		return "EquipmentDTO [eq_id=" + eq_id + ", eq_code=" + eq_code + ", eq_name=" + eq_name + ", line=" + line
				+ ", status_code=" + status_code + "]";
	}
	
	
	
}
