package join;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login3")   // URL: http://localhost:8080/프로젝트명/memberList
public class JoinController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
      
        JoinDAO dao = new JoinDAO();
        List<JoinDTO> list = dao.selectAllEmp();

     
        request.setAttribute("list", list);

     
        request.getRequestDispatcher("/login.jsp").forward(request, response);
    }
}
