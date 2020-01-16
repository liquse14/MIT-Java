package kr.mit.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OracleDbTest extends DBConnection {
	
	public static void main(String[] args) {
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			System.out.println("1");
			String query="SELECT * FROM EMP";
			conn=DBConnection.getConnection();
			System.out.println("2");
			
			//2.���� ����
			pstmt=conn.prepareStatement(query);
			System.out.println("3");
			
			//3.���� ����
			rs=pstmt.executeQuery();
			System.out.println("4");
			//4.���� ��� ó��
			System.out.println("������ȣ | �����̸� | ���� ������ | �Ի��� | ���� | ���� | �μ���ȣ");
			System.out.println("====================================================");
			
			while(rs.next()) {
				//1.�÷������� ����ϴ°��
				//int empno=rs.getInt("empno");
				//2.��ȣ�� ���
				int empno=rs.getInt(1);
				String ename=rs.getString(2);
				String job=rs.getString(3);
				int mgr=rs.getInt(4);
				java.sql.Date hiredate=rs.getDate(5);
				int sal=rs.getInt(6);
				int comm=rs.getInt(7);
				int deptno=rs.getInt(8);
				
				String result=empno+" "+ename+" "+job+" "+mgr+" "+hiredate+" "+sal+" "+comm+" "+deptno;
				System.out.println(result);
			}
			
			
		}catch(SQLException se) {
			System.out.println("���������� ���� �߻��߽��ϴ�.");
			se.printStackTrace();
		}finally {
			//5.���� ���� ����
			try {
				if(rs !=null) {
					rs.close();
				}if(pstmt !=null) {
					pstmt.close();
				}if(conn !=null) {
					conn.close();
				}
			}catch(Exception e) {
				throw new RuntimeException(e.getMessage());
			}
		}
	
	}

}