<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>JSTL</h1>
<c:set var="a" value = "10" />
\${ a } : ${ a } <br>

<%
       String name = "휴먼";
%>

\${ name } : ${ name } <br>


<c:set var="name2" value="<%= name %>" />
\${ name2 } : ${ name2 } <br>

<c:set var="name3" value ="${ a }" />
\${ name3 } : ${ name3 } <br>
<hr>
scope : page > request > session > application

<c:set var = "a1" value = "1" scope = "page" />
scope 생략하면 page<br>

<c:set var = "game" value = "LOL" scope = "page" />
<c:set var = "game" value = "마비노기" scope = "request" />
<c:set var = "game" value = "서든어택" scope = "session" />
<c:set var = "game" value = "세븐나이츠" scope = "application" />
\${game } : @{game} <br>

pageScope : ${pageScope.game }<br>
requestScope : ${requestScope.game }<br>
sessionScope : ${sessionScope.game }<br>
applicationScope : ${applicationScope.game }<br>

<%
  
    List list = new ArrayList();
    for(int i = 0; i<4; i++){
    	Map map = new HashMap();
    	map.put("제목", "노래" + i);   // 문자열 + 숫자 연결
    	map.put("가수", "가수" + i);
    	
    	list.add(map);
    }

%>
<c:set var="list2" value="<%= list%>" scope="page" />
그냥 첫번째 제목 : ${list[0].title }<br>


items <br>
<c:forEach var="song" items = "${list2}">
 title : ${song.title }<br>
 singer : ${song.singer }<br>
</c:forEach>

begin, end<br>
<c:forEach var="i" begin="0" end="5">
 title : ${i},${list[i].title }<br>
</c:forEach>

step <br>
<hr>
<c:forEach var="i" begin="0" end="5" step="2">
 title : ${i},${list[i].title }<br>
</c:forEach>
<hr>
varStatus<br>
<c:forEach var="i" begin="0" end="8"  step="2" varStatus="loop">
 ${i}<br>
 <c:if test="${not loop.last }">
 ,
 </c:if>
 <br>
 loop.index : ${loop.index} <br>
 loop.count : ${loop.count} <br>
 loop.first : ${loop.first} <br>
 loop.last :  ${loop.last} <br>
<br>
</c:forEach>

items, begin등 같이 사용<br>
<c:forEach var="song" items= "${list2}" begin= "2">
 ${song.title }
</c:forEach>
<hr>
<hr>

2~9단 까지 구구단 출력.5단은 출력하지 않기<br> 
<c:forEach var ="i" begin ="1" end ="9" >
  <c:forEach var ="e" begin ="1" end ="9" >
  
  
            ${i} x ${e} = ${i*e}
       <c:if test=" ${ not(i eq 5) }" >
       </c:if>>
       
       </c:forEach> 
</c:forEach>
<hr>
1.영어나  숫자나 한글이나 특수문자를 enconding 해줌
2. context path 자동 추가 (/proj4_jsp)<br>
3. 쿠기 금지일 때 ";jsessionid="를 자동으로 붙여줌<br>
<c:url var="urll" value="jsp_1.jsp">
<c:param name ="name" value="한글" />
</c:url>
<a href= "${url1 }" target="_blank">jsp_1.jsp</a>
<hr>
param.addr : ${param.addr}<br>
c:out :::: <c:out value="${param.addr }" /> <br>
특수 문자를 치환해서 문자 그 자체로 출력
<!-- 
     < : &lt;
     > : &gt;
    " ": &nbsp;(공백만들기)
     & : &amp;
  -->

</body>
</html>