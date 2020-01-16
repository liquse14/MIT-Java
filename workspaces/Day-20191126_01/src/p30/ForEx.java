package p30;

public class ForEx {

	public static void main(String[] args) {
		int[] numbers= {1,2,3,5,8,13,21};
//		for(int i=0;i<numbers.length;i++) {
//			System.out.println(numbers[i]);
//		}
		for(int number : numbers) {
			System.out.println(number);
		}
	}

}
