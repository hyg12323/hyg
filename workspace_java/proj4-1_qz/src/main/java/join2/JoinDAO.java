package join;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import join.JoinDTO;

public class JoinDAO {
    private Connection getConn() {
        Connection conn = null;

        try {
            // JNDI : 글씨로 뭔가를 가져오는 방식
            Context ctx = new InitialContext();

            DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
            conn = dataFactory.getConnection();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return conn;
    }

   
    public List<JoinDTO> selectAllEmp() {
        List<JoinDTO> list = new ArrayList<JoinDTO>();

        
        return list;
    }
}