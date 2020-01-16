package ch2;

import java.util.Random;
import java.util.Scanner;

public class Percent {

	public static void main(String[] args) {
		// »ç¿ëÀÚ·Î ºÎÅÍ ¹İº¹È½¼ö¸¦ ÀÔ·Â¹Ş¾Æ¼­
		// °¢ ´«±İÀÌ ³ª¿Ô´ø È®·üÀ» Ãâ·ÂÇÏ½Ã¿À
		// ¿¹> ¹İº¹È½¼ö:100
		// ÁÖ»çÀ§1´« È®·ü16%

		Random rend = new Random();
		Scanner scan=new Scanner(System.in);
		System.out.println("¸î¹ø±¼¸±±î");
		int user = scan.nextInt();
		int num1=0,num2=0,num3=0,num4=0,num5=0,num6=0;
		for(int i=0;i<user;i++) {
			int num=rend.nextInt(6)+1;
			if(num==1)num1++;
			else if(num==2)num2++;
			else if(num==3)num3++;
			else if(num==4)num4++;
			else if(num==5)num5++;
			else num6++;
		}
		System.out.println("ÁÖ»çÀ§1´«È®·ü"+num1*100/user);
		System.out.println("ÁÖ»çÀ§2´«È®·ü"+num2*100/user);
		System.out.println("ÁÖ»çÀ§3´«È®·ü"+num3*100/user);
		System.out.println("ÁÖ»çÀ§4´«È®·ü"+num4*100/user);
		System.out.println("ÁÖ»çÀ§5´«È®·ü"+num5*100/user);
		System.out.println("ÁÖ»çÀ§6´«È®·ü"+num6*100/user);

}
}