package ch2;

import java.util.Random;
import java.util.Scanner;

public class dirty {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int input;
		for(;;) {
			//1.1~20���� ������ ��ǻ�Ͱ� �ϳ��� ���ڸ� ���ϱ� (5% Ȯ��)
			int sword=ran.nextInt(20)+1;
			//2.����ڷ� ���� �ϳ��� ���� �Է¹ޱ�
			System.out.println("�̾ƶ�(1~20):");
			input=scan.nextInt();
			//3. ��ǻ�Ͱ� ���� ���ڿ� ������� �Է�Ȯ���ϱ� ���н� ���� �ݺ�
			if(input==sword) {
				System.out.println("�����մϴ�. �����̱���");
				break;
			}else {
				System.out.println("�ٽ��ѹ� ��ȸ�� �帮�ڽ��ϴ�.");
			}
		}
		//4.��ȭ��Ʈ ����� ����� �Է¹ޱ�
		int value=0;	//��ȭ��
		int count=0;	//��ȭȽ��
		int drng=1;
		do {
			count++;
			System.out.println("��ȭ�Ͻðڽ��ϱ�?(1.yes 2.no)");
			input=scan.nextInt();
			if(input==2) {
				System.out.println("����������� ����� +" + value + "�Դϴ�.");
				break;
			}
			//5.��ȭ ��û�� ��ȭ�غ���	
			int check1=ran.nextInt(2*drng);	//���� 50%Ȯ�� - ������
			int check2=ran.nextInt(2*drng);	//Ȯ�ΰ�
			drng=drng*2;	//Ȯ�� ������ �پ��
			if(check1==check2) {
				value++;
				System.out.println("��ȭ����!!!! �����(" + value +")" );
			}else {
				System.out.println("��ȭ����! ������� �μ������ϴ�.");
				break;
			}
		}while(count!=10); //�ִ� 10��ȭ
		System.out.println("��");
		
		
		
		
		
		
	}

}