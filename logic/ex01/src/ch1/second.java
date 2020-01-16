package ch1;

import java.util.Scanner;

public class second {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
			
		int num=30;		
		int i=0;
		int input;
		
		
		do {
		System.out.println("숫자");
		input=scan.nextInt();
		if(num>input) {
			System.out.println("작음");
		}
		else if(num<input) {
			System.out.println("큼");
		}
		}
		while(num!=input);
			System.out.println("정답");

}
}