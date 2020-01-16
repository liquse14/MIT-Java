package ch2;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		//정수가 들어가는 10개의 배열을 만들고
		//사용자로부터 10개를 입력받아 각각에 넣고
		//값이 들어있는 배열을 이용해서 평균값을 구해 출력한다.
		//그리고 입력했던 값을 보여준다
		//예>1
		//2
		//평균1
		//1
		//2
		int num[]=new int[10];
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			System.out.println(i+"번째 숫자를 입력해주세요:");
			num[i]=scan.nextInt();
		}
		int sum=0;
		
		for(int i=0;i<10;i++) {
			sum = sum+num[i];
		}
		System.out.println("평균은"+sum/10);
		
		for(int i=0;i<10;i++) {
		System.out.println(num[i]);
		}
	}

}
