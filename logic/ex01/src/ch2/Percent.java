package ch2;

import java.util.Random;
import java.util.Scanner;

public class Percent {

	public static void main(String[] args) {
		// ����ڷ� ���� �ݺ�Ƚ���� �Է¹޾Ƽ�
		// �� ������ ���Դ� Ȯ���� ����Ͻÿ�
		// ��> �ݺ�Ƚ��:100
		// �ֻ���1�� Ȯ��16%

		Random rend = new Random();
		Scanner scan=new Scanner(System.in);
		System.out.println("���������");
		int user = scan.nextInt();
		int num1=0,num2=0,num3=0,num4=0,num5=0,num6=0;
		for(int i=0;i<user;i++) {
			int num=rend.nextInt(6)+1;
			if(num==1)num1++;
			else if(num==2)num2++;
			else if(num==3)num3++;
			else if(num==4)num4++;
			else if(num==5)num5++;
			else num6++;
		}
		System.out.println("�ֻ���1��Ȯ��"+num1*100/user);
		System.out.println("�ֻ���2��Ȯ��"+num2*100/user);
		System.out.println("�ֻ���3��Ȯ��"+num3*100/user);
		System.out.println("�ֻ���4��Ȯ��"+num4*100/user);
		System.out.println("�ֻ���5��Ȯ��"+num5*100/user);
		System.out.println("�ֻ���6��Ȯ��"+num6*100/user);

}
}