package study.chap06.class_review2;

// ȸ������
public class Member {
	private String id;
	private String name;
	private String password;
	private String phone;
	private String email;
	final String nation = "Korea";	// final ���� �ʱ�ȭ ��ġ 1. ����� ���ÿ� �ʱ�ȭ
		// 2. ����� �Բ� �ʱ�ȭ���� ���� ���� �����ڿ��� �ʱ�ȭ�� �����ؾ� �Ѵ�.
	
	public Member(String id, String name, String password, String phone, String email) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.phone = phone;
		this.email = email;
	}
}
