package study.chap06.problem19;

public class Account {
	// ��� : static final
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	
	// �ʵ�
	private int balance;	// public, protected, default, private
	
	// Getter and Setter
	public int getBalance() {
		return balance;
	}

	// 7 * (3 + 4) = 7 * 3 + 7 * 4
	public void setBalance(int balance) {
		// �Ű��� balance 0���� �۰ų� 1000000���� ũ�� ���簪
		//		(this.balance)�� ����
//		if(!(balance < 0 || balance > 1000000))
//		if(!(balance < 0) !(||) !(balance > 1000000)))
		if(balance >= 0 && balance <= 1000000)
			this.balance = balance;	
	}
}
