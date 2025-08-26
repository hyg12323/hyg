<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 목록</title>
</head>
<body>

dto : ${dto} <br>
\${empty dto} : ${empty dto} <br>

<c:if test="${empty dto}">
    <c:redirect url="login.jsp"/>
</c:if>

<h1>회원 목록</h1>

<c:if test="${dto.job eq 'PRESIDENT'}">
  [관리자]
</c:if>
[${dto.ename}]님 반갑습니다 <br>
<a href="logout">로그아웃</a>

<br><br>

<table border="1">
  <tr>
    <th>empno</th>
    <th>ename</th>
    <th>job</th>
    <th>mgr</th>
    <th>비고</th>
  </tr>

  <c:forEach var="dto" items="${list}">
    <tr>
      <td>${dto.empno}</td>
      <td>${dto.ename}</td>
      <td>${dto.job}</td>
      <td>${dto.mgr}</td>
      <td>
        <c:if test="${sessionScope.dto.empno eq emp.empno}">
          [수정]
        </c:if>
      </td>
    </tr>
  </c:forEach>
</table>

</body>
</html>
