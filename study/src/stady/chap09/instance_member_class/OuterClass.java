package stady.chap09.instance_member_class;

public class OuterClass {
	//�ν��Ͻ� ��� Ŭ����:��ü(OuterClass)�� ������ �Ǿ��
	public class InnerClass{
		//�ʵ�,������,�޼ҵ�
		//�ʵ�:�ν��Ͻ� �ʵ�,���� �ʵ�
		int num = 10;
		static int snum=30;	//��� �ȵ�(���Ұ�)
		
		//�޼ҵ�:�ν��Ͻ� �޼ҵ�,���� �޼ҵ�
		void method1() {
			
		}
		//�����޼ҵ�
//		static void method2() {	//���ȵ�(���Ұ�)
//			
//		}
	}
	
	//�ν��Ͻ� ��� Ŭ����:��ü(OuterClass)�� ������ �Ǿ��
	public static class staticInnerClass{
		//�ʵ�,������,�޼ҵ�
		//�ʵ�:�ν��Ͻ� �ʵ�,���� �ʵ�
		int num = 10;
		
		//�����ʵ�: ��ü�� �������� ���ٰ���(OuterClass.StaticInnerClass.snum)
		static int snum=30;	//����
		
		//�޼ҵ�:�ν��Ͻ� �޼ҵ�,���� �޼ҵ�
		void method1() {
			
		}
		//�����޼ҵ�
		static void method2() {	//����
			
		}
	}
}
