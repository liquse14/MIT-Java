package review;

public class NumUtilTest {

	public static void main(String[] args) {
		NumUtil bbb=new NumUtil();
		bbb.count=3;
		System.out.println(bbb.count);//bbb객체에 들어있는 3
		NumUtil aaa=new NumUtil();
		aaa.count=4;
		System.out.println(aaa.count);//aaa객체에 들어있는 4
		System.out.println(bbb.count);//bbb객체에 들어있는 3
		System.out.println("---------------------------");
		
		
		
		
		
		
		System.out.println(bbb.maxnum(7, 8));
		if(bbb.even(6)) {//홀짝을 판단하는 메소드 리턴값이 true면 짝수 리턴값이 false홀수
		System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
	}
}
