package study.chap06.static_member;

public class MainExample {

	public static void main(String[] args) {
		int result = Calculator.plus(10,  20);
		System.out.println("result=" + result);
		System.out.println("���� ����: " + Calculator.calculateArea(5.0));
		// �ð� : ��ü �ϳ��� ���� -> �ð� ������ ����
		System.out.println("result: " + Calculator.minus(30, 20));
	}

}
