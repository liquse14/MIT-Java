package stady.chap09.nested_class;

public class OuterClass {
	//���:�ʵ�,������,�޼ҵ�
	int num;
	ComThread thread1=new ComThread();
	//������
	public OuterClass() {
		
	}
	public void metgod3(String url) {
		ComThread thread=new ComThread();
		method(thread);
	}
	//�޼ҵ�
	public void method(ComThread thread) {
		thread.start();
	}
	public void method2() {
		ComThread thread = new ComThread();
		thread.start();
	}
	//�ν��Ͻ� ��� Ŭ����:��ø Ŭ����
	public class ComThread extends Thread{
		//������ ����Ǵ� �κ�
		@Override
		public void run() {
			int count = 0;
			//����κ�
			for(int i=0;i<10;i++) {
				System.out.println("count: "+count++);
				try {
					Thread.sleep(1000);//1�� ���� ���ڱ�
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	//���� ��� Ŭ����

	public static class ServerThread extends Thread{ 
		@Override
		public void run() {
			for(int i=0;i<5;i++) {
				System.out.println("������ �����:"+i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
					
				
			}
			}
		}
	}
}	

