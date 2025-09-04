package yaDAO;

import java.sql.*;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import yaDTO.UserDTO;

public class LoginDAO {

    private DataSource ds;

    public LoginDAO() {
        try {
            Context init = new InitialContext();
            ds = (DataSource) init.lookup("java:comp/env/jdbc/oracle");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // name 컬럼을 "비밀번호"로 사용
    public UserDTO login(int userId, String nameAsPassword) {
    	final String sql =
    		    "SELECT user_id, name, role, created_at, updated_at " +
    		    "FROM \"USER\" " +                        // ← 큰따옴표
    		    "WHERE user_id = ? AND name = ?";

        try (Connection conn = ds.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, userId);
            ps.setString(2, nameAsPassword);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    UserDTO user = new UserDTO();
                    user.setUser_id(rs.getInt("user_id"));
                    user.setName(rs.getString("name"));
                    user.setRole(rs.getString("role"));
                    // 요청대로 "비밀번호를 name으로" 쓰는 컨벤션을 반영하고 싶다면:
                    user.setPassword(rs.getString("name")); // (권장X, 필요시만)

                    // DTO가 java.sql.Date 사용 중이므로 getDate 사용
                    user.setCreated_at(rs.getDate("created_at"));
                    user.setUpdated_at(rs.getDate("updated_at"));
                    return user;
                }
            }
//            System.out.println();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null; // 로그인 실패
    }
}



