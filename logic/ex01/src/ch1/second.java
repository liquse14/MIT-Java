package ch1;

import java.util.Scanner;

public class second {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
			
		int num=30;		
		int i=0;
		int input;
		
		
		do {
		System.out.println("����");
		input=scan.nextInt();
		if(num>input) {
			System.out.println("����");
		}
		else if(num<input) {
			System.out.println("ŭ");
		}
		}
		while(num!=input);
			System.out.println("����");

}
}