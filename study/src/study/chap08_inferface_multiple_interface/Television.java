package study.chap08_inferface_multiple_interface;

//�������̽��� �����Ѵ�.(implements)
//����� ��Ӱ��迡���� ����Ѵ�.(extends)
//�������̽�:������ �����ϴ�.

public class Television implements RemoteControl {//[,HardDisk] �������� ��밡��
	//�ʵ�
	int channel;
	
	//������
	
	
	//�޼ҵ�
	public void changeChannel(int channel) {
		this.channel=channel;
	}
	
	//Interface RemoteControl���� ������ �߻� �޼ҵ带 ������
	@Override
	public void turnOn() {
		System.out.println("�׷������� �մϴ�.");

	}

	@Override
	public void turnOff() {
		System.out.println("�׷������� ���ϴ�.");

	}

	@Override
	public void setVolume(int volume) {
		System.out.println("�׷����� ������ "+volume+ "���� ����");

	}
	//����Ʈ�޼ҵ�� �����޼ҵ�� ������ �ִ�.
}
