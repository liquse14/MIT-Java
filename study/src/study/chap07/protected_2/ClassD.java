package study.chap07.protected_2;

import study.chap07.protected_1.Car;

//다른 패키지에 있는 클래스 Car를 상속 받음
public class ClassD extends Car {
	public void method() {

		f1=10;		//public만 가능(O)
		f2=10;		//protected(O)
		f3="문자열";	//default(X)
		f4=10;		//private(X)
		
}
	
}
