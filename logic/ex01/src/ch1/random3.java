package ch1;

import java.util.Random;
import java.util.Scanner;

public class random3 {

	public static void main(String[] args) {
		Random rand = new Random();
		int user;
		Scanner scan = new Scanner(System.in);
		do {
			int num = rand.nextInt(10) + 1; // 1~10������ ���ڸ� ����
			System.out.println("��������" + num);

			System.out.println("1�� Ȧ��,2�� ¦��,0�� ���� �Է��ض�:");
			user = scan.nextInt();
			if(user==0) break;
			
			if (num % 2 == 0 && user == 2 || (num % 2 != 0 && user == 1)) {
				System.out.println("����");
			} else {
				System.out.println("����");
			}
		} while (true);
		scan.close();

	}
}