package ch1;

import java.util.Scanner;

public class Larger {
	
	public static void main(String[] args) {
	//두 수를 입력받아서 큰 수를 출력하는 프로그램
	Scanner scan=new Scanner(System.in);
	//1. 첫수 입력받기
	System.out.println("첫번째입력");
	int num=scan.nextInt();
	//2. 두번째 입력받기
	System.out.println("두번째입력");
	int num2=scan.nextInt();
	//3. 입력받은수 비교
	if(num>num2) {
		System.out.println("제일큰수는="+num);
	}
	if(num2>num) {
		System.out.println("제일큰수는="+num2);
	}else {
		System.out.println("같음");
	}
	//4. 큰수 출력
}
}
