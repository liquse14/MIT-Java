package ch1;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		// ������ �޾Ƽ� ������ �����ϴ� ���α׷�
		// 1.����ڷκ��� ������ �Է¹޴´�
		// 2.90���̻��̸� ����A
		// 3.80���̻��̸� ����B
		// 4.70=C
		// 5.60=D
		// 6.������F
		Scanner scan = new Scanner(System.in);
		System.out.println("��������");
		int Math = scan.nextInt();
		if (Math > 100) {
			System.out.println("����");
		} else if (Math >= 90) {
			System.out.println("A");
		} else if (Math >= 80) {
			System.out.println("B");
		} else if (Math >= 70) {
			System.out.println("C");
		} else if (Math >= 60) {
			System.out.println("D");
		} else if (Math < 0) {
			System.out.println("����");
		} else {
			System.out.println("F");
		}

	}

}
