package ch2;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// �� �Է��Ҷ����� �հ� ���ϱ�
		// ������ �Է��ϼ���:34
		// ���ݱ��� �Է��Ѽ��� ���� 34 �Դϴ�.

//		Scanner scan = new Scanner(System.in);
//		int sum = 0;
//		int num;
//
//		do {
//			System.out.println("������ �Է��ϼ���");
//			num = scan.nextInt();
//			if (num == 0) {
//				break;
//			}
//			sum += num;
//			System.out.println("��" + sum);
//		} while (true);
//		System.out.println("����" + sum);
//	}
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int num;

		do {
			System.out.println("������ �Է��ϼ���");
			num = scan.nextInt();

			sum += num;
		} while (num!=0);
		System.out.println("����" + sum);
	}

}
