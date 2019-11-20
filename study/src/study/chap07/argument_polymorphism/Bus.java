package study.chap07.argument_polymorphism;

public class Bus extends Vehicle {
	//부모의 메소드 run()을 재정의
	@Override	//어노테이션:컴파일러에게 Override(재정의)를 알림
	public void run() {
		System.out.println("버스가 달립니다.");
	}
}
