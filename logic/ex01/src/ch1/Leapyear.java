package ch1;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		//���� �Ǵ����α׷�
		//������ 4�� ������ �������� �����̴�.
		//100���� ������ �������� ������ �����Ѵ�.
		//400���� ������ �������� ������ �����̴�.
		//����ڷκ��� ������ �Է¹޾� �������� �˷��ִ� ���α׷�
		//������ �Է��Ͻÿ�:______
		//_____���� �����Դϴ�./______���� ������ �ƴմϴ�.
		Scanner scan=new Scanner(System.in);
		
		System.out.println("�⵵ �Է�");
		int year=scan.nextInt();
		
//		if((year%4==0 && year%100 !=0) ||year%400==0) {
//			System.out.println(year+"�� ����");
//		}
//		else {
//			System.out.println(year+"�� ����ƴ�");
//		}
		if(year%400==0) {
			System.out.println(year+"�� �����̴�.");
		}
		else if(year % 100==0)
			System.out.println(year+"�� ����ƴ�");
		else if(year %4 ==0)
			System.out.println(year+"�� �����̴�");
		else System.out.println(year+"�� ����ƴ�");
	}

}
