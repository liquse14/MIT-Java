package study.chap08_abstract_class;


//���� Ŭ����
public class InterfaceAmpl implements interfacA {
	//Ŭ����:�ʵ�,������,�ٸ� �޼ҵ�
	int field1;
	//������
	public public InterfaceAmpl(int field1) {
		this.field1=field1;
	}
	
	//�޼ҵ�
	public void method3() {
		System.out.println("InterfaceAImp1:method2()ȣ���");
	}
	
	//���,default �޼ҵ�, �����޼ҵ嵵 ����
	//������ �������̽��� �߻�޼ҵ带 ������
	@Override
	public void method1() {
		System.out.println("InterfaceAImp1:method1() ȣ���");
			}

}
