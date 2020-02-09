<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>포워드된 페이지(forwardTest2.jsp)</h2>
<table>
  <tr>
  <td>이름</td>
  <td><%=request.getParameter("우정민") %></td>
  </tr>
  <tr>
   <td>나이</td>
  <td><%=request.getParameter("25") %></td>
  </tr>
  <tr>
   <td>주소</td>
  <td><%=request.getParameter("address") %></td>
   <td>전화번호</td>
  <td><%=request.getParameter("tel") %></td>
  </tr>
  </table>
  
</body>
</html>