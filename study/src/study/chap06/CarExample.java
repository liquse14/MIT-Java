package study.chap06;

public class CarExample {

	// 실행용 클래스 : main() 메소드가 있는 클래스
	public static void main(String[] args) {
		Car myCar = new Car();	// 객체 한 개를 생성
		Tire myTire = new Tire();	// 접근 가능 : default지만 같은 패키지내에 있으므로 접근 가능
		Car hongCar = new Car();
		// 클래스 변수 : myCar, myTire, hongTire (참조 변수 : 힙 영역에 있는 객체의 주소를 가지고 있음)
		Car car1 = null;	// 참조하는 객체가 없을 때는 null로 초기화
		car1 = new Car();
	}

}
