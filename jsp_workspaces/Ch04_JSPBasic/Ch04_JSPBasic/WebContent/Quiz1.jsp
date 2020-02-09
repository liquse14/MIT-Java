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
  int result =0;
  for(int i= 3; i <=500; i++){
	    if((i % 2) != 0){
           result +=i;	    	
	    }
  }   
  %>
  
  <b>3부터 500까지</b>
     홀수를 더한 값은 <%=result %> 입니다.
</body>
</html>