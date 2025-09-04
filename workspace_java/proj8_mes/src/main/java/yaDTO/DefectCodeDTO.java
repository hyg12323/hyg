package yaDTO;

public class DefectCodeDTO {

	
	private String defect_code;
	private String description;
	public String getDefect_code() {
		return defect_code;
	}
	public void setDefect_code(String defect_code) {
		this.defect_code = defect_code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "DefectCodeDTO [defect_code=" + defect_code + ", description=" + description + "]";
	}
	
	
}
