package ch1;

import java.util.Scanner;

public class DaysinMonth {

	public static void main(String[] args) {
		//사용자로부터 달을 입력받아서 그 달에 해당하는 일수를 출력하시오
		//31일:1,3,5,7,8,10,12/28일:2/30일2,4,6,11
		//단 swich문으로
		Scanner scan=new Scanner(System.in);
		System.out.println("월 입력");
		int num=scan.nextInt();
		
		switch(num) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31일");
			break;
		case 2:
			System.out.println("28일");
			break;
		default:
			System.out.println("30일");
			break;
	}

}
}