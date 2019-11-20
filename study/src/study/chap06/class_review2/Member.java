package study.chap06.class_review2;

// 회원정보
public class Member {
	private String id;
	private String name;
	private String password;
	private String phone;
	private String email;
	final String nation = "Korea";	// final 변수 초기화 위치 1. 선언과 동시에 초기화
		// 2. 선언과 함께 초기화하지 않을 경우는 생성자에서 초기화를 수행해야 한다.
	
	public Member(String id, String name, String password, String phone, String email) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.phone = phone;
		this.email = email;
	}
}
