package study.chap07.polymorphism;

//자바 : 자식이 부모를 선택해서 상속을 한다.
//부모는 하나만 선택 가능,C++:여러 개 가능
//부모의 필드,메소드를 사용가능
public class Dog extends Animal {
	int count;		//털갈이 횟수
	public void method1() {
		sound();	//부모가 정의한 메소드를 사용
		age = 10;
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
		super.sound();
	}
}
