package study.chap08_abstract_class;

public interface interfacA {
	//�ɹ�:���,�޼ҵ�(� ����� ����)-������,�˻�,...
	//���� ������: public
	//���
	int MAX_VOLUE=20;	//������ �ƴ϶� ���(public static final�� ������)
	public static final int MIN_VOLUME=0;���
	
	//�޼ҵ�:�߻�޼ҵ�(�ڹ� ���� 7,...),default�޼ҵ�(�ڹ� 8���� �߰�),�����޼ҵ�
	//�߻� �޼ҵ�:public abstract �ܾ ����
	void method1();
	
	//default �޼ҵ�
	default void method2() {	//����κ��� ����
		System.out.println("�� �κ��� ����κ� �Դϴ�.");
	}
	
	//���� �޼ҵ�
	static void setValue(int value) {
		System.out.println("���� ����("+value+")");
	}
	
	//���°�:������,�ʵ�(����) -> ��üȭ �Ұ�
	//�������̽��� ������ ������ü�� ���ؼ� ��� ����
	//RemoteControl->Television, Audio
}
