package ch1;

import java.util.Scanner;

public class Fist {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("����");	
		int input=scan.nextInt();
		//Ȧ�� ¦���� �Ǵ��ϴ� ���α׷�
		if(input%2==0) {
			System.out.println("¦");
		}
		else {
			System.out.println("Ȧ");
		scan.close();
		}
	}
}
