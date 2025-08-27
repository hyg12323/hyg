package emp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.dto.EmpDTO;
import emp.service.EmpService;

@WebServlet("/list")
public class EmpListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/list doGet 실행");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String sPagePerRows = request.getParameter("size");
		String sPage = request.getParameter("page");
		
		
		int pagePerRows = 10;
		int page = 1;
		try {
			pagePerRows = Integer.parseInt(pagePerRows);
			page = Integer.parseInt(sPage);
		}catch(Exception e) {
		  e.printStackTrace();
		
		}
		
		EmpDTO dto = new EmpDTO();
		dto.setPagePerRows(pagePerRows);
		dto.setPage(page);
			
		// DB 조회
		EmpService empService = new EmpService();
		List<EmpDTO> list = empService.getAllEmp();
		
		request.setAttribute("list", list);
		List<EmpDTO> list = empService.getAllEmp();
		/////////////////////////////////////////////////
		// 화면에 출력(응답 정적 자원 만들기)
//		PrintWriter out = response.getWriter();
//		
//		out.println("<a href='signup.html'>회원가입</a>");
//		out.println("<table border=1>");
//		out.println("	<tr>");
//		out.println("		<th>empno</th>");
//		out.println("		<th>ename</th>");
//		out.println("		<th>sal</th>");
//		out.println("	</tr>");
//		for(EmpDTO dto : list) {
//			System.out.println(dto);
////			
//			out.println("<tr>");
//			out.println("	<td>"+ dto.getEmpno() +"</td>");
//			out.println("	<td><a href='detail?empno="+ dto.getEmpno() +"'>"+ dto.getEname() +"</a></td>");
//			out.println("	<td>"+ dto.getSal() +"</td>");
//			out.println("</tr>");	
//		}
//		out.println("</table>");
		
	}

}
