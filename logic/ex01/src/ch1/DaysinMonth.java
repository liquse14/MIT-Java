package ch1;

import java.util.Scanner;

public class DaysinMonth {

	public static void main(String[] args) {
		//����ڷκ��� ���� �Է¹޾Ƽ� �� �޿� �ش��ϴ� �ϼ��� ����Ͻÿ�
		//31��:1,3,5,7,8,10,12/28��:2/30��2,4,6,11
		//�� swich������
		Scanner scan=new Scanner(System.in);
		System.out.println("�� �Է�");
		int num=scan.nextInt();
		
		switch(num) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31��");
			break;
		case 2:
			System.out.println("28��");
			break;
		default:
			System.out.println("30��");
			break;
	}

}
}