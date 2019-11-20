package study.chap06.problem20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static int count = 0;	// 계좌를 개설한 고객의 수
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("---------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			if(selectNo == 1)
				createAccount();
			else if(selectNo == 2)
				accountList();
			else if(selectNo == 3)
				deposit();
			else if(selectNo == 4)	// 다시 처음부터 설명을 해달라
				withdraw();
			else if(selectNo == 5)
				run = false;
			else if(selectNo == 6)	// 계좌 잔액 조회
				retrieveAccount();
		}
		System.out.println("프로그램 종료");
		
	}

	private static void withdraw() {
		// TODO Auto-generated method stub
		
	}

	private static void deposit() {
		System.out.println("------");
		System.out.println("예금");
		System.out.println("------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("예금액: ");
		int value = scanner.nextInt();
		
		// findAccount() : 저장되어 계좌를 찾는 메소드를 이용
		Account account = findAccount(ano);
		if(account != null) {	// 계좌 검색 성공
			account.setBalance(account.getBalance() + value);
		} else {	// 없는 계좌
			System.out.println("계좌를 먼저 생성하세요.");
		}
	}

	private static void accountList() {
		System.out.println("------");
		System.out.println("계좌목록");
		System.out.println("------");
		for(int i = 0;i < count;i++) {
			//Account account = accountArray[i];
//			System.out.println(account.getAno() + "\t" +
//			account.getOwner() + "\t" + account.getBalance());
			System.out.println(accountArray[i].getAno() + "\t" +
					accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
		}
	}

	private static void createAccount() {	// 계좌 수가 100보다 큰지?
		if(count == 100) {	// 
			System.out.println("계좌를 개설할 수 있는 최대수를 초과하였습니다.");
			return;
		}
		System.out.println("------");
		System.out.println("계좌생성");
		System.out.println("------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("계좌주: ");
		String owner = scanner.next();		// 문자열 -> next()
		System.out.print("초기입금액: ");
		int balance = scanner.nextInt();	// int -> nextInt()
		accountArray[count++] = new Account(ano, owner, balance);
		System.out.println("결과: 계좌가 생성되었습니다.");
	}
	
	private static Account findAccount(String ano) {
		// accounArray[]
		for(int i = 0;i < count;i++) {
			Account account = accountArray[i];
			if(account.getAno().equals(ano)) {
				return account;
			}
		}
		return null;	// 계좌를 찾지 못할 경우
	}

}
