package study.chap08_interface_inherit;

import study.chap08_inferface_multiple_interface.RemoteControl;

public interface MultipleRemoteControl extends RemoteControl, SearchAble {
	//���
	//RemoteControl:�߻�޼ҵ� ����
	//RemoteControl Interface������ default �޼ҵ�->�߻� �޼ҵ带 ���氡��
	//Searchable:�߻�޼ҵ� ����
	void setMute(boolean mute);
	
	//�ڽ� �������̽��� �߻�޼ҵ带 ���� ����
	void changeChannel(int channel);
	//default �޼ҵ�
	//���� �޼ҵ�
}
