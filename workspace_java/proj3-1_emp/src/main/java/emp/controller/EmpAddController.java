package emp.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/EmpAddController")
public class EmpAddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private Integer empno;
	   private String ename;
	   private String job;
	   private Integer mgr;
	   private Date hiredate;
	   private int sal;
	   private Integer comm;
	   public Integer getEmpno() {
		return empno;
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
