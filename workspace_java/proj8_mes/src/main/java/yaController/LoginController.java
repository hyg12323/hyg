package yaController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import yaDTO.UserDTO;
import yaService.LoginService;

@WebServlet("/login")
public class LoginController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private final LoginService loginService = new LoginService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");

        // 폼에서 <input name="id">, <input name="name"> 로 전달된다고 가정
        String idParam = request.getParameter("id");
        String nameAsPassword = request.getParameter("name");

        int userId = 0;
        try {
            userId = Integer.parseInt(idParam);
        } catch (Exception e) {
            userId = 0;
        }

        UserDTO user = loginService.login(userId, nameAsPassword);

        if (user != null) {
            HttpSession session = request.getSession();
            session.setAttribute("loginUser", user);

            // ✅ 관리자/일반 구분 없이 항상 대시보드로
            response.sendRedirect(request.getContextPath() + "/dashboard.jsp");
        } else {
            request.setAttribute("errorMsg", "아이디 또는 비밀번호가 올바르지 않습니다.");
            request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }
    }
}
