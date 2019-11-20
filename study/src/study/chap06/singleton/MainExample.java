package study.chap06.singleton;

import java.util.Calendar;

public class MainExample {
	// 필드 : 회원정보

	public static void main(String[] args) {
//		SingleTon s = new SingleTon();	// 객체를 생성 불가
		System.out.println("호출함");
		SingleTon s1 = SingleTon.getInstance();
		s1.data[0] = 10;	// 저장
		System.out.println(s1.data[0]);	// 읽을수 있는 방법
		
		// 시간
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		int year = now.get(Calendar.YEAR);
		System.out.println(year);
		
		CommonStorage s3 = CommonStorage.getIn();
		System.out.println(s3.data);
		s3.data = 40;
		System.out.println(s3.data);
	}

}
