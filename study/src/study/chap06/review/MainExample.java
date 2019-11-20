package study.chap06.review;

import study.chap05.Compare;

public class MainExample {

	public static void main(String[] args) {
		// 자동차 실체 : 가상현실
		Car myCar = new Car();	// 자동차 생성 -> 힙영역에 메모리가 생성됨
		// 필요에 의하여 생성자 선택
		System.out.println("속도: " + myCar.speed);
		myCar.company = "기아";	// 참조변수.필드
		myCar.speedUp(60);		// 참조변수.메소드
		System.out.println("속도: " + myCar.speed);
		
		Car car2 = new Car("현대");
		Car car3 = new Car("BMW", "520");
		Compare c = new Compare();
	}

}
