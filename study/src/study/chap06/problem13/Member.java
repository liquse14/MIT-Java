package study.chap06.problem13;

public class Member {
	String name;		// default : 같은 패키지내에서만 접근 가능
	String id;
	String password;
	int age;
	
	// 생성자 : 매개변수 (이름, id)
	Member(String name, String id) {	// default
		this.name = name;
		this.id = id;
	}
}
