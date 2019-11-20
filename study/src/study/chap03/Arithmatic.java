package study.chap03;

public class Arithmatic {

	public static void main(String[] args) {
		int num = 0x0011;
		num = 0xF0000000;
		int sNum = num << 2;	// ?™¼ìª½ìœ¼ë¡? 2ë¹„íŠ¸ ?´?™ (4ë°?)
		int rNum = num >> 2;	// ?˜¤ë¥¸ìª½?œ¼ë¡? 2ë¹„íŠ¸ ?´?™ (1/4)
		int threeShift = num >>> 2;	// ?˜¤ë¥¸ìª½?œ¼ë¡? 2ë¹„íŠ¸ ?´?™
		System.out.printf("num = %x\n", num);	// 110011
		System.out.printf("sNum = %x\n", sNum);
		System.out.printf("rNum = %x\n", rNum);
		System.out.printf("threeShift = %x\n", threeShift);
			// ë¶??˜¸ë¹„íŠ¸ê°? 1?´?˜ê²?
	}

}
