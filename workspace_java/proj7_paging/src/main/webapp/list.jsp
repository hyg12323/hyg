<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
       PrintWriter out = response.getWriter();
		
		out.println("<table border=1>");
		out.println("  <tr>");
		out.println("       <th>empno</th>");
		out.println("       <th>ename</th>");
		out.println("       <th>sal</th>");
		out.println("</tr>");
		
		
		
		for(EmpDTO dto : list) {
			System.out.println(dto);
			
			out.println("<tr>");
			out.println("      <td>"+ dto.getEmpno() +"</td>");
			out.println("      <td><a href='detail?empno=" + dto.getEmpno() + "'>" + dto.getEname() + "</a></td>");
			out.println("      <td>"+ dto.getSal() +"</td>");
			out.println("</tr>");
		
			
			
		}
		out.println("</table>");
</body>
</html>