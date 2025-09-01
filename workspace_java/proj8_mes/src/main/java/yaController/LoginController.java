package yaController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import yaDTO.UsersDTO;
import yaService.LoginService;

@WebServlet("/login")
public class LoginController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private LoginService loginService = new LoginService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // WEB-INF/login.jsp 로 forward
        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        UsersDTO user = loginService.login(username, password);

        if (user != null) {
            HttpSession session = request.getSession();
            session.setAttribute("loginUser", user);

            if ("ADMIN".equalsIgnoreCase(user.getRole())) {
                response.sendRedirect(request.getContextPath() + "/admin/main.jsp");
            } else {
                response.sendRedirect(request.getContextPath() + "/main.jsp");
            }
        } else {
            request.setAttribute("errorMsg", "아이디 또는 비밀번호가 올바르지 않습니다.");
            // 실패 시에도 절대경로 지정
            request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }
    }
}

