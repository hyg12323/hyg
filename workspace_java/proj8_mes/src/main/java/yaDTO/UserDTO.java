package yaDTO;

import java.sql.Date;

public class UserDTO {
	private int user_id;
	private String password;
	private String name;
	private String role;
	private Date created_at;
	private Date updated_at;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	@Override
	public String toString() {
		return "UserDTO [user_id=" + user_id + ", password=" + password + ", name=" + name + ", role=" + role
				+ ", created_at=" + created_at + ", updated_at=" + updated_at + "]";
	}
	
	
	
}
