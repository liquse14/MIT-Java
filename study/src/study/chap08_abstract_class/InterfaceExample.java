package study.chap08_abstract_class;

public class InterfaceExample {

	public static void main(String[] args) {
		interfacA ia=new InterfaceAmpl(10);	//�ڵ�Ÿ�Ժ�ȯ
		//�������̽����� ������ �κи� ���δ�(��� ����)
		ia.method1();
		ia.method2();
		ia.method3();	// �������̽� Ÿ���̹Ƿ� �Ⱥ��δ�.
		InterfaceAmpl ii = (InterfaceAmpl)ia;//����Ÿ�Ժ�ȯ
		ii.field1=20;
		ii.method3();
		
		//�͸�����ü : ���Ǵ� ������ ���Ǹ� �ؼ� ���
		InterfacA c = new InterfacA() {
			
			@Override
			public void method1() {
				field2=20;
				System.out.println("��ž�ڽ��� method1() ȣ���");
				int sum = add(10,20);
			}
			
			void add(int a,int b) {
				return a+b;
			}
			
		};
		c.method1();
		c.field2=10;	//������ü���� ������ �ʵ�.�޼ҵ�� ���Ұ�
	}

}
