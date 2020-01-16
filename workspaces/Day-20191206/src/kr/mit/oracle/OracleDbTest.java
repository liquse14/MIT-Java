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
			
			//2.상태 정보
			pstmt=conn.prepareStatement(query);
			System.out.println("3");
			
			//3.쿼리 실행
			rs=pstmt.executeQuery();
			System.out.println("4");
			//4.쿼리 결과 처리
			System.out.println("직원번호 | 직원이름 | 직무 관리자 | 입사일 | 봉급 | 수당 | 부서번호");
			System.out.println("====================================================");
			
			while(rs.next()) {
				//1.컬럼명으로 사용하는경우
				//int empno=rs.getInt("empno");
				//2.번호로 사용
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
			System.out.println("쿼리문에서 예외 발생했습니다.");
			se.printStackTrace();
		}finally {
			//5.연결 상태 닫음
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