package ch2;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		//������ ���� 10���� �迭�� �����
		//����ڷκ��� 10���� �Է¹޾� ������ �ְ�
		//���� ����ִ� �迭�� �̿��ؼ� ��հ��� ���� ����Ѵ�.
		//�׸��� �Է��ߴ� ���� �����ش�
		//��>1
		//2
		//���1
		//1
		//2
		int num[]=new int[10];
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			System.out.println(i+"��° ���ڸ� �Է����ּ���:");
			num[i]=scan.nextInt();
		}
		int sum=0;
		
		for(int i=0;i<10;i++) {
			sum = sum+num[i];
		}
		System.out.println("�����"+sum/10);
		
		for(int i=0;i<10;i++) {
		System.out.println(num[i]);
		}
	}

}
