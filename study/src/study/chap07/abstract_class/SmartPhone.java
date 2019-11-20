package study.chap07.abstract_class;

public abstract class SmartPhone extends Phone {
	//생성자
	public SmartPhone(String owner) {
		super(owner);	//super:부모(Phone)
	}
	
	//메소드
	public void internetSearch(String url) {
		System.out.println(url+"을 검색합니다.");
	}
	@Override
	public void turnOn() {
		System.out.println("스마트폰을 켭니다");
	}
	
	public abstract void sendMessage(String message);
}
