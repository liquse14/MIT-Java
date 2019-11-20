package study.chap06.constructor;

public class Car {
	// �ʵ�
	int speed;
	int seat;	// �¼� ��
	String model;	// �𵨸�
	String color;	// �� ��
	// �����ڸ� �������� �ʾ��� -> default �����ڰ� �����Ѵ�.
	public Car() {	// ����Ʈ ������ (�Ű������� ����)
		// ���೻���� �־ �ǰ� ��� �ȴ�. (�Ϲ������� ����)
	}	// ����Ʈ �����ڴ� �������� �ʾƵ� �����ϹǷ� �������� �ʾƵ� �ȴ�.
	
	// ������ : ����Ʈ �����ڰ� �ƴ� �ٸ� �����ڰ� �����ϸ�, default �����ڴ� ����.
	public Car(int speed) {	// �ʱⰪ���� �����ϰ� ���� ���� �Ű������� �޴´�.
		this.speed = speed;
	}
	
	// �ʿ��� �뵵�� ���� �������� �����ڸ� ���� �� ����.
	public Car(int speed, int seat) {
		this.speed = speed;
		this.seat = seat;
	}
	
	// Overriding-> ��Ӱ���
	// ������ �����ε� (Constructor Overloading) : �پ��� �ʱ�ȭ ����� ���� ->
										// �Ű������� �ٸ� �����ڸ� ���� ����
	// �Ű����� ����, Ÿ��, ������ ���ؼ� ����
	public Car(String model, String color, int speed) {
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
	
	public Car(int seat, String color, String model) {
		this.model = model;
		this.color = color;
		this.seat = seat;
	}
	
//	public Car(int a, String b, String c) {
//		this.model = c;
//		this.color = b;
//		this.speed = a;
//	}
}
