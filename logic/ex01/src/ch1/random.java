package ch1;

import java.util.Random;
import java.util.Scanner;

public class random {


		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			Random rand=new Random();
			int num=rand.nextInt(20)+1;	//0~40+10
			int count=0;
			int input;
			
			
			
			
			do {	
			count++;
			System.out.println(count+"회차");
			System.out.println("숫자");
			input=scan.nextInt();
			if(num>input) {
				System.out.println("더 큰수로");
		}
			if(num<input) {
				System.out.println("더 작은수로");
			}
			}
			while(num!=input&&count!=5);
			if(num==input) {
				System.out.println("정답");
			}
			else {
				System.out.println("5회실패");
				
			}
			
		

	}
}