package study.chap07.problem5;

public class Child extends Parent {
	private int studentNo;
	
	//�⺻ �����ڰ� ���ǵǾ� ���� ����
	//�⺻ �����ڰ� �ʿ��ϸ� �� ���Ǹ� ���־�� ��.
	
	
	//����Ʈ�����ڰ� �ƴ� �ٸ� ������
	public Child(String name,int studentNo) {
		super(name);	//�θ� Parent�� ����Ʈ �����ڸ� ȣ��
		this.name=name;
		this.studentNo = studentNo;
		
	}
}
