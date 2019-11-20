package study.chap08_interface_usage;

public class Person {
	//필드,생성자,메소드
	RemoteControl sb;
	String name;
	
	public Person(String name) {
		this.name=name;
	}
	//생성자
	public Person(RemoteControl rc){
		this.sb=rc;
	}
	
	//메소드
	public void watchMovie() {
		RemoteControl rc=new SettopBox();
		rc.turnOn();
		SettopBox s = (SettopBox)rc;
		s.showMovie("스타워즈");
	}
	public void method3(RemoteControl rc) {
	rc.turnOn();
	rc.setMute(true);
	rc.turnOff();
	}
}
