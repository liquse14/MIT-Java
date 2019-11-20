package study.chap06.final_static;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "자바");
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		p1.nation = "USA";			// final이므로 수정 불가
		p1.ssn = "123456-7654321";	// final : 상수 -> 수정 불가
		p1.name = "JSP";
		
		int num = p1.MAX_PAGE;
		
		Person p2 = new Person("22222-333333", "홍길동");
		System.out.println(p2.nation);
		System.out.println(p2.ssn);
		System.out.println(p2.name);
	}

}
