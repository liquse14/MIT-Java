package ch2;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		// ����ڷκ��� ���ڸ� �Է¹޾� 1���� �Է¹��� ����ŭ ���ؼ� ����ϴ� ���α׷�
		// ��> 100�� �Է¹�����
		// ����� 5050�̶�� ���;�
		// 1.����ڷκ��� ���ڸ� �Է¹޴´�.
		Scanner scan = new Scanner(System.in);
		System.out.println("�����Է�");
		int num = scan.nextInt();

		int sum = 0;
		// 2.�Է¹��� ���ڸ� �̿��ؼ� ����Ѵ�.
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		// 3.���� ���ڸ� ����Ѵ�.
		System.out.println("����" + sum);

	}

}
