package study.chap07.inherit_constructor;

public class B extends A {
	int f3;
	public B(int f1,String s1) {
		super(f1,s1);
	}
	public B(int f1,String s1,int f3) {
		super(f1,s1);
		this.f3=f3;
	}
	//1.����Ʈ ������
//	public B() {
//		super();
//		System.out.println("B()ȣ���");
//	}
	
