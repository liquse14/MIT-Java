<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   안녕하세요 
<!--  HTML 주석 -->
<%-- JSP 주석입니다. --%>
<% 
// 이건 그냥 자바 주석 그대로 사용

//

/* */

%>
<%=str %> <%--"JSP 스터디" --%>
<%=checkstr() %> <%-- ok --%>

<%= num +9 %>
<%@ include file="footer.jsp" %>
<%! private String str ="JSP 스터디";
     public String checkStr(){
    	 if(str ==null) return "no";
    	 else return "ok";
     }
%>
</body>
</html>