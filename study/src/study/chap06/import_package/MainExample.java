package study.chap06.import_package;

import java.util.Calendar;	// 나의 패키지 경로밑에 있지않은 클래스를 사용하려면
	// 사용하려는 클래스의 경로를 알려주어야 함 -> import
import study.chap06.final_static.Person;

public class MainExample {

	public static void main(String[] args) {
		// 오늘 시간
		Calendar calendar = Calendar.getInstance();
		Person p1 = new Person("11111-2222", "Hong");
	}

}
