package study.chap04;

public class Exercise05 {

	public static void main(String[] args) {
		// ¹Ýº¹¹® 11 * 11
		for(int x = 0;x <= 10;x++) {		// x : 0~10
			for(int y = 0;y <= 10;y++) {	// y : 0~10
				if(4 * x + 5 * y == 60) {	// (x, y)
					System.out.println("(" + x + ", " + y + ")");
				}
			}
		}
	}

}
