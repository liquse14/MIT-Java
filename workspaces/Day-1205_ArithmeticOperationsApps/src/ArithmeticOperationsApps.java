import java.util.Scanner;

public class ArithmeticOperationsApps {

	public static void main(String[] args) {
		int num1=0;
		int num2=0;
		int result=0;
		String operator=null;
		
		Scanner scan=new Scanner(System.in);
		
		ArithmeticOperations ao=new ArithmeticOperations();
		
//		�Է� ȭ�� ����
		System.out.println("������>>");
		num1=scan.nextInt();
		
		System.out.println("������>>");
		operator=scan.next();
		
		System.out.println("������>>");
		num2=scan.nextInt();
//		��� �� ��� ȭ�� ����
		System.out.println("==========================");
		System.out.println(num1 + " "+operator + " "+num2+"�� ����մϴ�.");
		
		System.out.println("==========================");
		if(operator.equals("+")) {
			result=ao.addition(num1, num2);
		System.out.println("������ �����"+num1+ "+" +num2 + "=" + result + " �Դϴ�.");
		}else if(operator.equals("-")) {
			result=ao.subtraction(num1, num2);
		System.out.println("������ �����"+num1+ "-" +num2 + "=" + result + " �Դϴ�.");
		}else if(operator.equals("*")) {
			result=ao.multiplication(num1, num2);
		System.out.println("������ �����"+num1+ "*" +num2 + "=" + result + " �Դϴ�.");
		}else if(operator.equals("/")) {
			result=ao.division(num1, num2);
		System.out.println("������ �����"+num1+ "/" +num2 + "=" +(float) ao.division(num1,num2) + " �Դϴ�.");
		}
		else {
			System.out.println("��Ȯ�ϰ� �������� �����ڸ� �Է��� �ּ���.");
		}
		
		
	}

}