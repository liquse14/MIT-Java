package stady.chap09.nested_class;

public class OuterClass {
	//멤버:필드,생성자,메소드
	int num;
	ComThread thread1=new ComThread();
	//생성자
	public OuterClass() {
		
	}
	public void metgod3(String url) {
		ComThread thread=new ComThread();
		method(thread);
	}
	//메소드
	public void method(ComThread thread) {
		thread.start();
	}
	public void method2() {
		ComThread thread = new ComThread();
		thread.start();
	}
	//인스턴스 멤버 클래스:중첩 클래스
	public class ComThread extends Thread{
		//스레드 실행되는 부분
		@Override
		public void run() {
			int count = 0;
			//실행부분
			for(int i=0;i<10;i++) {
				System.out.println("count: "+count++);
				try {
					Thread.sleep(1000);//1초 동안 잠자기
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	//정적 멤버 클래스

	public static class ServerThread extends Thread{ 
		@Override
		public void run() {
			for(int i=0;i<5;i++) {
				System.out.println("서버와 통신중:"+i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
					
				
			}
			}
		}
	}
}	

