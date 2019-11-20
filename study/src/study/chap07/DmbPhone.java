package study.chap07;

public class DmbPhone/*자식클래스*/ extends CellPhone/*부모*/ {	//extends
	int channel;	//현재 사용하는 채널 정보
	
	public DmbPhone() {
		super("갤5","흰색");
		System.out.println("DMB폰 생성자가 호출됨");
	}
	
	public DmbPhone(String model,String color,int channel) {
		super("갤5","흰색");
		this.channel=channel;
	}
	public DmbPhone(String model,String color) {
//		super();	//부모가 먼저 생성이 되어야한다.
	}
	//상속:부모가 선언한 필드와 메소드를 사용 가능(존재함)
	public void method() {
		model="갤8";	//부모 필드를 사용
		powerOn();	//부모의 메소드를 사용				
	}
	
	public void changeChannel(int ch) {
		channel = ch;
	}
	
	public void dmb_powerOn() {	//부가적인 부품의 초기화가 추가됨
		System.out.println("DMB폰을 켭니다.");
	}
	
	public void dmb_powerOff() {	//부가적인 부품의 초기화가 추가됨
		System.out.println("DMB폰을 끕니다.");
	}
}
