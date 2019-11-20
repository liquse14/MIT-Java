package study.chap07.abstract_class;

public class MainExample {

	public static void main(String[] args) {
		Phone phone = new Phone("ȫ�浿");
		Phone phone2=new SmartPhone("ȫ�浿");
		Phone2.turnon();
		Phone2.turnOff();
		SmartPhone sp=(SmartPhone)phone2;
		sp.internetSearch("http://www.naver.com");
		sp.turnOff();

	}

}
