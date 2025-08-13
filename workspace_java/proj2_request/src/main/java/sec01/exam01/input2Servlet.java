package sec01.exam01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/input2Servlet")
public class input2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
  
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("input2 doGet 실행");
		
		

		// 요청 할 때 한글 깨짐 방지
		response.setCharacterEncoding("utf-8;");
		
		//응답 할 때 한글 깨짐 방지
		response.setContentType("text/html;charset=utf-8;");
		
		
		
		
		
		
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		
		try {
			int n1 = Integer.parseInt(num1);
			int n2 = Integer.parseInt(num2);
			
			int n3 = n1 + n2;
			System.out.println("n3:"+n3);
			
			request.setAttribute("number3", n3);
			
			int n4 = (int)request.getAttribute("number3");
			

			PrintWriter out = response.getWriter();
			out.println("<h1>NUM1"+n1+"</h1>");
			out.println("<h1>NUM2"+n2+"</h1>");
			out.println("<h1>SUM2"+n3+"</h1>");

			request.getRequestDispatcher("/WEB-INF/view/calc/inputResult.jsp").forward(request,response);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

	

}
