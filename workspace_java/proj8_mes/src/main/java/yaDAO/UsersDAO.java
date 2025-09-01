package yaDAO;

import java.sql.*;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import yaDTO.UsersDTO;

public class UsersDAO {

    private DataSource ds;

    public UsersDAO() {
        try {
            Context init = new InitialContext();
            ds = (DataSource) init.lookup("java:comp/env/jdbc/oracle");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public UsersDTO login(String username, String password) {
        UsersDTO user = null;
        String sql = "SELECT empno, username, password_plain, role "
                   + "FROM users WHERE username=? AND password_plain=?";
        try (Connection conn = ds.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                user = new UsersDTO();
                user.setEmpno(rs.getInt("empno"));
                user.setUsername(rs.getString("username"));
                user.setPasswordPlain(rs.getString("password_plain"));
                user.setRole(rs.getString("role"));
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}




