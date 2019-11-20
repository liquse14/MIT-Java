package study.chap08_interface_review_interface;

public interface IDatabase {
	//추상 메소드
	void insert();
	void select();
	//새로운 추가
	//방법1.->구현객체가 모두 수정이 되어야 함.
	//void update(int balance);
	void update(int balance);
//	default void update(int balance) {
//		System.out.println("update() 호출됨");
//	}
	
}
