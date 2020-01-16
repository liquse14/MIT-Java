package review;

public class NumUtil {
	static int count;//static선언시 값이 서로 공유를 함
	

	
	
	
	static int maxnum(int a,int b){
		int max=0;
		if(a<b) {
			max=b;
		}
		if(a>b){
			max=a;
		}
		return max;
	}//a b 둘중에 큰값을 돌려준다.
	boolean even(int a) {
		if(a%2==0) {
			return true;
		}else {
			return false;
		}
	}
}
