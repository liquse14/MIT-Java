package stady.chap09.nested_class;

public class MainExample {

	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
//		oc.thread1.start();
//		oc.metgod3("http://www.naver.com");
		oc.method2();
		//���� �ɹ� Ŭ����
		OuterClass.ServerThread thread=new OuterClass.ServerThread();
		thread.start();
		//�ν��Ͻ� ���Ŭ����
		OuterClass.ComThread thread2 =oc.new ComThread();
		thread2.start();
	}
	}


