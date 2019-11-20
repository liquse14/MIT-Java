package study.chap08_interface_inherit;

public class MultiFunctionTelevision implements MultipleRemoteControl {

	//RemoteControl 추상메소드를 재정의
	@Override
	public void turnOn() {
		System.out.println("다기능");

	}

	@Override
	public void turnOff() {
		

	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub

	}
	//Searchable 인터페이스에 있는 추상메소드를 재정의
	@Override
	public void search(String url) {
		// TODO Auto-generated method stub

	}
	//MultipleRemoteControl에서 정의한 추상 메소드를 재정의
	@Override
	public void changeChannel(int channel) {
		// TODO Auto-generated method stub

	}

}
