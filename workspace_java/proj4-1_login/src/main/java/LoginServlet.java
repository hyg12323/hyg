import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/loginCheck")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // 입력값 받기
        String ename = request.getParameter("ename"); // id
        String sEmpno = request.getParameter("empno"); // pw
        int empno = Integer.parseInt(sEmpno);

        // DTO에 담기
        EmpDTO dto = new EmpDTO();
        dto.setEname(ename);
        dto.setEmpno(empno);

        // DAO 호출
        EmpDAO dao = new EmpDAO();
        EmpDTO resultDTO = dao.getEmp(dto);

        if (resultDTO == null) {
            // 로그인 실패 → 다시 로그인 화면
            response.sendRedirect(request.getContextPath() + "/login.jsp?msg=1");
        } else {
            // 로그인 성공
            HttpSession session = request.getSession();
            session.setAttribute("dto", resultDTO);

            // 전체 회원목록 가져오기
            List<EmpDTO> list = dao.selectAll();
            request.setAttribute("list", list);

            // forward → request 값 유지
            request.getRequestDispatcher("list.jsp").forward(request, response);
        }
    }
}
