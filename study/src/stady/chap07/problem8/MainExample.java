package stady.chap07.problem8;

public class MainExample {

	public static void main(String[] args) {
		B b = new B();
		b = (B) new A();	//컴파일에러 발생 안함
		//프로그램이 실행할때 ClassCastException()이 발생
		//RunTimeException()이 발생
		b = new D();		//자동 타입 변환
		b = new E();		//자동 타입 변환

	}

}
