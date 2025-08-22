package emp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.dto.EmpDTO;
import emp.service.EmpService;


@WebServlet("/edit")
public class EmpEditController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
   

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 request.setCharacterEncoding("utf-8");
	       response.setContentType("text/html;charset=utf-8");
		
		   
		   // string으로 받고 -> if null != 라면 int 변환
		   // 파라메터 empno를 int로 형변환
		   int empno = 0;
		   try {
		
			   String sEmpno = request.getParameter("empno");
			   if(sEmpno != null) {
				 empno =  Integer.parseInt(sEmpno);
			   }
			   
		   }catch (Exception e) {
			   e.printStackTrace();
		   }
		   
		   EmpDTO empDTO = new EmpDTO();
		   empDTO.setEmpno(empno);
		   
		   //DB 다녀와서 출력하기
		   try {
			   
			   EmpService empService = new EmpService();
	         EmpDTO empDTO2 = empService.getOneEmp(empDTO);	
	         
	         PrintWriter out = response.getWriter();
	         
//	         System.out.println(empno);
	         out.println("<form method='post' action='edit'>");
	         out.println("<table border=1>");
	         out.println("  <tr><td>empno</td><td><input type='hidden' name='empno' value='"+ empDTO2.getEmpno() +"'>"+ empDTO2.getEmpno() +"</td></tr>");
	         out.println("  <tr><td>ename</td><td><input type='text' name='ename' value='"+ empDTO2.getEname() +"'></td></tr>");
	         out.println("  <tr><td>job</td><td><input type='text' name='job' value='"+ empDTO2.getJob() +"'></td></tr>");
	         out.println("  <tr><td>mgr</td><td><input type='text' name='mgr' value='"+ empDTO2.getMgr() +"'></td></tr>");
	         out.println("  <tr><td>hiredate</td><td><input type='date' name='hiredate' value='"+ empDTO2.getHiredate() +"'></td></tr>");
	         out.println("  <tr><td>sal</td><td><input type='text' name='sal' value='"+ empDTO2.getSal() +"'></td></tr>");
	         out.println("  <tr><td>comm</td><td><input type='text' name='comm' value='"+ empDTO2.getComm() +"'></td></tr>");
	         out.println("  <tr><td>deptno</td><td><input type='text' name='deptno' value='"+ empDTO2.getDeptno() +"'></td></tr>");
	         out.println("</table>");
	         out.println("  <input type='submit' value='수정완료'>");
	         out.println("</form>");
	         
		   }catch(Exception e) {
			   e.printStackTrace();
		   }
		   
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
