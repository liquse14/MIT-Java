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
	현상태
	<table border="1">
	<tr>
		<th>순번</th><th>일자</th><th>내용</th><th>수입</th><th>지출</th>
	</tr>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	int inMoney=0;
	int outMoney=0;
	int Money=0;
	if(id.equals("admin") && pw.equals("1234")){ //성공했을때
	
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection conn=DriverManager.getConnection(
					"jdbc:mariadb://localhost:3306/javadb",
					"java","1234");
			System.out.println("DB연결성공");
			Statement stmt =conn.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT SUM(`in`)  FROM table_pocketmoneydiary");
			rs.next();
			inMoney=rs.getInt(1);
			System.out.println("총수입:" + inMoney);
			
			rs=stmt.executeQuery("SELECT SUM(`out`)  FROM table_pocketmoneydiary");
			rs.next();
			outMoney=rs.getInt(1);
			System.out.println("총지출:" + outMoney);
			
			rs=stmt.executeQuery("select SUM(`in`)-SUM(`out`) FROM table_pocketmoneydiary");
			rs.next();
			Money=rs.getInt(1);
			System.out.println("현재잔액:" + Money);
			
			rs=stmt.executeQuery("SELECT * FROM table_pocketmoneydiary ORDER BY NO DESC");
			while(rs.next()) {
				String no=rs.getString("no");
				String date=rs.getString("date");
				String content=rs.getString(3);
				String in=rs.getString(4);
				String outM=rs.getString(5);
				System.out.println(no + date + content + in + outM); %>
		
				<tr>
					<td><%=no %> </td><td><%=content %></td><td><%=date %> </td>
					<td><%=in %></td><td><%=outM %></td>
				</tr>
				
		
		<% 	}
			
		} catch (Exception e) {
			System.out.println("DB연결실패");
			e.printStackTrace();
		}
	
	
	
	%>
	</table>
	총수입:<%=inMoney %> <br>
	총지출:<%=outMoney %> <br>
	현재잔액:<%=Money %> <br>
	<a href="input.jsp"><button>입력</button></a>	

<% 	}else{ %>
		로그인 정보를 확인해 주세요.
		<a href="index.html"><button>다시로그인하기</button></a>
<% } %>

</body>
</html>


