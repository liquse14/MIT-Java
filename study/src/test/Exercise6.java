package test;

public class Exercise6 {
    public static void main(String[] args) {
        int[][] array = {
            { 95, 86, 72 },
            { 83, 90, 95, 87 },
            { 78, 84, 92, 88, 90 },
            { 69, 86, 95 }
        };

        int sum = 0;
        double avg = 0.0;
        int count = 0;
        
        for(int i = 0;i < array.length;i++) {	// 행에 대하여 : i (행) 0~2
			count += array[i].length;
			// 열에 대하여 반복
			for(int j = 0;j < array[i].length;j++) {	// 행에 대한 열 : j
				// i = 0, j : 0~1 array[0].length=2
				// i = 1, j : array[1].length=3 0~2
				// i = 2, j : array[2].length=5 0~4
				sum += array[i][j];
				//count++;
			}
		}
		// 평균
		avg = (double)sum / count;	// 강제형변환 : int -> double
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);

    }
}
