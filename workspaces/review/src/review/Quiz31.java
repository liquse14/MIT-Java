package review;

import java.util.Scanner;

public class Quiz31 {
	int r=0;
	double size=0;
	static final double Pl=3.141592;
	void process() {//���� ���̸� ���
		System.out.println("������");
		Scanner scan=new Scanner(System.in);		
		r=scan.nextInt();
		size=r*r*Pl;
		scan.close();
	}
	void output() {//������
		System.out.println("����"+size);
	}
}
