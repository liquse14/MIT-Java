<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="create.jsp" method="get">
	�Է³��� <br>
	����:<input type="text" name="date"> <br>
	����:<input type="text" name="content"> <br>
	�ݾ�:<input type="number" name="money"><br>
	<input type="radio" name="select" value="in">����
	<input type="radio" name="select" value="out">����
	<input type="submit" value="Ȯ��">
</form>
</body>
</html>