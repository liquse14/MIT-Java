package study.chap07;

public class DmbPhoneExample {

	public static void main(String[] args) {
		CellPhone cp=new CellPhone();
		cp.powerOn();
		cp.sendMessage("�ȳ�");
		String msg=cp.receiveMessage();
		cp.powerOff();

		//DMB���� Ȱ��
		DmbPhone dp=new DmbPhone();
		dp.dmb_powerOn();
		dp.sendMessage("�θ��� �޼ҵ带 �̿�");	//�θ��� �޼ҵ�
		String rxMsg=dp.receiveMessage();	//�θ��� �޼ҵ�
		dp.changeChannel(11);				//�ڽ��� ������ �޼ҵ�
		dp.dmb_powerOff();
		dp.model="��Ʈ10";
		dp.channel=11;
		
	}

}
