package study.chap07.compel_casting;

public class Child extends Parent {
	//�θ� �ʵ� pf1,�޼ҵ� pmethod1()
	int cf1;
	
	//�޼ҵ�
	//�θ��� �޼ҵ带 ������
	@Override
	public void pmethod1() {
		System.out.println("pmethod1(������)ȣ���");
	}
	//�޼ҵ�
	public void cmethod1() {
		System.out.println("cmethod1(������)ȣ���");
	}
}
