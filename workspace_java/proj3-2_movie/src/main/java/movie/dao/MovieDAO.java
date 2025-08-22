package movie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import movie.dto.MovieDTO;

public class MovieDAO {

    // DB 연결
    private Connection getConnection() {
        Connection conn = null; 
        try {
            Context ctx = new InitialContext();
            DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
            conn = dataFactory.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    
    // 전체 조회
    public List<MovieDTO> selectAllMovie() {
        List<MovieDTO> list = new ArrayList<>();
        
        try {
            // DB 접속
            Connection conn = getConnection();
            
            // SQL 준비
            String query = "select * from movie";   
            PreparedStatement ps = conn.prepareStatement(query);
            
            // SQL 실행
            ResultSet rs = ps.executeQuery();
            
            // 결과 활용
            while (rs.next()) {
                MovieDTO dto = new MovieDTO();
                
                
                dto.setMovie_id(rs.getInt("movie_id"));       
                dto.setTitle(rs.getString("title"));         
                dto.setImg_url(rs.getString("setimg_url"));  
                dto.setOpen_date(rs.getDate("open_date"));            
                
                list.add(dto);
            }
            
            rs.close();
            ps.close();
            conn.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
}
