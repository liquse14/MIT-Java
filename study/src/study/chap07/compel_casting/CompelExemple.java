package study.chap07.compel_casting;

public class CompelExemple {

	public static void main(String[] args) {
		Parent parent=new Child();	//�ڵ�Ÿ�Ժ�ȯ
			//�ڽİ�ü�� �θ�Ÿ�Կ� ����
		Parent.pf1=10;	//�θ� ������ �ʵ�
		Parent.pmethod1();
		Parent.pmethod2();
//		Parent.cf1=20;
//		Parent.cmethod1();
		Child child=(Child)parent;	//����Ÿ�Ժ�ȯ
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

