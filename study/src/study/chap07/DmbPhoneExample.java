package study.chap07;

public class DmbPhoneExample {

	public static void main(String[] args) {
		CellPhone cp=new CellPhone();
		cp.powerOn();
		cp.sendMessage("안녕");
		String msg=cp.receiveMessage();
		cp.powerOff();

		//DMB폰을 활용
		DmbPhone dp=new DmbPhone();
		dp.dmb_powerOn();
		dp.sendMessage("부모의 메소드를 이용");	//부모의 메소드
		String rxMsg=dp.receiveMessage();	//부모의 메소드
		dp.changeChannel(11);				//자식이 정의한 메소드
		dp.dmb_powerOff();
		dp.model="노트10";
		dp.channel=11;
		
	}

}
