<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%  request.getParameter("UTF-8");%>
    올린사람:<%=request.getParameter("name") %>
    제목:<%=request.getParameter("subject") %>
    <% 
    String fileName1=request.getParameter("filename1");
    fileName1= URLEncoder.encode(fileName1,"UTF-8");
    String fileName2=request.getParameter("filename2");
    fileName2= URLEncoder.encode(fileName2,"UTF-8");
    
    %>
   파일명1:<a href ="file_down.jsp?file_name=<%=fileName1 %>"><%=request.getParameter("ofile1") %></a>
  파일명2::<a href ="file_down.jsp?file_name=<%=fileName2 %>"><%=request.getParameter("ofile2") %></a>
        
  
</body>
</html>