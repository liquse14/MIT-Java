package ch1;

import java.util.Random;
import java.util.Scanner;

public class random5 {

	public static void main(String[] args) {
		Random rand = new Random();
		int user = 0;
		int user2 = 0;
		int user3 = 0;
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int avg = 0;
		int avg2 = 0;
		int a = 0;
		int b = 0;
		int i = 0;
		int j = 0;
		int z = 0;

		int num = rand.nextInt(2) + 1;
		System.out.println("1~3�߿� �ϳ� ��");
		user = scan.nextInt();

		do {
			
			if (user == num) {
				System.out.println("���� ���ſ��� Ȥ�� �ٸ��� ����(���� ���ŷ� ���ٸ� �������ڷ�)");
				user2 = scan.nextInt();

				a++;
			}
			if (user != num) {
				System.out.println("�ٸ��ų� ���� ������ ����");
				user3 = scan.nextInt();

				b++;
			}

			avg += a;
			avg2 += b;
			z=a+b;
		} while (z<=10 );

		i = avg / 100;
		j = avg2 / 100;
		System.out.println(i);
		System.out.println(j);
	}

}