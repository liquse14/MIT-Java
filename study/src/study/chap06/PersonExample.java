package study.chap06;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person();	// 객체가 생성될 때 name=null로 초기화 됨
//		System.out.println("키: " + p1.height);	// 초기화 한값 10.0
		System.out.println("이름 : " + p1.name);	// 초기화하지 않음
//		height = 20.0;	// Person 클래스의 필드에 필드명만 사용해서는 접근 불가능
		p1.height = 20.0;	// 실체가 있어야 접근이 가능
	}

}
