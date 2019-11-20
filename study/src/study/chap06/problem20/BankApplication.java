package study.chap06.problem20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static int count = 0;	// ���¸� ������ ���� ��
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
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
				run = false;
			else if(selectNo == 6)	// ���� �ܾ� ��ȸ
				retrieveAccount();
		}
		System.out.println("���α׷� ����");
		
	}

	private static void withdraw() {
		// TODO Auto-generated method stub
		
	}

	private static void deposit() {
		System.out.println("------");
		System.out.println("����");
		System.out.println("------");
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		System.out.print("���ݾ�: ");
		int value = scanner.nextInt();
		
		// findAccount() : ����Ǿ� ���¸� ã�� �޼ҵ带 �̿�
		Account account = findAccount(ano);
		if(account != null) {	// ���� �˻� ����
			account.setBalance(account.getBalance() + value);
		} else {	// ���� ����
			System.out.println("���¸� ���� �����ϼ���.");
		}
	}

	private static void accountList() {
		System.out.println("------");
		System.out.println("���¸��");
		System.out.println("------");
		for(int i = 0;i < count;i++) {
			//Account account = accountArray[i];
//			System.out.println(account.getAno() + "\t" +
//			account.getOwner() + "\t" + account.getBalance());
			System.out.println(accountArray[i].getAno() + "\t" +
					accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
		}
	}

	private static void createAccount() {	// ���� ���� 100���� ū��?
		if(count == 100) {	// 
			System.out.println("���¸� ������ �� �ִ� �ִ���� �ʰ��Ͽ����ϴ�.");
			return;
		}
		System.out.println("------");
		System.out.println("���»���");
		System.out.println("------");
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		System.out.print("������: ");
		String owner = scanner.next();		// ���ڿ� -> next()
		System.out.print("�ʱ��Աݾ�: ");
		int balance = scanner.nextInt();	// int -> nextInt()
		accountArray[count++] = new Account(ano, owner, balance);
		System.out.println("���: ���°� �����Ǿ����ϴ�.");
	}
	
	private static Account findAccount(String ano) {
		// accounArray[]
		for(int i = 0;i < count;i++) {
			Account account = accountArray[i];
			if(account.getAno().equals(ano)) {
				return account;
			}
		}
		return null;	// ���¸� ã�� ���� ���
	}

}
