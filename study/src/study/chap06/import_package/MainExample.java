package study.chap06.import_package;

import java.util.Calendar;	// ���� ��Ű�� ��ιؿ� �������� Ŭ������ ����Ϸ���
	// ����Ϸ��� Ŭ������ ��θ� �˷��־�� �� -> import
import study.chap06.final_static.Person;

public class MainExample {

	public static void main(String[] args) {
		// ���� �ð�
		Calendar calendar = Calendar.getInstance();
		Person p1 = new Person("11111-2222", "Hong");
	}

}
