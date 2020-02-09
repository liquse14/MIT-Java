<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>파일 업로드 폼</h2>
  <form action="fileupload.jsp" method="post" enctype="multipart/form-data">
     올린사람:<input type="text" name="name"><br>
     제목:<input type="text" name="subject"><br>
    파일명1:<input type="file" name="filename1"><br>
    파일명2:<input type="file" name="filename2"><br>
        <input type="submit" value="전송"><br>
        </form>
</body>
</html>