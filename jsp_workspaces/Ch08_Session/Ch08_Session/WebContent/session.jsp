<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>세션 테스트</h2>
<% 
   String name= "세션 값 없음"; //세션에 name 값이 있으면
   if(session.getAttribute("name") != null) {
	 name=(String)session.getAttribute("name");
	 
   } 
	   %>
<input type ="button"  onClick= "location.href='sessionSet.jsp'" value ="세션값 저장">
<input type ="button"  onClick= "location.href='sessionDel.jsp'" value ="세션값 삭제">
<input type ="button"  onClick= "location.href='sessionInvalidate.jsp'" value ="세션값 초기화">
<h3><%=name %>></h3>
	   
	   
	   <script>
	   location="sessionTest.jsp";
	   </script>
	   
	   
</body>
</html>