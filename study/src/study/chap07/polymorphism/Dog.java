package study.chap07.polymorphism;

//�ڹ� : �ڽ��� �θ� �����ؼ� ����� �Ѵ�.
//�θ�� �ϳ��� ���� ����,C++:���� �� ����
//�θ��� �ʵ�,�޼ҵ带 ��밡��
public class Dog extends Animal {
	int count;		//�а��� Ƚ��
	public void method1() {
		sound();	//�θ� ������ �޼ҵ带 ���
		age = 10;
	}
	
	@Override
	public void sound() {
		System.out.println("�۸�");
		super.sound();
	}
}
