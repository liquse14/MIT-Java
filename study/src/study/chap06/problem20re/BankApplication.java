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
				System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
				System.out.println("---------------------------------------");
				System.out.print("����> ");
				
				int selectNo = scanner.nextInt();
				if(selectNo == 1)
					createAccount();
				else if(selectNo == 2)
					accountList();
				else if(selectNo == 3)
					deposit();
				else if(selectNo == 4)	// �ٽ� ó������ ������ �ش޶�
					withdraw();
				else if(selectNo == 5)
					run = false;	//�ݺ����� Ż���ϴ� ���
				else if(selectNo == 6)	// ���� �ܾ� ��ȸ
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
			System.out.println("���»���");
			System.out.println("-------------");
			
			
		}
}
