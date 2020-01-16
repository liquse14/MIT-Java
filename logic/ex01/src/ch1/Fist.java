package ch1;

import java.util.Scanner;

public class Fist {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("¼ýÀÚ");	
		int input=scan.nextInt();
		//È¦¼ö Â¦¼ö¸¦ ÆÇ´ÜÇÏ´Â ÇÁ·Î±×·¥
		if(input%2==0) {
			System.out.println("Â¦");
		}
		else {
			System.out.println("È¦");
		scan.close();
		}
	}
}
