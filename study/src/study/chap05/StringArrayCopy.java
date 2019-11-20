package study.chap05;

public class StringArrayCopy {

	public static void main(String[] args) {
		String str[] = { "자바", "C언어", "DBMS" };	// 길이 3
		String more[] = new String[15];	// 길이 15
		// 복사 : 얕은 (주소)
		System.arraycopy(str, 0, more, 0, str.length);
		for(int i = 0;i < more.length;i++) {
			System.out.println(more[i]);
		}
		for(int i = 0;i < str.length;i++) {
			if(str[i] == more[i])	// 주소 비교
				System.out.println("같은 객체를 참조");
			else
				System.out.println("다른 객체를 참조");
		}
		System.out.println("_------------------");
		
		// 복사 : 깊은 (내용)->새로운 객체가 생긴다.
		for(int i = 0;i < str.length;i++) {
			more[i] = new String(str[i]);
		}
		for(int i = 0;i < more.length;i++) {
			System.out.println(more[i]);
		}
		for(int i = 0;i < str.length;i++) {
			if(str[i] == more[i])	// 주소 비교
				System.out.println("같은 객체를 참조");
			else
				System.out.println("다른 객체를 참조");
		}
	}

}
