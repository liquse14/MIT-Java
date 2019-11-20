package study.chap06.static_block;

public class Car {
	// ���� �ʵ�
	public static int field1 = 20;	// ���� ����� �Բ� �ʱ�ȭ
	static int field2;		// �ʱ�ȭ���� ����
	
	// �ν��Ͻ� �ʵ� : ��ü ���� �� �޸𸮿� ��������� �Ҵ��� �ȴ����� ��� �ʵ�
	int seatNum;
	int TireNum;
	int speed;
	
	// �� �Ⱦ��̴� ���
	static {	// �� ('{'�� �����ؼ� '}'�� ������ �κ�
				// static { } : ���� ��
		field2 = 30;		// �ʱ�ȭ ���� : ���� �ʵ常
//		seatNum = 4;		// ��� �Ұ� -> ��ü ���� ��
	}
	
	// �� -> ��ü�� ������ �� ���� (�� �Ⱦ���)
	{
		TireNum = 4;
	}
	
	// ���� �޼ҵ�
	static void method() {
		// ����� �� �ִ� �ʵ� : ���� �ʵ常 ��� ����
		field1 = 30;	// ���� �ʵ� : ����
		this.field1 = 30;	// this : Car (Ư�� �ν��Ͻ� : ��ü ���� ��) -> ��� �Ұ�
//		seatNum = 4;	// �Ұ� (�ν��Ͻ� �ʵ�)
//		setSpeed(5);	// �ν��Ͻ� �޼ҵ带 ȣ�� �Ұ�
		method2();		// ���� �޼ҵ�� ȣ�� ����
	}
	
	// �ν��Ͻ� �޼ҵ�
	public void setSpeed(int speed) {
		this.speed = speed;	// �ν��Ͻ� �ʵ�(this : Car) ��ü�� ������ ����
	}
	
	static void method2() {
		System.out.println("���� �޼ҵ� 2�� �Ҹ�");
	}
}
