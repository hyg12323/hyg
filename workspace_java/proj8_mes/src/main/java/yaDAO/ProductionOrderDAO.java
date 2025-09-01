package yaDAO;

import java.sql.*;
import java.util.*;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import yaDTO.Production_orderDTO;

public class ProductionOrderDAO {
    
    // DB 연결
    private Connection getConn() {
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

    // 생산지시 목록 조회
    public List<Production_orderDTO> getOrders() {
        List<Production_orderDTO> list = new ArrayList<>();
        String sql = "SELECT po_id, product_name, target_qty, due_date, status, created_at "
                   + "FROM production_order ORDER BY po_id DESC";
        try (Connection conn = getConn();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            
            while (rs.next()) {
                Production_orderDTO dto = new Production_orderDTO();
                dto.setPo_id(rs.getInt("po_id"));
                dto.setProduct_name(rs.getString("product_name"));
                dto.setTarget_qty(rs.getInt("target_qty"));
                dto.setDue_date(rs.getDate("due_date"));
                dto.setStatus(rs.getString("status"));
                dto.setCreated_at(rs.getDate("created_at"));

                // ✅ 디버깅 로그
                System.out.println("DEBUG ORDER: " + dto);

                list.add(dto);
            }
            System.out.println("DEBUG 총 건수: " + list.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}


