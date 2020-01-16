package ch2;

public class ForFor {

	public static void main(String[] args) {
		//주사위 두개를 던져서 7이되는 경우의 수를 모두 출력하시오.
		//출력 예) 주사위1:5	주사위2:7
		//		  주사위1:1	주사위2:6
		

		int i=0;
		int j=0;
		int sum=0;
		
		for(i=1;i<=6;i++) {
			for(j=1;j<=6;j++) {
				if(i+j==7) {
					System.out.println("주사위1:"+i+"		주사위2:"+j);
				}
				
			}
		}
	}

}
