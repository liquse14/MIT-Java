package study.chap08_inferface_definicion;

//�������̽�: ��ü�� ����ϱ� ���� ���� �κ� (��ü�� ����� �Ϻ�)
//�����ɹ�:���(static final),�޼ҵ�
//Ŭ������ ������,�ʵ� ���� �κ��� ����.
//���,�޼ҵ�:���������� public

public interface RemoteControl {
	//���
	public static final int MAX_VOLUME=10;
		//���� ������ public�� �����ص� �⺻�� public��
	static final int MIN_VOLUE=0;
	int MIN_VOLUME=0;//������ �ƴϰ� �����
//	public static final int MIN_VOLUME=0;
	
	//�޼ҵ�:�߻�,����Ʈ,����
	//�߻� �޼ҵ�:��ȯ�� �޼ҵ��̸�(�Ű�����...); �����κ��� ���� �޼ҵ�
		//���� Ŭ�������� �����Ǹ� ���־����
		//abstract�� ������
public void turnOn();	//���� �Ǿ��ְ� �����κ��� ���� �޼ҵ�
public void turnOff();
public void setVolume(int volume);
	//�ڹ�8:JDK8���� ������ ���
	//����Ʈ �޼ҵ�: ����κ��� �ִ� �޼ҵ�->���� Ŭ�������� 
	//�� �������� �ʿ����(�׷����� ���� �����Ǹ� �ؼ� ���)
	//default Ű���带 ���
	//�������̽��� ��� ����->��� ���� �������̽��� default�޼ҵ�
	//�߻�޼ҵ�� ����(����) ����
default void setMute(boolean mute) {	//���Ǻκ��� ����
	if(mute) {
		System.out.println("���� ó���� �մϴ�.");
	}
	else {
		System.out.println("���������� �մϴ�.");
	}
}
	//�ڹ�8���� �߰��� ���
	//���� �޼ҵ�:�������̽� �̸����� ����(���) ����->���� ����� ������ ��
	static void changeBattery() {
		System.out.println("���͸��� ��ȯ�մϴ�.");
	}
	
}
