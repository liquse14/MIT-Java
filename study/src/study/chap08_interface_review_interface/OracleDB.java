package study.chap08_interface_review_interface;

public class OracleDB implements IDatabase {

	@Override
	public void insert() {
		System.out.println("MariaDB:insert()ȣ���");
		
	}

	@Override
	public void select() {
		System.out.println("MariaDB:select()ȣ���");
		
	}
	
}
