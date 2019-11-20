package study.chap07.compel_casting;

public class CompelExemple {

	public static void main(String[] args) {
		Parent parent=new Child();	//자동타입변환
			//자식객체를 부모타입에 대입
		Parent.pf1=10;	//부모가 정의한 필드
		Parent.pmethod1();
		Parent.pmethod2();
//		Parent.cf1=20;
//		Parent.cmethod1();
		Child child=(Child)parent;	//강제타입변환
		child.cf1=20;
		child.cmethod1();
	
		Parent p2 = new Parent();
		p2 = parent;
		if(p2 instanceof Child) {
		Child c2=(Child) p2;
		c2.cf1=20;
		System.out.println("***");
		}
	}
}

