package study.chap08_inferface_multiple_interface;

//�������̽��� �������� ��������
public class SmartTelevision implements RemoteControl, SearchAble/*�ʿ��ϸ� ��� �߰�����*/ {

	//Seachable �߻� �޼ҵ� search()������
	@Override
	public void search(String url) {
		System.out.println(url+"�� �˻��մϴ�.");

	}
	//RemoteControl�� �ִ� �߻� �޼ҵ带 ������
	@Override
	public void turnOn() {
		System.out.println("����ƮTV ������ �մϴ�.");

	}

	@Override
	public void turnOff() {
		System.out.println("����ƮTV ������ ���ϴ�.");

	}

	@Override
	public void setVolume(int volume) {
		System.out.println(volume+"���� ����");

	}

}
