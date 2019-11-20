package stady.chap09.nested_class;

import java.util.Timer;
import java.util.TimerTask;

public class NestedLocalOuter {
	//로컬 클래스
	void method() {
		//주기적으로 타이머 작업
		//타이머 클래스를 정의
		//로컬 클래스:메소드 안에서만 사용하기 위해서 정의한 클래스
		class MyTimer extends Timer{
				public void run() {		//10초 타임아웃되면 실행
					for(int i=0;i<10;i++) {
						System.out.println("타임아웃이 발생");
				}
			}
		}
		MyTimer t=new MyTimer();
		t.schedule(new TimerTask() {
			@Override
			public void run() {
				//타임아웃되면 실행
				for(int i=0;i<10;i++) {
				System.out.println("타임아웃이 발생");
			}
			}
		},1000L);	//지연시간:10ms 실행
	}
}
