package kr.mit.mariadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MariaDbTest {

	public static void main(String[] args) throws ClassNotFoundException{
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection conn=null;
			ResultSet rs=null;
			conn=DriverManager.getConnection(
					"jdbc:mariadb://localhost:3306",
					/*"jdbc:mariadb://localhost:3306/db¸í",*/
					"root",
					"mariadb"
					);
			java.sql.Statement stmt=conn.createStatement();
			rs=stmt.executeQuery("show databases");
			while(rs.next()) {
				String str=rs.getNString(1);
				System.out.println(str);
			}
		}catch(SQLException se) {
			se.printStackTrace();
		}

	}

}
