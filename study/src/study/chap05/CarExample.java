package study.chap05;

import study.chap06.Car;

public class CarExample {

	public static void main(String[] args) {
		Car yourCar = new Car();	// study.chap06.Car : 접근제한자가 public이므로 접근 가능(사용 가능)
		Tire myTire = new Tire();	// 접근제한자가 default이므로 보이지 않음(같은 패키지에 존재하지 않으므로)
	}

}
