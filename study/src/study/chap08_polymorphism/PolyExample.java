package study.chap08_polymorphism;

public class PolyExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		for(int i = 0;i<10;i++) {
			int problemLocation = myCar.run();
			if(problemLocation==1) {	//앞왼쪽바퀴가 펑크
				myCar.fl = new NesenTire("앞왼쪽", 15);
			} else if(problemLocation==2) {//앞오른쪽
				myCar.fr=new HankookTire("앞오른쪽", 13);
			} else if(problemLocation==3) {//앞오른쪽
				myCar.fr=new HankookTire("뒤왼른쪽", 12);
			} else if(problemLocation==4) {//앞오른쪽
				myCar.fr=new NesenTire("뒤오른쪽", 14);
			}
			
		}

	}

}
