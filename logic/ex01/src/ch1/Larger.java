package ch1;

import java.util.Scanner;

public class Larger {
	
	public static void main(String[] args) {
	//�� ���� �Է¹޾Ƽ� ū ���� ����ϴ� ���α׷�
	Scanner scan=new Scanner(System.in);
	//1. ù�� �Է¹ޱ�
	System.out.println("ù��°�Է�");
	int num=scan.nextInt();
	//2. �ι�° �Է¹ޱ�
	System.out.println("�ι�°�Է�");
	int num2=scan.nextInt();
	//3. �Է¹����� ��
	if(num>num2) {
		System.out.println("����ū����="+num);
	}
	if(num2>num) {
		System.out.println("����ū����="+num2);
	}else {
		System.out.println("����");
	}
	//4. ū�� ���
}
}
