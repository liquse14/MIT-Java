package study.chap06.problem20re;

import java.util.Scanner;

public class BankApplication {
		private static final int MAX_ACCOUNT=100;
		
		static Account accountArray[];
		static int count=0;
		static BankApplication ba;
		
		static Scanner scanner = new Scanner(System.in);

		public static void main(String[] args) {
			accountArray= new Account[MAX_ACCOUNT];
			boolean run= true;
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
					run = false;	//반복문을 탈출하는 방법
				else if(selectNo == 6)	// 계좌 잔액 조회
					retrieveAccount();
			}
}

		private static void retrieveAccount() {
			// TODO Auto-generated method stub
			
		}

		private static void withdraw() {
			// TODO Auto-generated method stub
			
		}

		private static void deposit() {
			// TODO Auto-generated method stub
			
		}

		private static void accountList() {
			// TODO Auto-generated method stub
			
		}

		private static void createAccount() {
			System.out.println("-------------");
			System.out.println("계좌생성");
			System.out.println("-------------");
			
			
		}
}
