package study.chap06;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person();	// ��ü�� ������ �� name=null�� �ʱ�ȭ ��
//		System.out.println("Ű: " + p1.height);	// �ʱ�ȭ �Ѱ� 10.0
		System.out.println("�̸� : " + p1.name);	// �ʱ�ȭ���� ����
//		height = 20.0;	// Person Ŭ������ �ʵ忡 �ʵ�� ����ؼ��� ���� �Ұ���
		p1.height = 20.0;	// ��ü�� �־�� ������ ����
	}

}
