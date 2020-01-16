package ch1;

import java.util.Random;
import java.util.Scanner;

public class random2 {

	public static void main(String[] args) {
		Random rand=new Random();
		int count1=0,count2=0;
		for(int i=0;i<150;i++) {
			int num=rand.nextInt(2)+1;
			if(num==1)
				count1++;
			else
				count2++;

		}
			System.out.println("1ÀÌ ³ª¿Ã È®·ü:"+count1*2/3+"%");
			System.out.println("2ÀÌ ³ª¿Ã È®·ü:"+count2*2/3+"%");
	}
}
