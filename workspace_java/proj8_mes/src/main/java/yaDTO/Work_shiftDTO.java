package yaDTO;

public class Work_shiftDTO {

	private String shift_code;
	private String name;
	public String getShift_code() {
		return shift_code;
	}
	public void setShift_code(String shift_code) {
		this.shift_code = shift_code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Work_shiftDTO [shift_code=" + shift_code + ", name=" + name + "]";
	}
	
}
