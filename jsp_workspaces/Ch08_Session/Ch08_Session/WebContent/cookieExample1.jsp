<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String Cookie= request.getHeader("Cookie");
    String language= "korea";
if(Cookie != null){
	Cookie cookie[]= request.getCookies();
    for(int i=0; i<cookie.length; i++){
    	String name= cookie[i].getName();
    	if(name.equals("language")){
    		language=cookie[i].getValue(); 		
    	}
    }
}
    
%>  
<html>
<head>
<meta charset="UTF-8">
<title>안녕하세요, 이것은 쿠키 예제입니다.</title>
</head>
<body>
   <%
    if(language.equals("korea")){%>
    <%}else{ %> 
    	<h1>Hello. This is example.</h1>
   <% } %>
   
  <form action="cookieExample2.jsp" method="post">
     한국어<input type="radio" name="language" value="korea"> <%if(language.equals("korea")) %>
     영어<input type="radio" name="language" value="english"> <%if(language.equals("english")) %>
   <input type="submit" value="설정"><br>
   </form>
</body>
</html>