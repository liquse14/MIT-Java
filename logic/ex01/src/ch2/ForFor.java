package ch2;

public class ForFor {

	public static void main(String[] args) {
		//�ֻ��� �ΰ��� ������ 7�̵Ǵ� ����� ���� ��� ����Ͻÿ�.
		//��� ��) �ֻ���1:5	�ֻ���2:7
		//		  �ֻ���1:1	�ֻ���2:6
		

		int i=0;
		int j=0;
		int sum=0;
		
		for(i=1;i<=6;i++) {
			for(j=1;j<=6;j++) {
				if(i+j==7) {
					System.out.println("�ֻ���1:"+i+"		�ֻ���2:"+j);
				}
				
			}
		}
	}

}
