package ch2;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// 을 입력할때까지 합계 구하기
		// 정수를 입력하세요:34
		// 지금까지 입력한수의 합은 34 입니다.

//		Scanner scan = new Scanner(System.in);
//		int sum = 0;
//		int num;
//
//		do {
//			System.out.println("정수를 입력하세요");
//			num = scan.nextInt();
//			if (num == 0) {
//				break;
//			}
//			sum += num;
//			System.out.println("합" + sum);
//		} while (true);
//		System.out.println("총합" + sum);
//	}
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int num;

		do {
			System.out.println("정수를 입력하세요");
			num = scan.nextInt();

			sum += num;
		} while (num!=0);
		System.out.println("총합" + sum);
	}

}
