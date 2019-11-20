package study.chap06.access_modifier;

public class Car {
	// �ʵ�
	public String str;
	public int field1;		// ��� Ŭ�������� ���� ����
	protected int field2;	// �ٸ� ��Ű���� �ִ� Ŭ�������� ���� �Ұ���, 
							// ���� ��ӹ��� Ŭ������ ���� ����
	int field3;				// ���� �����ڸ� �������� ������ default
							// ���� ��Ű������ �ִ� Ŭ������ ���� ����
	private int field4;		// �ڽ� Ŭ������������ ����
	
	// ������
	public Car() {
		System.out.println("public ȣ���");
	}
	protected Car(String value) {
		this.str = value;
		System.out.println("protected ȣ���");
	}
	Car(double d) {
		System.out.println("default ȣ���");
	}
	private Car(int value, String str) {
		this.field1 = value;
		System.out.println("private ȣ���");
	}

	// �޼ҵ�
	public void method1() {
		System.out.println("method1()");
	}
	protected void method2() {
		System.out.println("method2()");
	}
	void method3() {
		System.out.println("method3()");
	}
	private void method4() {
		System.out.println("method4()");
	}
}
