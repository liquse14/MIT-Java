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
		System.out.println("�ǵ��� �Է�");
		user2 = scan.nextInt();
		do {
			int num = rand.nextInt(10) + 1; // 1~10������ ���ڸ� ����
			System.out.println("1�� Ȧ��,2�� ¦��,0�� ���� �Է��ض�:");
			user = scan.nextInt();

			if (user == 0)
				break;

			if (num % 2 == 0 && user == 2 || (num % 2 != 0 && user == 1)) {
				sum += user2;
				System.out.println("����");
			} else {
				sum -= user2;
				System.out.println("����");
			}
			System.out.println("���� �ǵ�:" + sum);
		} while (true);
		scan.close();

	}
}