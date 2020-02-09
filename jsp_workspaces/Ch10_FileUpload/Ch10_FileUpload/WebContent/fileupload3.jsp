<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <form action="fileuploadcheck.jsp" method="post" enctype="multipart/form-data">
  <input type="hidden" name="name"><br>
  <input type="hidden" name="subject"><br>
  <input type="hidden" name="filename1"><br>
  <input type="hidden" name="ofile1"><br>
  <input type="hidden" name="filename2"><br>
  <input type="hidden" name="ofile2"><br>
  <input type="submit" value="업로드 확인 및 다운로드"><br>
 </form>
</body>
</html>