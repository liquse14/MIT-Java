package review;

public class NumUtilTest {

	public static void main(String[] args) {
		NumUtil bbb=new NumUtil();
		bbb.count=3;
		System.out.println(bbb.count);//bbb��ü�� ����ִ� 3
		NumUtil aaa=new NumUtil();
		aaa.count=4;
		System.out.println(aaa.count);//aaa��ü�� ����ִ� 4
		System.out.println(bbb.count);//bbb��ü�� ����ִ� 3
		System.out.println("---------------------------");
		
		
		
		
		
		
		System.out.println(bbb.maxnum(7, 8));
		if(bbb.even(6)) {//Ȧ¦�� �Ǵ��ϴ� �޼ҵ� ���ϰ��� true�� ¦�� ���ϰ��� falseȦ��
		System.out.println("¦��");
		}else {
			System.out.println("Ȧ��");
		}
	}
}
