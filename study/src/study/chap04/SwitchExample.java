package study.chap04;

import java.util.Scanner;	// 외부에서 정의된 클래스를 사용할 때 import를 해 준다.

public class SwitchExample {

	public static void main(String[] args) {
		int num;
		
		System.out.print("정수 입력: ");	// 커서를 유지 (print 메서드 사용)
		// 문자 입력 : C 언어의 scanf 해당
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		switch(num) {	// int 
		case 1:
			System.out.println("더하기");
			break;
		case 2:
			System.out.println("빼기");
			break;
		case 3:
			System.out.println("곱하기");
			break;
		default:
			System.out.println("나누기");
			break;
		}
		// 자바에서는 문자열도 가능
		String value;
		System.out.print("메뉴 선택: ");
		value = scanner.next();	// next() : 문자열
		switch(value) {	// 문자열
		case "10":
			System.out.println("10대");
			break;
		case "20":
			System.out.println("20");
			break;
		default:
			System.out.println("기타");
			break;
		}
	}
}
