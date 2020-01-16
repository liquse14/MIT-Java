package review;

import java.util.Scanner;

public class Quiz31 {
	int r=0;
	double size=0;
	static final double Pl=3.141592;
	void process() {//원의 넓이를 계산
		System.out.println("반지름");
		Scanner scan=new Scanner(System.in);		
		r=scan.nextInt();
		size=r*r*Pl;
		scan.close();
	}
	void output() {//결과출력
		System.out.println("값은"+size);
	}
}
