package study.chap03;

public class Arithmatic {

	public static void main(String[] args) {
		int num = 0x0011;
		num = 0xF0000000;
		int sNum = num << 2;	// ?��쪽으�? 2비트 ?��?�� (4�?)
		int rNum = num >> 2;	// ?��른쪽?���? 2비트 ?��?�� (1/4)
		int threeShift = num >>> 2;	// ?��른쪽?���? 2비트 ?��?��
		System.out.printf("num = %x\n", num);	// 110011
		System.out.printf("sNum = %x\n", sNum);
		System.out.printf("rNum = %x\n", rNum);
		System.out.printf("threeShift = %x\n", threeShift);
			// �??��비트�? 1?��?���?
	}

}
