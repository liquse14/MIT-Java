package study.chap06.final_static;

public class Member {
	// 예 한 페이지에 보여줄 회원 정보의 수 : 10명(상수)
	public static final int MAX_MEMBER_PER_PAGE = 10;	// 상수
	// 로그인 여부에 대한 정보 분류
	public static final int LOGIN_SUCCESS = 1;	// static final : 상수
	public static final int ID_MISMATCH = 2;
	public static final int PASSWORD_MISMATCH = 3;
	public static final int NOT_EXIST = 4;
	
	String name;
	String id;
	String password;
	int age;
	int gender;
}
