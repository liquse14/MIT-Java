package study.chap04;

public class Exercise04 {

	public static void main(String[] args) {
		int i=0;
		int j=0;
		while(i + j != 5) {
			i = rand();	// 주사위 1번째
			j = rand();	// 주사위 2번째
			System.out.println("(" + i + ", " + j + ")");
		}
	}

	private static int rand() {
		return (int)(Math.random() * 6 + 1);
	}

}
