package study.chap03;

/*
 * ?°?΄?° ???
 * ? ?
 * 	char : 2 byte (κ΅?? ?΄λ₯? μ§???κΈ? ??΄ Unicode(UTF-8)λ₯? μ§??)
 * 		0~2? 16?Ή -1κΉμ? (??? ??€)
 *  C?Έ?΄? char? ?λ°μ?? byte?? κ°λ€.
 *  long 8 byte -> c?Έ?΄? long long? ???
 * ?€? : C?Έ?΄?? ??Ό (float, double)
 * ?Όλ¦? : μ°?(true)κ³? κ±°μ§(false)? ???₯ -> 1 byte ?¬κΈ?
 * unsigned ?°?΄?° ????? ??€.
 */
public class Primitive {	// ?΄??€ ?΄λ¦μ? ??λ¬Έμλ‘? ?? (κ΄??΅)

	public static void main(String[] args) {	// λ©μ? ?΄λ¦μ? ?λ¬Έμλ‘? ??
		byte b1 = 0x23;
		char c1 = '?';
		short s1 = 432;
		int num = 30;	// defaultκ°? int
		long ll = 234L;	// long?? ???κΈ? ??΄ L? μΆκ? κΈ°μ 
		float f1 = 0.43f;	// float ??? λ¦¬ν°?΄?? fλ₯? λΆμ¬μ€??€.
		double d1 = 0.54;	// defaultκ°? double
		boolean flag = true;	// ?Όλ¦¬ν (1 byte, true or false)
		System.out.println("b1 = " + b1);
		System.out.println("c1 = " + c1);
		System.out.println("s1 = " + s1);
		System.out.println("num = " + num);
		System.out.println("ll = " + ll);
		System.out.println("f1 = " + f1);
		System.out.println("d1 = " + d1);
		System.out.println("flag = " + flag);
	}

}
