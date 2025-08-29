package yaDTO;

import java.sql.Date;

public class UsersDTO {
	
	private int user_id;
	private String username;
	private String password_hash;
	private String role; 
	private Date created_at;
	
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword_hash() {
		return password_hash;
	}
	public void setPassword_hash(String password_hash) {
		this.password_hash = password_hash;
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
	
	
	@Override
	public String toString() {
		return "UsersDTO [user_id=" + user_id + ", username=" + username + ", password_hash=" + password_hash
				+ ", role=" + role + ", created_at=" + created_at + "]";
	}
	  


}
