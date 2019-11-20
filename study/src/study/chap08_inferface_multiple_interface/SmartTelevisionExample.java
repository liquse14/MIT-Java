package study.chap08_inferface_multiple_interface;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		SmartTelevision st=new SmartTelevision();
		RemoteControl rc=new SmartTelevision();
		rc.turnOn();
		rc.setVolume(10);
//		rc.search();	//에러 (RemoteControl타입)
		SearchAble s = (SearchAble)rc;	//원래 생성한것이 SmartTelevision
		s.search("http://www.naver.com");
		rc.turnOff();
	}

}
