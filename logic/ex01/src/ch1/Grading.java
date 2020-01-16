package ch1;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		// 성적을 받아서 학점을 결정하는 프로그램
		// 1.사용자로부터 점수를 입력받는다
		// 2.90점이상이면 학점A
		// 3.80점이상이면 학점B
		// 4.70=C
		// 5.60=D
		// 6.그이하F
		Scanner scan = new Scanner(System.in);
		System.out.println("수학점수");
		int Math = scan.nextInt();
		if (Math > 100) {
			System.out.println("오류");
		} else if (Math >= 90) {
			System.out.println("A");
		} else if (Math >= 80) {
			System.out.println("B");
		} else if (Math >= 70) {
			System.out.println("C");
		} else if (Math >= 60) {
			System.out.println("D");
		} else if (Math < 0) {
			System.out.println("오류");
		} else {
			System.out.println("F");
		}

	}

}
