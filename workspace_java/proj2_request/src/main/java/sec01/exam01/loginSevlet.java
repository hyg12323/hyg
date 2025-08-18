package sec01.exam01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/qulz/login")
public class loginSevlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    	

        System.out.println("login 실행");
        request.getRequestDispatcher("/qulz/login.html").forward(request, response);
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    	// 요청 할 때 한글 깨짐 방지
		response.setCharacterEncoding("utf-8;");
		
		//응답 할 때 한글 깨짐 방지
		response.setContentType("text/html;charset=utf-8;");
       

        String id = request.getParameter("id1");
        String pw = request.getParameter("pw1");

        System.out.println("login 실행 post");

        try {
//        	response.getWriter()
        	 PrintWriter out = response.getWriter() ;
        	
        	
//        	int n1 = Integer.parseInt(id);
//            int n2 = Integer.parseInt(pw);
              if(id == ""|| pw =="") {
            	  out.println("id 또는 비밀번호 확인바랍니다");
            	 System.out.println("id 또는 비밀번호 확인바랍니다");
            	  
            	  
//            	  System.out.println("비번"+pw);
              }
              else {
              System.out.println("id: " + id);
              System.out.println("pw: " + pw);
              }
              
//              response.sendRedirect(request.getContextPath() + "/qulz/login")
              
              
              if("admin".equals(id)&&"1234".equals(pw)) {
            	  response.sendRedirect(request.getContextPath() + "/qulz/admin.html");
            	  return;
              }
           
        } catch (Exception e) {
            e.printStackTrace();
        }

   
//        response.sendRedirect(request.getContextPath() + "/qulz/login.html");
    }
}
