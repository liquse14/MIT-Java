<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<jsp:useBean id ="beanTest" class ="test.BeanTest"  scope="page">
<jsp: setProperty id ="beanTest" property ="name"  value="bbb">
<%=String beanTest; %>
<%=beanTest.getName()%>
<%=beanTest.getName() %>
</body>
</html>