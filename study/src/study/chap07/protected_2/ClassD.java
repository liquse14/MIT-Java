package study.chap07.protected_2;

import study.chap07.protected_1.Car;

//�ٸ� ��Ű���� �ִ� Ŭ���� Car�� ��� ����
public class ClassD extends Car {
	public void method() {

		f1=10;		//public�� ����(O)
		f2=10;		//protected(O)
		f3="���ڿ�";	//default(X)
		f4=10;		//private(X)
		
}
	
}
