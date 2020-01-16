package ch1;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		//윤년 판단프로그램
		//연도가 4로 나누어 떨어지면 윤년이다.
		//100으로 나누어 떨어지는 연도는 제외한다.
		//400으로 나누어 떨어지는 연도는 윤년이다.
		//사용자로부터 연도를 입력받아 윤년인지 알려주는 프로그램
		//연도를 입력하시오:______
		//_____년은 윤년입니다./______년은 윤년이 아닙니다.
		Scanner scan=new Scanner(System.in);
		
		System.out.println("년도 입력");
		int year=scan.nextInt();
		
//		if((year%4==0 && year%100 !=0) ||year%400==0) {
//			System.out.println(year+"은 윤년");
//		}
//		else {
//			System.out.println(year+"은 윤년아님");
//		}
		if(year%400==0) {
			System.out.println(year+"는 윤년이다.");
		}
		else if(year % 100==0)
			System.out.println(year+"는 윤년아님");
		else if(year %4 ==0)
			System.out.println(year+"는 윤년이다");
		else System.out.println(year+"는 윤년아님");
	}

}
