package study.chap08_interface_inherit;

public class MultiFunctionTelevision implements MultipleRemoteControl {

	//RemoteControl �߻�޼ҵ带 ������
	@Override
	public void turnOn() {
		System.out.println("�ٱ��");

	}

	@Override
	public void turnOff() {
		

	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub

	}
	//Searchable �������̽��� �ִ� �߻�޼ҵ带 ������
	@Override
	public void search(String url) {
		// TODO Auto-generated method stub

	}
	//MultipleRemoteControl���� ������ �߻� �޼ҵ带 ������
	@Override
	public void changeChannel(int channel) {
		// TODO Auto-generated method stub

	}

}
