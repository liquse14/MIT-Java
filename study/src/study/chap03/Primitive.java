package study.chap03;

/*
 * ?°?´?„° ???…
 * ? •?ˆ˜
 * 	char : 2 byte (êµ?? œ?–´ë¥? ì§??›?•˜ê¸? ?œ„?•´ Unicode(UTF-8)ë¥? ì§??›)
 * 		0~2?˜ 16?Š¹ -1ê¹Œì? (?Œ?ˆ˜?Š” ?—†?‹¤)
 *  C?–¸?–´?˜ char?Š” ?ë°”ì—?„œ?Š” byte?? ê°™ë‹¤.
 *  long 8 byte -> c?–¸?–´?˜ long long?— ???‘
 * ?‹¤?ˆ˜ : C?–¸?–´?? ?™?¼ (float, double)
 * ?…¼ë¦? : ì°?(true)ê³? ê±°ì§“(false)?„ ???¥ -> 1 byte ?¬ê¸?
 * unsigned ?°?´?„° ???…?? ?—†?‹¤.
 */
public class Primitive {	// ?´?˜?Š¤ ?´ë¦„ì? ??ë¬¸ìë¡? ?‹œ?‘ (ê´??Šµ)

	public static void main(String[] args) {	// ë©”ì†Œ?“œ ?´ë¦„ì? ?†Œë¬¸ìë¡? ?‹œ?‘
		byte b1 = 0x23;
		char c1 = '?•œ';
		short s1 = 432;
		int num = 30;	// defaultê°? int
		long ll = 234L;	// long?„?„ ?‘œ?‹œ?•˜ê¸? ?œ„?•´ L?„ ì¶”ê? ê¸°ìˆ 
		float f1 = 0.43f;	// float ?˜•?ƒœ?˜ ë¦¬í„°?Ÿ´?? fë¥? ë¶™ì—¬ì¤??‹¤.
		double d1 = 0.54;	// defaultê°? double
		boolean flag = true;	// ?…¼ë¦¬í˜• (1 byte, true or false)
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
