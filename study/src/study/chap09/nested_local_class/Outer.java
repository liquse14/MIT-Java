package study.chap09.nested_local_class;

public class Outer {
	//필드,생성자,메소드
	
	//final:자바버전에서는 final을 명시해야지 된다.
	//자바 8버전에서는 final을 명시하지 않아도 된다.
	public void method(final int arg,int arg2) {
		int localVar=10;	//로컬변수
		int localVar2=20;
		
		
		//arg = 20;	//final->수정불가
//		localVar=30;//final->수정불가
//		arg2=50;	//수정가능
		localVar2=100;//수정가능
		
		//로컬클래스
		class InnerClass{
			int localMethod() {
				//Outer 클래스의 메소드 method의 매개변수,로컬변수가 사용될 때
				int result= arg+localVar;
				return result;
			}
		}
	}
}
