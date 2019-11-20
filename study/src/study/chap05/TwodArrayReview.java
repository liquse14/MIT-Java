package study.chap05;

/*
 * 이차원 배열 arr[i][j]
 */
public class TwodArrayReview {

	public static void main(String[] args) {
		int arr1[][] = { {1, 2, 3} , { 4, 5 } };
			// 2 행 : 0행은 크기가 3인 배열, 1행은 크긱 2인 배열
			// 각 행의 열의 크기를 가변할 수 있음.
		int arr2[][] = new int[3][4];
		int arr3[][][] = new int[4][5][6];
		System.out.println("arr1의 행의 크기 = " + arr1.length);
		for(int i = 0;i < arr1.length;i++) {	// i : 행
			System.out.println("arr1[" + i + "]의 크기 = " + arr1[i].length);
			for(int j = 0;j < arr1[i].length;j++) {
				System.out.print(arr1[i][j] + " ");	// 한 줄에 출력
			}
			System.out.println();	// 줄 바꾸기
		}
		System.out.println("-------------------------");
		
		// 배열의 행의 열의 크기를 가변해서 생성
		int arr4[][] = new int[3][];	// 1차원 배열의 주소를 저장 : 참조변수의 배열
		for(int i = 0;i < arr4.length;i++) {
			arr4[i] = new int[i + 3];	// 각 행의 열에 대한 배열이 생성됨
		}
		int num = 1;
		// 값을 저장
		for(int i = 0;i < arr4.length;i++) {	// i : 행
			for(int j = 0;j < arr4[i].length;j++) {	// j: 열
				arr4[i][j] = num++;
			}
		}
		// 값을 출력
		for(int i = 0;i < arr4.length;i++) {	// i : 행
			for(int j = 0;j < arr4[i].length;j++) {	// j: 열
				System.out.print(arr4[i][j] + " ");	// 한 줄에 출력
			}
			System.out.println();
		}
	}

}
