import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class EmpDAO {
	
	// DB 접속 
	private Connection getConn() {
		Connection  conn = null;
		try {
			Context ctx = new InitialContext();
			DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			conn = dataFactory.getConnection();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	// 로그인할 때 1명 조회
	public EmpDTO getEmp(EmpDTO dto) {
		EmpDTO resultDTO = null;
		try {
			Connection conn = getConn();
			String query = "select * from emp2 where empno = ? and ename = ?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, dto.getEmpno());
			ps.setString(2, dto.getEname());

			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				resultDTO = new EmpDTO();
				resultDTO.setEmpno(rs.getInt("empno"));
				resultDTO.setEname(rs.getString("ename"));
			}

			rs.close();
			ps.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return resultDTO;
	}

	// 전체 목록 조회
	public List<EmpDTO> selectAll() {
		List<EmpDTO> list = new ArrayList<>();

		try {
			Connection conn = getConn();
			String query = "select * from emp2";   // 전체 조회이므로 WHERE 조건 없음
			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				EmpDTO resultDTO = new EmpDTO();
				resultDTO.setEmpno(rs.getInt("empno"));
				resultDTO.setEname(rs.getString("ename"));
				resultDTO.setJob(rs.getString("job"));
				resultDTO.setMgr(rs.getInt("mgr"));
				list.add(resultDTO);
			}

			rs.close();
			ps.close();
			conn.close();

		}catch(Exception e) {
			e.printStackTrace();
		}

		return list;  // ✅ 리스트 전체 반환
	}
}
