package study.chap08_abstract_class;


//구현 클래스
public class InterfaceAmpl implements interfacA {
	//클래스:필드,생성자,다른 메소드
	int field1;
	//생성자
	public public InterfaceAmpl(int field1) {
		this.field1=field1;
	}
	
	//메소드
	public void method3() {
		System.out.println("InterfaceAImp1:method2()호출됨");
	}
	
	//상수,default 메소드, 정적메소드도 존재
	//구현한 인터페이스의 추상메소드를 재정의
	@Override
	public void method1() {
		System.out.println("InterfaceAImp1:method1() 호출됨");
			}

}
