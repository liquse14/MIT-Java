package study.chap08_interface_usage;

public class Person {
	//�ʵ�,������,�޼ҵ�
	RemoteControl sb;
	String name;
	
	public Person(String name) {
		this.name=name;
	}
	//������
	public Person(RemoteControl rc){
		this.sb=rc;
	}
	
	//�޼ҵ�
	public void watchMovie() {
		RemoteControl rc=new SettopBox();
		rc.turnOn();
		SettopBox s = (SettopBox)rc;
		s.showMovie("��Ÿ����");
	}
	public void method3(RemoteControl rc) {
	rc.turnOn();
	rc.setMute(true);
	rc.turnOff();
	}
}
