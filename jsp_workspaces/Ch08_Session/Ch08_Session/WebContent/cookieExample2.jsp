<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
  Cookie cookie =new Cookie("language",request.getParameter("language"));
  cookie.setMaxAge(60*60 *24);
  response.addCookie(cookie);
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
     쿠키 저장완료
  <a href= cookieExample1.jsp>설정화면으로 돌아가기</a>
</body>
</html>