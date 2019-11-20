package study.chap06.singleton;

import java.util.Calendar;

public class MainExample {
	// �ʵ� : ȸ������

	public static void main(String[] args) {
//		SingleTon s = new SingleTon();	// ��ü�� ���� �Ұ�
		System.out.println("ȣ����");
		SingleTon s1 = SingleTon.getInstance();
		s1.data[0] = 10;	// ����
		System.out.println(s1.data[0]);	// ������ �ִ� ���
		
		// �ð�
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		int year = now.get(Calendar.YEAR);
		System.out.println(year);
		
		CommonStorage s3 = CommonStorage.getIn();
		System.out.println(s3.data);
		s3.data = 40;
		System.out.println(s3.data);
	}

}
