package study.chap06.instance;

public class CarExample {

	// �ν��Ͻ� ���
	public static void main(String[] args) {
		Car.MaxSeatNum = 6;	// ���뵥����, ��ü �������� ���� : static
		Car.changeBattery();// ��ü�� �������� ����
		
		Car car1 = new Car();
		Car car2 = new Car();
		car1.MaxSeatNum = 30;	// ��ü���� �ϳ��� �������� ����
		System.out.println("MaxSeatNum: " + car1.MaxSeatNum);
		System.out.println("MaxSeatNum: " + car2.MaxSeatNum);
		System.out.println("MaxSeatNum: " + Car.MaxSeatNum);
		car2.MaxSeatNum = 40;	// ��ü���� �ϳ��� �������� ����
		System.out.println("MaxSeatNum: " + car1.MaxSeatNum);
		System.out.println("MaxSeatNum: " + car2.MaxSeatNum);
		System.out.println("MaxSeatNum: " + Car.MaxSeatNum);
//		Car.MaxSeatNum = 30;
		car1.setSpeed(50);
		car1.speed = 60;
		System.out.println("���� �ӵ�: " + car1.getSpeed());
		// �Է� �ް�
		Common.maxMember = 20;
	}

}
