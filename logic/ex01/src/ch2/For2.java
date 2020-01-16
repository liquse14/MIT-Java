package ch2;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		// 사용자로부터 숫자를 입력받아 1부터 입력받은 수만큼 더해서 출력하는 프로그램
		// 예> 100을 입력받으면
		// 출력은 5050이라고 나와야
		// 1.사용자로부터 숫자를 입력받는다.
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자입력");
		int num = scan.nextInt();

		int sum = 0;
		// 2.입력받은 숫자를 이용해서 계산한다.
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		// 3.계산된 숫자를 출력한다.
		System.out.println("총합" + sum);

	}

}
