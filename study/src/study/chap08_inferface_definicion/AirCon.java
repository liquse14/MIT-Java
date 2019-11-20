package study.chap08_inferface_definicion;

public class AirCon implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("에어콘을 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("에어콘을 끕니다.");

	}

	@Override
	public void setVolume(int volume) {
		System.out.println("사용하지않음");

	}

}
