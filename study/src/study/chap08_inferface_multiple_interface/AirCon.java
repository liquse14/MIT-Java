package study.chap08_inferface_multiple_interface;

public class AirCon implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("�������� �մϴ�.");

	}

	@Override
	public void turnOff() {
		System.out.println("�������� ���ϴ�.");

	}

	@Override
	public void setVolume(int volume) {
		System.out.println("�����������");

	}

}
