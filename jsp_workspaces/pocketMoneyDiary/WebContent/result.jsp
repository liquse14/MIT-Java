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
	������
	<table border="1">
	<tr>
		<th>����</th><th>����</th><th>����</th><th>����</th><th>����</th>
	</tr>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	int inMoney=0;
	int outMoney=0;
	int Money=0;
	if(id.equals("admin") && pw.equals("1234")){ //����������
	
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection conn=DriverManager.getConnection(
					"jdbc:mariadb://localhost:3306/javadb",
					"java","1234");
			System.out.println("DB���Ἲ��");
			Statement stmt =conn.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT SUM(`in`)  FROM table_pocketmoneydiary");
			rs.next();
			inMoney=rs.getInt(1);
			System.out.println("�Ѽ���:" + inMoney);
			
			rs=stmt.executeQuery("SELECT SUM(`out`)  FROM table_pocketmoneydiary");
			rs.next();
			outMoney=rs.getInt(1);
			System.out.println("������:" + outMoney);
			
			rs=stmt.executeQuery("select SUM(`in`)-SUM(`out`) FROM table_pocketmoneydiary");
			rs.next();
			Money=rs.getInt(1);
			System.out.println("�����ܾ�:" + Money);
			
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
			System.out.println("DB�������");
			e.printStackTrace();
		}
	
	
	
	%>
	</table>
	�Ѽ���:<%=inMoney %> <br>
	������:<%=outMoney %> <br>
	�����ܾ�:<%=Money %> <br>
	<a href="input.jsp"><button>�Է�</button></a>	

<% 	}else{ %>
		�α��� ������ Ȯ���� �ּ���.
		<a href="index.html"><button>�ٽ÷α����ϱ�</button></a>
<% } %>

</body>
</html>


