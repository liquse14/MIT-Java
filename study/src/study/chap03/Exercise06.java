package study.chap03;

public class Exercise06 {

	public static void main(String[] args) {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		// 강제 타입 변환
		double area = (lengthTop + lengthBottom) * (double)height / 2;
		System.out.println(area);	// 49.85
	}

}
