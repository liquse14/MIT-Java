package study.chap08_inferface_multiple_interface;

public class MainExample {

	public static void main(String[] args) {
		Television tv=new Television();
//		tv.MAX_VOLUME=5;//����̹Ƿ� ���� �Ұ���
		tv.turnOn();
		tv.setVolume(10);	//�߻�޼ҵ�
		tv.setMute(true);	//����ó��(default �޼ҵ�)
		tv.setMute(false);	//����ó�� ����
		RemoteControl.changeBattery();//���� �޼ҵ�
		//Ŭ����:�ڵ�Ÿ�Ժ�ȯ (�θ�Ŭ���� Ÿ��=�ڽ�Ŭ���� ��ü)
		//�������̽�:�ڵ�Ÿ�Ժ�ȯ(�������̽�=����Ŭ���� ��ü)
		RemoteControl rc=new Television();
		rc.setMute(true);
		rc.setVolume(20);
//		rc.changeChannel(07);	//�Ұ���(TelevisionŬ�������� ������ �޼ҵ�)
//		rc.channel=8;	//�Ұ���(Ŭ�������� ����)
				//���� �����ִ� ���� �������̽����� ������ �͸� ����������
		//����Ÿ�Ժ�ȯ:���� ������ ��ü�� Television�̹Ƿ� ����
		Television t=(Television)rc;
		t.channel=9;
		t.changeChannel(14);	//Ŭ�������� ���� ��
		t.setVolume(5);			//�������̽� �߻�޼ҵ带 ������
		if(rc instanceof Television) {
			Television t2 = (Television)rc;
			
		}else if(rc instanceof AirCon) {
			AirCon a=(AirCon)rc;	//�����Ѱ�ó�� �������� 
			//ClassCastException ���ܰ� �߻���(����Television��)
		}
		

	}

}
