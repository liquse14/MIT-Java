package study.chap06.problem15;

public class MemberService {
	// �޼ҵ�
	boolean login(String id, String password) {	// id:hong, pswword:12345
		// ���ǹ� == �ּ� ��, equals ���� ��
		if(id.equals("hong") && password.equals("12345"))
			return true;
		else
			return false;
	}
	
	void logout(String id) {
		// "�α׾ƿ� �Ǿ����ϴ�."�� ��µǵ��� ���α׷��϶�.
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
}
