<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%request.setCharacterEncoding("UTF-8");%>
Request 예제입니다.<br>
이름  <%=request.getParameter("name")%><br>
성별  <%String gender =request.getParameter("gender");
     if(gender.equals("male")){ %>
    	 남자
    	 <%else{ %>
    	 여자
    	 <% }%>
  취미
  <%
  String[] hobby=request.getParameterValues("hobby");
  for(int i=0; i<hobby.length; i++){%>
  <%=hobby[i]%>&nbsp;&nbsp;
	  <%} %>
  
  
</body>
</html>