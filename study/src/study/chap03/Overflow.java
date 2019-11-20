package study.chap03;

// overflow : ?„˜ì¹œë‹¤. ?‘œ?˜„?•  ?ˆ˜ ?ˆ?Š” ê°’ë³´?‹¤ ?°ê°’ì„ ???¥?•˜? ¤ê³? ?•  ê²½ìš°
public class Overflow {

	public static void main(String[] args) {
		int a = Integer.MAX_VALUE;	// intë¡? ?‘œ?˜„?•  ?ˆ˜ ?ˆ?Š” ìµœë?ê°?
		int b = Integer.MAX_VALUE;
		int sum = a + b;	// ?Œ?ˆ˜ (?)
		
		sum = add(a, b);
	}

	// ?—‰?š±?•œ ê²°ê³¼ê°? ?‚˜?˜¤?Š” ê²ƒì„ ?”¼?•  ?ˆ˜ ?ˆ?Œ.
	// ì§ì ‘ ?”?•˜ì§? ë§ê³  ?•¨?ˆ˜ë¥? ?‚¬?š©?•´?„œ ê°??Š¥?•œ ?—?Ÿ¬(?˜¤ë¥?)ë¥? ì¤„ì—¬?¼.
	private static int add(int a, int b) {
		if(a == Integer.MAX_VALUE && b == Integer.MAX_VALUE) {
			System.out.println("ê²°ê³¼ê°’ì´ ?„˜ì¹©ë‹ˆ?‹¤.");
			return -1;	// ?—?Ÿ¬ë°œìƒ?‹œ ?‹¤ë¥? ì²˜ë¦¬ ê°??Š¥
		}
		else
			return a + b;	// 
	}

}
