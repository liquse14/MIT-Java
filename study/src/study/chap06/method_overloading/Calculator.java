package study.chap06.method_overloading;

public class Calculator {
	// �������
	// �޼ҵ�
	public int add(int a, int b) {
		System.out.println("������ ���ϱ�");
		return a + b;
	}
	
	// �޼ҵ� �����ε� : �Ű������� Ÿ��, ����, ������ �ٸ��� �ٸ� �޼ҵ带 ���
	// Ÿ�� : method(int)
	//		method(double)
	// ���� : int, String
	//		String, int
	// ���� : int
	//		int, int
	public double add(double d1, double d2) {
		System.out.println("�Ǽ��� ���ϱ�");
		return d1 + d2;
	}
}
