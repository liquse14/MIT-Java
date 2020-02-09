e<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <%
      Cookie cookie =new Cookie("name","hongkildong");
      cookie.setMaxAge(600);
      response.addCookie(cookie);
 
 
 %>
 <%=cookie.getName() %><br>
 <%=cookie.getValue() %><br>
 <%=cookie.getMaxAge() %><br>
 <a href ="cookieTest2.jsp"> 쿠키 값 불러오기</a>
</body>
</html>