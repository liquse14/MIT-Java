package review;

public class NumUtil {
	static int count;//static����� ���� ���� ������ ��
	

	
	
	
	static int maxnum(int a,int b){
		int max=0;
		if(a<b) {
			max=b;
		}
		if(a>b){
			max=a;
		}
		return max;
	}//a b ���߿� ū���� �����ش�.
	boolean even(int a) {
		if(a%2==0) {
			return true;
		}else {
			return false;
		}
	}
}
