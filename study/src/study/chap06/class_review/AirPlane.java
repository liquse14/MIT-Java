package study.chap06.class_review;

public class AirPlane {
	// 구성 멤버 : 필드, 생성자, 메소드
	// 필드 : 속성, 상태, 부품, 소유물, ...
	String company = "보잉";	// 제조사:보잉
	String owner = "대한항공";	// 보유 회사:대한항공
		// 클래스 정의 시 고정된 값을 가진다.
	
	int speed;		// 속도
		// 초기값을 정의하지 않음
	int height;		// 고도
	int seatNum;	// 승객 수
	
	Engine engine;	// 부품
	Wheel	front;	// 앞 바뀌
	Wheel	back;	// 뒤 바뀌
	
	
	// 생성자
	AirPlane() {	// 접근 제한자 : public(x) -> default
		// default 접근 제한자 : 같은 패키지 내의 클래스에서 접근 가능
	}

	// 다른 생성자 -> 생성자 오버로딩 (Overloading) -> 매개변수의 타입, 순서, 위치
	public AirPlane(String company) {
		this.company = company;
	}
	
//	public AirPlane(String owner) {	// 위의 생성자와 구별을 못한다. : 허용 안됨
		
//	}
	
	public AirPlane(String company, int speed) {	// 구별 가능
		this.company = company;
		this.speed = speed;
	}
	
	public AirPlane(int speed, String company) {
		this(company, speed, 250);	// 밑에 있는 생성자를 호출
	}
	
	public AirPlane(String company, int speed, int seat) {
		this.company = company;
		this.speed = speed;
		seatNum = seat;	// 매개변수와 필드명이 다르므로 this를 붙이지 않아도 된다.
	}

}
