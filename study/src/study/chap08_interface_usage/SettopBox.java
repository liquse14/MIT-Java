package study.chap08_interface_usage;

public class SettopBox implements RemoteControl {
	int volume;
	
	@Override
	public void turnOn() {
		System.out.println("��");

	}

	@Override
	public void turnOff() {
		System.out.println("��");

	}

	@Override
	public void setVolume(int volume) {
		this.volume=volume;
		System.out.println("������"+volume+"�� ����");

	}
	public void storeFile(string name) {
		System.out.println("����"+name+"�� �����մϴ�.");
	}
	
	public void store(String name) {
		System.out.println("����"+name+"�������մϴ�.");
	}
	
	
}
