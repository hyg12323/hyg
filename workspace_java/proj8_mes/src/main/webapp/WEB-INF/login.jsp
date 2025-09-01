<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
    <h2>MES 로그인</h2>
    <form method="post" action="login">
        <input type="text" name="username" placeholder="아이디" required><br>
        <input type="password" name="password" placeholder="비밀번호" required><br>
        <button type="submit">로그인</button>
    </form>

  <c:if test="${not empty errorMsg}">
    <p style="color:red;">${errorMsg}</p>
</c:if>
</body>
</html>
