package study.chap06.constructor;

public class Car {
	// 필드
	int speed;
	int seat;	// 좌석 수
	String model;	// 모델명
	String color;	// 차 색
	// 생성자를 정의하지 않았음 -> default 생성자가 존재한다.
	public Car() {	// 디폴트 생성자 (매개변수가 없음)
		// 실행내용은 있어도 되고 없어도 된다. (일반적으로 없음)
	}	// 디폴트 생성자는 정의하지 않아도 존재하므로 정의하지 않아도 된다.
	
	// 생성자 : 디폴트 생성자가 아닌 다른 생성자가 존재하면, default 생성자는 없다.
	public Car(int speed) {	// 초기값으로 설정하고 싶은 값을 매개변수로 받는다.
		this.speed = speed;
	}
	
	// 필요한 용도에 따라서 여러가지 생성자를 만들 수 있음.
	public Car(int speed, int seat) {
		this.speed = speed;
		this.seat = seat;
	}
	
	// Overriding-> 상속관계
	// 생성자 오버로딩 (Constructor Overloading) : 다양한 초기화 방법을 제공 ->
										// 매개변수를 다른 생성자를 정의 가능
	// 매개변수 순서, 타입, 갯수에 의해서 구별
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
