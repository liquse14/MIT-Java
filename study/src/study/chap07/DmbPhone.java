package study.chap07;

public class DmbPhone/*�ڽ�Ŭ����*/ extends CellPhone/*�θ�*/ {	//extends
	int channel;	//���� ����ϴ� ä�� ����
	
	public DmbPhone() {
		super("��5","���");
		System.out.println("DMB�� �����ڰ� ȣ���");
	}
	
	public DmbPhone(String model,String color,int channel) {
		super("��5","���");
		this.channel=channel;
	}
	public DmbPhone(String model,String color) {
//		super();	//�θ� ���� ������ �Ǿ���Ѵ�.
	}
	//���:�θ� ������ �ʵ�� �޼ҵ带 ��� ����(������)
	public void method() {
		model="��8";	//�θ� �ʵ带 ���
		powerOn();	//�θ��� �޼ҵ带 ���				
	}
	
	public void changeChannel(int ch) {
		channel = ch;
	}
	
	public void dmb_powerOn() {	//�ΰ����� ��ǰ�� �ʱ�ȭ�� �߰���
		System.out.println("DMB���� �մϴ�.");
	}
	
	public void dmb_powerOff() {	//�ΰ����� ��ǰ�� �ʱ�ȭ�� �߰���
		System.out.println("DMB���� ���ϴ�.");
	}
}
