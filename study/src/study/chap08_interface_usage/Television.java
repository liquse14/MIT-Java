package study.chap08_interface_usage;

public class Television implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("TV�� ��");

	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ��");

	}

	@Override
	public void setVolume(int volume) {
		this.volume=volume;
		System.out.println("������"+volume+"�� ����");

	}

}
