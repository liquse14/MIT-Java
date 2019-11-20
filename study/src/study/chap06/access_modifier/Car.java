package study.chap06.access_modifier;

public class Car {
	// 필드
	public String str;
	public int field1;		// 모든 클래스에서 접근 가능
	protected int field2;	// 다른 패키지에 있는 클래스에서 접근 불가능, 
							// 예외 상속받은 클래스는 접근 가능
	int field3;				// 접근 제한자를 지정하지 않으면 default
							// 같은 패키지내에 있는 클래스는 접근 가능
	private int field4;		// 자신 클래스내에서만 접근
	
	// 생성자
	public Car() {
		System.out.println("public 호출됨");
	}
	protected Car(String value) {
		this.str = value;
		System.out.println("protected 호출됨");
	}
	Car(double d) {
		System.out.println("default 호출됨");
	}
	private Car(int value, String str) {
		this.field1 = value;
		System.out.println("private 호출됨");
	}

	// 메소드
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
