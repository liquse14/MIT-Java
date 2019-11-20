package study.chap06.getter;

public class Member {
	private String id;
	private String name;
	private String pw;
	private String phone;
	private String email;
	private boolean gender;
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void setAge(String age) {
		this.age = Integer.parseInt(age);
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public Member() { }
	
	// ������
	public Member(String id, String name, String pw, String phone, String email) {
		super();
		this.id = id;
		this.name = name;
		this.pw = pw;
		this.phone = phone;
		this.email = email;
	}
	
	// Getter, Setter
	public String getId() {
		return id;
	}

	public void setId(String id) {	// ����, ������ �������� 7�� �̻�
		if(id.length() < 7)
			System.out.println("7�� �̻� �Է� �ϼ���.");
		else if(id.isEmpty())
			System.out.println("���̵� �Է��ϼ���.");
		// ����ǥ������ ����ؼ� �Ķ���Ͱ� ��Ģ��� �ԷµǾ����� Ȯ���� �� ����Ǹ� ����
		// �׷��� ������ �������� �ʰ� �߸��� ���� �˷��ش�.
			this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
