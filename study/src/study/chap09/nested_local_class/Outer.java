package study.chap09.nested_local_class;

public class Outer {
	//�ʵ�,������,�޼ҵ�
	
	//final:�ڹٹ��������� final�� ����ؾ��� �ȴ�.
	//�ڹ� 8���������� final�� ������� �ʾƵ� �ȴ�.
	public void method(final int arg,int arg2) {
		int localVar=10;	//���ú���
		int localVar2=20;
		
		
		//arg = 20;	//final->�����Ұ�
//		localVar=30;//final->�����Ұ�
//		arg2=50;	//��������
		localVar2=100;//��������
		
		//����Ŭ����
		class InnerClass{
			int localMethod() {
				//Outer Ŭ������ �޼ҵ� method�� �Ű�����,���ú����� ���� ��
				int result= arg+localVar;
				return result;
			}
		}
	}
}
