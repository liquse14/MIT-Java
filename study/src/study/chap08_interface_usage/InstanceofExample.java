package study.chap08_interface_usage;

public class InstanceofExample {
	
	public static void main(String[] args) {
		RemoteControl rc=new SettopBox();	//���� �������̽� Ÿ�� �����̸�=new������ü();
//		rc.volume=10;	//������ü���� ������ �ʵ�
		//����Ÿ�Ժ�ȯ
		SettopBox sb=(SettopBox)rc;
		if(rc instanceof Television) {
			Television tv=(Television)rc;//Error(ClassCastException �߻�)
		}else if(rc instanceof SettopBox) {
			SettopBox s2=(SettopBox)rc;
		}
	}

}
