package study.chap06.instance;

public class CarExample {

	// 인스턴스 멤버
	public static void main(String[] args) {
		Car.MaxSeatNum = 6;	// 공통데이터, 객체 생성없이 접근 : static
		Car.changeBattery();// 객체의 생성없이 접근
		
		Car car1 = new Car();
		Car car2 = new Car();
		car1.MaxSeatNum = 30;	// 객체마다 하나씩 존재하지 않음
		System.out.println("MaxSeatNum: " + car1.MaxSeatNum);
		System.out.println("MaxSeatNum: " + car2.MaxSeatNum);
		System.out.println("MaxSeatNum: " + Car.MaxSeatNum);
		car2.MaxSeatNum = 40;	// 객체마다 하나씩 존재하지 않음
		System.out.println("MaxSeatNum: " + car1.MaxSeatNum);
		System.out.println("MaxSeatNum: " + car2.MaxSeatNum);
		System.out.println("MaxSeatNum: " + Car.MaxSeatNum);
//		Car.MaxSeatNum = 30;
		car1.setSpeed(50);
		car1.speed = 60;
		System.out.println("현재 속도: " + car1.getSpeed());
		// 입력 받고
		Common.maxMember = 20;
	}

}
