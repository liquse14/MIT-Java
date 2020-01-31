package pocketMoneyDiary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MariaDB_Test {

	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection conn=DriverManager.getConnection(
					"jdbc:mariadb://localhost:3306/javadb",
					"java","1234");
			System.out.println("DB연결성공");
			Statement stmt =conn.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT SUM(`in`)  FROM table_pocketmoneydiary");
			rs.next();
			int inMoney=rs.getInt(1);
			System.out.println("총수입:" + inMoney);
			
			rs=stmt.executeQuery("SELECT SUM(`out`)  FROM table_pocketmoneydiary");
			rs.next();
			int outMoney=rs.getInt(1);
			System.out.println("총지출:" + outMoney);
			
			rs=stmt.executeQuery("select SUM(`in`)-SUM(`out`) FROM table_pocketmoneydiary");
			rs.next();
			int Money=rs.getInt(1);
			System.out.println("현재잔액:" + Money);
			
			rs=stmt.executeQuery("SELECT * FROM table_pocketmoneydiary ORDER BY NO DESC");
			while(rs.next()) {
				String no=rs.getString("no");
				String date=rs.getString("date");
				String content=rs.getString(3);
				String in=rs.getString(4);
				String out=rs.getString(5);
				System.out.println(no + date + content + in + out);
			}
			
			
			
			
			
		} catch (Exception e) {
			System.out.println("DB연결실패");
			e.printStackTrace();
		}
		
		
		
		

	}

}
