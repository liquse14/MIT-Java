package stady.chap07.problem8;

public class MainExample {

	public static void main(String[] args) {
		B b = new B();
		b = (B) new A();	//�����Ͽ��� �߻� ����
		//���α׷��� �����Ҷ� ClassCastException()�� �߻�
		//RunTimeException()�� �߻�
		b = new D();		//�ڵ� Ÿ�� ��ȯ
		b = new E();		//�ڵ� Ÿ�� ��ȯ

	}

}
