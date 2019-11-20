package study.chap06.this_constructor;

public class Car {
	// �ʵ�
	String model;
	String color;
	int maxSpeed;
	
	public Car() {	// ����Ʈ ������
		
	}
	
	// ������ 1
	public Car(String model) {
		this(model, "White");	// �Ʒ��� 3���� ��ſ� �ٸ� �����ڸ� ȣ�� -> ������ 2�� ȣ��
//		this.model = model;
//		this.color = "White";
//		this.maxSpeed = 250;
	}
	
	// ������ 2
	public Car(String model, String color) {
		this(model, color, 250);	// this : Car
//		Car(model, color, 250);
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = 250;
	}
	
	// ������ 3
	public Car(String model, String color, int speed) {
		this.model = model;	// this : Car (Ŭ����)
		this.color = color;
		this.maxSpeed = speed;
	}
}
