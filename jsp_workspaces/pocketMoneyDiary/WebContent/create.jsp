<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
try {
	Class.forName("org.mariadb.jdbc.Driver");
	Connection conn=DriverManager.getConnection(
			"jdbc:mariadb://localhost:3306/javadb",
			"java","1234");
	System.out.println("DB연결성공");
	PreparedStatement pstmt =
			conn.prepareStatement("INSERT IN TO table_pocketmoneydiary('date,'content','out')VALUES(?,?,?)");
	String date=request.getParameter("date"); //입력날짜
	String content=request.getParameter("content"); //내용
	String money=request.getParameter("money"); //금액
	String select=request.getParameter("select"); //수입 또는 지출
	if(select.equals("out")){
		pstmt =
				conn.prepareStatement("INSERT INTO table_pocketmoneydiary('date,'content','out')VALUES(?,?,?)");
	}else{
		pstmt =
				conn.prepareStatement("INSERT INTO table_pocketmoneydiary('date,'content','out')VALUES(?,?,?)");
	}
	  pstmt.setString(1,date);
	  pstmt.setString(2,content);
	  pstmt.setString(3,money);
	  int count=pstmt.executeUpdate();
}catch (Exception e) {
	System.out.println("DB연결실패");
	e.printStackTrace();
}
%>

입력완료
<form action="result.jsp" method="post">
	<input type="hidden" name="id" value="admin">
	<input type="hidden" name="pw" value="1234">
	<input type="submit" value="메인으로 돌아가기">
</form>



</body>
</html>




