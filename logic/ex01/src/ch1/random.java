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
			System.out.println(count+"ȸ��");
			System.out.println("����");
			input=scan.nextInt();
			if(num>input) {
				System.out.println("�� ū����");
		}
			if(num<input) {
				System.out.println("�� ��������");
			}
			}
			while(num!=input&&count!=5);
			if(num==input) {
				System.out.println("����");
			}
			else {
				System.out.println("5ȸ����");
				
			}
			
		

	}
}