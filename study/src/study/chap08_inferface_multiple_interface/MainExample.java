package study.chap08_inferface_multiple_interface;

public class MainExample {

	public static void main(String[] args) {
		Television tv=new Television();
//		tv.MAX_VOLUME=5;//상수이므로 변경 불가능
		tv.turnOn();
		tv.setVolume(10);	//추상메소드
		tv.setMute(true);	//무음처리(default 메소드)
		tv.setMute(false);	//무음처리 해제
		RemoteControl.changeBattery();//정적 메소드
		//클래스:자동타입변환 (부모클래스 타입=자식클래스 객체)
		//인터페이스:자동타입변환(인터페이스=구현클래스 객체)
		RemoteControl rc=new Television();
		rc.setMute(true);
		rc.setVolume(20);
//		rc.changeChannel(07);	//불가능(Television클래스에서 정의한 메소드)
//		rc.channel=8;	//불가능(클래스에서 정의)
				//내가 볼수있는 것은 인터페이스에서 정의한 것만 볼수가있음
		//강제타입변환:원래 생성된 객체가 Television이므로 가능
		Television t=(Television)rc;
		t.channel=9;
		t.changeChannel(14);	//클래스에서 만든 것
		t.setVolume(5);			//인터페이스 추상메소드를 재정의
		if(rc instanceof Television) {
			Television t2 = (Television)rc;
			
		}else if(rc instanceof AirCon) {
			AirCon a=(AirCon)rc;	//가능한것처럼 보이지만 
			//ClassCastException 예외가 발생함(원래Television임)
		}
		

	}

}
