package stady.chap09.instance_member_class;

public class OuterClass {
	//인스턴스 멤버 클래스:객체(OuterClass)가 생성이 되어야
	public class InnerClass{
		//필드,생성자,메소드
		//필드:인스턴스 필드,정적 필드
		int num = 10;
		static int snum=30;	//허용 안됨(사용불가)
		
		//메소드:인스턴스 메소드,정적 메소드
		void method1() {
			
		}
		//정적메소드
//		static void method2() {	//허용안됨(사용불가)
//			
//		}
	}
	
	//인스턴스 멤버 클래스:객체(OuterClass)가 생성이 되어야
	public static class staticInnerClass{
		//필드,생성자,메소드
		//필드:인스턴스 필드,정적 필드
		int num = 10;
		
		//정적필드: 객체의 생성없이 접근가능(OuterClass.StaticInnerClass.snum)
		static int snum=30;	//허용됨
		
		//메소드:인스턴스 메소드,정적 메소드
		void method1() {
			
		}
		//정적메소드
		static void method2() {	//허용됨
			
		}
	}
}
