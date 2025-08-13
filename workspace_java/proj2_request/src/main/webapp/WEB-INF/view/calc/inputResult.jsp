<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h1>계산결과</h1> 
   
<%--    ${param.num1} --%>

결과 : 
<Strong>
<%

   int num3 = (int)request.getAttribute("number3");
  out.println(num3);

%>

</Strong>




</body>
</html>