package study.chap08_interface_usage;

public class SettopBox implements RemoteControl {
	int volume;
	
	@Override
	public void turnOn() {
		System.out.println("켬");

	}

	@Override
	public void turnOff() {
		System.out.println("끔");

	}

	@Override
	public void setVolume(int volume) {
		this.volume=volume;
		System.out.println("볼륨을"+volume+"로 설정");

	}
	public void storeFile(string name) {
		System.out.println("파일"+name+"을 저장합니다.");
	}
	
	public void store(String name) {
		System.out.println("파일"+name+"을저장합니다.");
	}
	
	
}
