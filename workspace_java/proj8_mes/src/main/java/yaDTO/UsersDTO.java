package yaDTO;

public class UsersDTO {

    private int empno;              // 사번 (PK)
    private String username;        // 사용자명
    private String passwordPlain;   // 비밀번호 (평문)
    private String role;            // 권한 (ADMIN / WORKER / VIEWER)

    public int getEmpno() {
        return empno;
    }
    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordPlain() {
        return passwordPlain;
    }
    public void setPasswordPlain(String passwordPlain) {
        this.passwordPlain = passwordPlain;
    }

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "UsersDTO [empno=" + empno + ", username=" + username 
                + ", passwordPlain=" + passwordPlain 
                + ", role=" + role + "]";
    }
}
