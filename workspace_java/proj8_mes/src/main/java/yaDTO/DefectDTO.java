package yaDTO;

public class DefectDTO {

	
	private String defect_code;
	private String defect_name;
	private String cause;
	public String getDefect_code() {
		return defect_code;
	}
	public void setDefect_code(String defect_code) {
		this.defect_code = defect_code;
	}
	public String getDefect_name() {
		return defect_name;
	}
	public void setDefect_name(String defect_name) {
		this.defect_name = defect_name;
	}
	public String getCause() {
		return cause;
	}
	public void setCause(String cause) {
		this.cause = cause;
	}
	@Override
	public String toString() {
		return "DefectDTO [defect_code=" + defect_code + ", defect_name=" + defect_name + ", cause=" + cause + "]";
	}
	
}
