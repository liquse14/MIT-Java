package study.chap03;

// ?…¼ë¦¬ì—°?‚°? : ?ë°? A && B, A || B, !A, A & B, A | B
// C?–¸?–´ : !, &&, ||

public class Logical {

	public static void main(String[] args) {
		int num = 10;
		int var1 = 20;
		int a;
		int b = 10;
		
		// A && B
		// Aê°? false?´ë©? Bê°? true ?¸ì§? false?¸ì§? ?Œ?‹¨?•ˆ?•˜ê³? ?‹¤?–‰?•ˆ?•¨
		boolean flag = ((a = num) > 11) && ((b = var1) < 20);
		// A : ((a = num) > 11), B : ((b = var1) < 20)
		System.out.println("flag="+ flag + ",a=" + a + ", b=" + b);

		// ?ë°”ì—?„œ ì¶”ê??œ ê¸°ëŠ¥ : Aê°? false ?´?”?¼?„ Bê°? true ?¸ì§? false?¸ì§? ?Œ?‹¨
		flag = ((a = num) > 11) & ((b = var1) < 20);
		System.out.println("flag="+ flag + ",a=" + a + ", b=" + b);

	}

}
