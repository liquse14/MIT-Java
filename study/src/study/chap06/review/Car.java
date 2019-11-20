package study.chap06.review;

// �����ִ� ��� : Car

public class Car {
	// ���� ��� : �ʵ�, ������, �޼ҵ�
	// �ʵ� : ����(speed, seatNum), �⺻����(company, owner), ��ǰ(Engine, Tire, Handle)
	int speed;
	int seatNum;
	String owner;
	String company;
	String model;
	
	// ������
	// �����ڸ� �������� ������ �⺻ �����ڰ� �����ϴ� ������ �����Ϸ��� ����
	public Car() {
		System.out.println("Car()");
	}	// ���๮�� ���� : �޼ҵ��� ����, ��ȯ���� ����, �ּҰ��� ��ȯ��
	
	// �������� ��Ȱ : 1. ��ü ����(�޸𸮸� Ȯ��) 2. �ʵ� ���� �ʱ�ȭ
	public Car(String company, String m) {
		System.out.println("Car(String company, String m)");
		this.company = company;	// �Ű������� �ʵ带 �����ϱ� ���� this�� ���
		model = m;	// this�� ���� ����
	}
	
	// ������ �����ε� : �����ڸ� ���� �� ���
	// �Ű������� Ÿ��, ����, ��ġ -> ������ �� ������ ���
//	public Car(String company, String owner) {	// ��� �ȵ� : ������ ������ �����ڿ� ������ �� ����
		
//	}
	
	public Car(int speed, String model) {	// ���
		System.out.println("Car(int speed, String model)");
		this.speed = speed;	// �ʵ� ���� �־��� �Ű����� ������ ����
		this.model = model;	// this : Car
	}
	
	public Car(String company) {	// company
		this(company, "�ҳ�Ÿ");	// ������ ������ �����ڸ� �״�� �̿� this : Car(Ŭ���� �̸�)
		System.out.println("Car(String company)");	// �ٸ� �����ڸ� ȣ���� �� �����ڰ� �� ó���� �;� ��
	}
	
	// �żҵ�
	public void speedUp(int speed) {
		this.speed = speed;
	}
}
