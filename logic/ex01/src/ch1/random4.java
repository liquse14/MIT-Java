package ch1;

import java.util.Random;
import java.util.Scanner;

public class random4 {

	public static void main(String[] args) {
		Random rand = new Random();
		int user;
		int user2;
		Scanner scan = new Scanner(System.in);
		int sum = 0;			
		System.out.println("판돈을 입력");
		user2 = scan.nextInt();
		do {
			int num = rand.nextInt(10) + 1; // 1~10사이의 숫자를 선택
			System.out.println("1은 홀수,2는 짝수,0은 종료 입력해라:");
			user = scan.nextInt();

			if (user == 0)
				break;

			if (num % 2 == 0 && user == 2 || (num % 2 != 0 && user == 1)) {
				sum += user2;
				System.out.println("정답");
			} else {
				sum -= user2;
				System.out.println("오답");
			}
			System.out.println("현재 판돈:" + sum);
		} while (true);
		scan.close();

	}
}