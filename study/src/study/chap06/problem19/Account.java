package study.chap06.problem19;

public class Account {
	// 상수 : static final
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	
	// 필드
	private int balance;	// public, protected, default, private
	
	// Getter and Setter
	public int getBalance() {
		return balance;
	}

	// 7 * (3 + 4) = 7 * 3 + 7 * 4
	public void setBalance(int balance) {
		// 매개값 balance 0보다 작거나 1000000보다 크면 현재값
		//		(this.balance)을 유지
//		if(!(balance < 0 || balance > 1000000))
//		if(!(balance < 0) !(||) !(balance > 1000000)))
		if(balance >= 0 && balance <= 1000000)
			this.balance = balance;	
	}
}
