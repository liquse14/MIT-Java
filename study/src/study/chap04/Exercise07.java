package study.chap04;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;	// 잔액
		int menu;			// 메뉴
		int value;			// 예금액, 출금액
		Scanner scanner = new Scanner(System.in);
		while(run) {
			System.out.println("--------------------------");
			System.out.println("1.예금 | 2.출금, 3.잔고 | 4.종료");
			System.out.println("--------------------------");
			System.out.print("선택> ");
			
			// 작성 위치
			menu = scanner.nextInt();
			if(menu == 1) {	// 예금
				System.out.print("예금액>");
				value = scanner.nextInt();
				balance += value;
			} else if(menu == 2) {	// 출금
				System.out.print("출금액>");
				value = scanner.nextInt();
				if(balance > value)
					balance -= value;
				else	// 잔고 부족
					System.out.println("잔고 부족 : " + balance);
			} else if(menu == 3) {	// 잔고
				System.out.println("잔고>" + balance);
			} else if(menu == 4) {	// 종료
				run = false;
			} else {	// 메뉴 안내
				System.out.println("올바른 메뉴를 입력 하세요 : " + menu);
			}
		}
		System.out.println("프로그램 종료");
	}

}
