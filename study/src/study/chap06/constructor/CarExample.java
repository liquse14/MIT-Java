package study.chap06.constructor;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();	// ��ü ���� (����Ʈ �����ڸ� ���)
		System.out.println("myCar �ӵ� : " + myCar.speed);
			// speed = 0;
		
		// ��ü�� �����ϸ鼭 speed ���� �����ϰ� �ʹ�.
		Car car1 = new Car(300);
		System.out.println("car1 �ӵ� : " + car1.speed);
		
		Car car2 = new Car(400, 4);
		System.out.println("car2 �ӵ� : " + car2.speed);
		System.out.println("car2 �¼��� : " + car2.seat);
		
		Car car3 = new Car(400, "�׷���", "���");	// ���� �ؼ�
		Car car4 = new Car("�ҳ�Ÿ", "��", 200);
		Tire myTire = new Tire();	// package study.chap06.review.Tire ���� �Ұ��� : ����� �� ����
	}

}
