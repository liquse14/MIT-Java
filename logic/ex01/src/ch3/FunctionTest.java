package ch3;

public class FunctionTest {

	
	public static void main(String[] args) {

		
		//������� 5�� ������ �ȴ�.	*****
		starprint(5);
		//n���� m���� ���� ������ִ� �Լ�
		int aaa=sum(1,10);
		System.out.println(aaa);
	
		
	int a=checkodd(17);
	if(a==0) {
		System.out.println("Ȧ��");
	}
	else
		System.out.println("¦��");
	
	
	
}

static int checkodd(int number) {
	int temp=0;
	if (number%2==0)
		temp=0;
	else 
		temp=1;
	return temp;
}
	

	static void starprint(int b) {
		for(int i=0;i<b;i++)
			System.out.print("*");
	}
	static int sum(int a,int b) {
		int sum=0;
		if(a>b) {
			sum=a;
			a=b;
			b=sum;
		}
		sum=0;
		for(int i=a;i<b;i++) {
			sum+=i;
		}
		return sum;
	}
}
