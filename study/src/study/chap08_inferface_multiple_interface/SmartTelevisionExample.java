package study.chap08_inferface_multiple_interface;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		SmartTelevision st=new SmartTelevision();
		RemoteControl rc=new SmartTelevision();
		rc.turnOn();
		rc.setVolume(10);
//		rc.search();	//���� (RemoteControlŸ��)
		SearchAble s = (SearchAble)rc;	//���� �����Ѱ��� SmartTelevision
		s.search("http://www.naver.com");
		rc.turnOff();
	}

}
