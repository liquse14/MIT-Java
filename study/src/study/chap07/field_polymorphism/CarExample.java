package study.chap07.field_polymorphism;

public class CarExample {

	public static void main(String[] args) {
		//자동차를 생성->일정한 횟수를 운행->타이어 수명이 다해서 펑크
		//자동차를 stop->타이어를 교체->계속 운행	
		Car car=new Car();
		for(int i=0;i<5;i++) {
			int problemLocation =car.run();
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.frontLeftTire=new HANKookTire("앞왼쪽", 15);
				break;
				case 2:
				System.out.println("앞오른쪽 KumHoTire로 교체");
				car.frontLeftTire=new HANKookTire("앞오른쪽", 10);
				break;
				case 3:
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.frontLeftTire=new HANKookTire("앞왼쪽", 15);
				break;
				case 4:
				System.out.println("뒤오른쪽 KumHoTire로 교체");
				car.backRightTire=new HANKookTire("뒤오른쪽", 15);
				break;

				
			}
		}

	}

}
