package yaDTO;

public class Equipment_statusDTO {
	
	private String status_code;
	private String status_name;
	
	public String getStatus_code() {
		return status_code;
	}
	public void setStatus_code(String status_code) {
		this.status_code = status_code;
	}
	public String getStatus_name() {
		return status_name;
	}
	public void setStatus_name(String status_name) {
		this.status_name = status_name;
	}
	@Override
	public String toString() {
		return "Equipment_statusDTO [status_code=" + status_code + ", status_name=" + status_name + "]";
	}
	
}
