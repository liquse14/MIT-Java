package study.chap08_interface_review_interface;

public interface IDatabase {
	//�߻� �޼ҵ�
	void insert();
	void select();
	//���ο� �߰�
	//���1.->������ü�� ��� ������ �Ǿ�� ��.
	//void update(int balance);
	void update(int balance);
//	default void update(int balance) {
//		System.out.println("update() ȣ���");
//	}
	
}
