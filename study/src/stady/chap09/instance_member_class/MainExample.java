package stady.chap09.instance_member_class;

public class MainExample {

	public static void main(String[] args) {
		OuterClass outer=new OuterClass();
		//InnerClass : 인스턴스 멤버 클래스(객체 생성 후 사용)
		OuterClass.InnerClass instanceClass=new OuterClass.InnerClass();
		instanceClass=outer.new InnerClass();	//인스턴스 멤버 클래스 생성
		instanceClass.num=10;
		instanceClass.method1();
		
		//정적 클래스
		OuterClass.staticInnerClass staticClass=new OuterClass.staticInnerClass();
		staticClass.num=20;		//객체 한 개마다 존재
		staticClass.snum=3;		//바람직한 사용방법이 아님:객체 한개마다 존재
								//객체에 한개만 존재(공용)
		OuterClass.staticInnerClass.snum=30;	//공용필드를 사용방법
		staticClass.method1();
		OuterClass.staticInnerClass.method2();	//정적 메소드
		OuterClass.staticInnerClass.num=30;		//인스턴스 필드는 클래스 이름을 사용하여 접근불가
									//객체 생성된 참조변수로 접근
		
	}

}
