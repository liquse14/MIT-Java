package study.chap07.polymorphism;

public class AutoExample {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		B b2= d;	//�ڵ�Ÿ�Ժ�ȯ(D: B�� �ڽ�)
		b2 = c;		//���� (�ڵ�Ÿ�Ժ�ȯ�� �Ұ���)
		b2 = e;		//����(�ڵ�Ÿ�Ժ�ȯ�� �Ұ���)
		

	}

}
