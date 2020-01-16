package review;

public class AddTest {

	public static void main(String[] args) {
		Add1 object1=new Add1(7,9);
		System.out.println(object1.sum());
		System.out.println(object1.sub());
		object1.print();//num1값과 num2값이 콘솔에 출력
		object1.num1=1;
		object1.num2=100;
		System.out.println(object1.sum());
		System.out.println(object1.sub());
		Add1 object2=new Add1();
		
		System.out.println(object2.sum());
		System.out.println(object1.sub());
		object2.num1=10;object2.num2=20;
		System.out.println(object2.sum());
		System.out.println(object1.sub());
	}
	}
