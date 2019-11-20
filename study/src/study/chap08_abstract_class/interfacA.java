package study.chap08_abstract_class;

public interface interfacA {
	//맴버:상수,메소드(어떤 기능을 정의)-리모콘,검색,...
	//접근 제한자: public
	//상수
	int MAX_VOLUE=20;	//변수가 아니라 상수(public static final이 생략됨)
	public static final int MIN_VOLUME=0;상수
	
	//메소드:추상메소드(자바 버전 7,...),default메소드(자바 8부터 추가),정적메소드
	//추상 메소드:public abstract 단어를 생략
	void method1();
	
	//default 메소드
	default void method2() {	//실행부분이 존재
		System.out.println("이 부분은 실행부분 입니다.");
	}
	
	//정적 메소드
	static void setValue(int value) {
		System.out.println("값을 설정("+value+")");
	}
	
	//없는것:생성자,필드(변수) -> 객체화 불가
	//인터페이스를 구현한 구현객체를 통해서 기능 구현
	//RemoteControl->Television, Audio
}
