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
	입력내용 <br>
	일자:<input type="text" name="date"> <br>
	내용:<input type="text" name="content"> <br>
	금액:<input type="number" name="money"><br>
	<input type="radio" name="select" value="in">수입
	<input type="radio" name="select" value="out">지출
	<input type="submit" value="확인">
</form>
</body>
</html>