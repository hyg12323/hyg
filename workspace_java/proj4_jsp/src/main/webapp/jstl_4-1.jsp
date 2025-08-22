<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
pageScope : ${pageScope.game }<br>
requestScope : ${requestScope.game }<br>
sessionScope : ${sessionScope.game }<br>
applicationScope : ${applicationScope.game }<br>


<%-- -- <jsp:forward page="jstl_4-1.jsp" />  --%>
<hr>
<c:if test="${true}">
   항상 참 <br>
</c:if>

<c:if test="${a eq 10 }">
      a는 10이 맞습니다 
</c:if>


<%-- <c:if test="${a eq 10 }"> --%>

<c:if test="${ not(a eq 10) }">
      a는 10이 아닙니다 
 
</c:if>

<c:choose>
    <c:when  test="a eq 8">
    a는 8입니다
    </c:when>
   
   
   <c:when  test="a eq 9">
    a는 9입니다
    </c:when>
    
    <c:otherwise>
    a는 8이나 9가 아닙니다
    </c:otherwise>
    </c:choose>
    
</c:choose>




</body>
</html>