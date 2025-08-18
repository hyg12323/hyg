package proj3_dbcp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class OracleDBCPExam {

	public static void main(String[] args) {
        try {
        	Connection conn = null;
//    		PreparedStatement ps = null;
    		ResultSet rs = null;
        	// JNDI 방식으로 
        	// context.xml에 있는 DB 정보를 가져온다
        	Context ctx = new InitialContext();
        	DataSource dataFactory = (DataSource)ctx.lookup("java:/comp/env/jdbc/oracle");
        	
        	Connection conn1 = dataFactory.getConnection();
        	
			String query = "select * from emp";
			PreparedStatement  ps = conn.prepareStatement(query);
//			ResultSet rs = null;
			
//			ps.execute
			
			
			// SQL 실행 및 결과 확보
		    rs = ps.executeQuery();
			
			
			// 결과 활용

			while(rs.next()) {
				int empno = rs.getInt("empno");
				System.out.print(empno +",");
				String ename = rs.getString("ename");
				System.out.println(ename);
			}
			
			
        	
        	conn.close(); // 커넥션 풀로 반환
        	
        }catch(Exception e) {
        	e.printStackTrace();
        }
		
	}

}
