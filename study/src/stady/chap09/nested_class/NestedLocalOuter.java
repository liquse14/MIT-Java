package stady.chap09.nested_class;

import java.util.Timer;
import java.util.TimerTask;

public class NestedLocalOuter {
	//���� Ŭ����
	void method() {
		//�ֱ������� Ÿ�̸� �۾�
		//Ÿ�̸� Ŭ������ ����
		//���� Ŭ����:�޼ҵ� �ȿ����� ����ϱ� ���ؼ� ������ Ŭ����
		class MyTimer extends Timer{
				public void run() {		//10�� Ÿ�Ӿƿ��Ǹ� ����
					for(int i=0;i<10;i++) {
						System.out.println("Ÿ�Ӿƿ��� �߻�");
				}
			}
		}
		MyTimer t=new MyTimer();
		t.schedule(new TimerTask() {
			@Override
			public void run() {
				//Ÿ�Ӿƿ��Ǹ� ����
				for(int i=0;i<10;i++) {
				System.out.println("Ÿ�Ӿƿ��� �߻�");
			}
			}
		},1000L);	//�����ð�:10ms ����
	}
}
