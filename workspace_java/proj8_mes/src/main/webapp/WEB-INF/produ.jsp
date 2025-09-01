<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>생산지시 목록</title>
</head>
<body>

<h2>생산지시 목록</h2>
<table border="1">
  <tr>
    <th>ID</th>
    <th>제품명</th>
    <th>목표수량</th>
    <th>마감일</th>
    <th>상태</th>
    <th>등록일</th>
  </tr>

  <c:forEach var="order" items="${orders}">
    <tr>
      <td>${order.po_id}</td>
      <td>${order.product_name}</td>
      <td>${order.target_qty}</td>
      <td>${order.due_date}</td>
      <td>${order.status}</td>
      <td>${order.created_at}</td>
    </tr>
  </c:forEach>
</table>

</body>
</html>
