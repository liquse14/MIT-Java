<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
   Enumeration e = request.getHeaderNames();
   while(e.hasMoreElements()){
	   String headerName=(String)e.nextElements();
	   String headerValue =request.getHeader(headerName);
	   %>
   }
   
 <%=headerName%> %nbsp;<%=headerValue%><br>

<% } %>

<br>
<%=request.getServerPort()%>
<%=request.getRemoteAddr()%>
<%=response.sendRedirect("requestTest1_Form.jsp")%>

</body>
</html>