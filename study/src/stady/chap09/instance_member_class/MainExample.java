package stady.chap09.instance_member_class;

public class MainExample {

	public static void main(String[] args) {
		OuterClass outer=new OuterClass();
		//InnerClass : �ν��Ͻ� ��� Ŭ����(��ü ���� �� ���)
		OuterClass.InnerClass instanceClass=new OuterClass.InnerClass();
		instanceClass=outer.new InnerClass();	//�ν��Ͻ� ��� Ŭ���� ����
		instanceClass.num=10;
		instanceClass.method1();
		
		//���� Ŭ����
		OuterClass.staticInnerClass staticClass=new OuterClass.staticInnerClass();
		staticClass.num=20;		//��ü �� ������ ����
		staticClass.snum=3;		//�ٶ����� ������� �ƴ�:��ü �Ѱ����� ����
								//��ü�� �Ѱ��� ����(����)
		OuterClass.staticInnerClass.snum=30;	//�����ʵ带 �����
		staticClass.method1();
		OuterClass.staticInnerClass.method2();	//���� �޼ҵ�
		OuterClass.staticInnerClass.num=30;		//�ν��Ͻ� �ʵ�� Ŭ���� �̸��� ����Ͽ� ���ٺҰ�
									//��ü ������ ���������� ����
		
	}

}
