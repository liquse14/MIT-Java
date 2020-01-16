package ch1;

import java.util.Random;
import java.util.Scanner;

public class random3 {

	public static void main(String[] args) {
		Random rand = new Random();
		int user;
		Scanner scan = new Scanner(System.in);
		do {
			int num = rand.nextInt(10) + 1; // 1~10사이의 숫자를 선택
			System.out.println("랜덤값은" + num);

			System.out.println("1은 홀수,2는 짝수,0은 종료 입력해라:");
			user = scan.nextInt();
			if(user==0) break;
			
			if (num % 2 == 0 && user == 2 || (num % 2 != 0 && user == 1)) {
				System.out.println("정답");
			} else {
				System.out.println("오답");
			}
		} while (true);
		scan.close();

	}
}