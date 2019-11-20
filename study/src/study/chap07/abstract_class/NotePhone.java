package study.chap07.abstract_class;

public abstract class NotePhone extends Phone {
	//������
	public NotePhone(String owner) {
		super(owner);	//super:�θ�(Phone)
	}
	
	//�޼ҵ�
	public void internetSearch(String url) {
		System.out.println(url+"�� �˻��մϴ�.");
	}
	@Override
	public void turnOn() {
		System.out.println("����Ʈ���� �մϴ�");
	}
	
	public abstract void sendMessage(String message);
}
