package study.chap06.review;

import study.chap05.Compare;

public class MainExample {

	public static void main(String[] args) {
		// �ڵ��� ��ü : ��������
		Car myCar = new Car();	// �ڵ��� ���� -> �������� �޸𸮰� ������
		// �ʿ信 ���Ͽ� ������ ����
		System.out.println("�ӵ�: " + myCar.speed);
		myCar.company = "���";	// ��������.�ʵ�
		myCar.speedUp(60);		// ��������.�޼ҵ�
		System.out.println("�ӵ�: " + myCar.speed);
		
		Car car2 = new Car("����");
		Car car3 = new Car("BMW", "520");
		Compare c = new Compare();
	}

}
