package study.chap08_interface_review_interface;

public class MariaDB implements IDatabase {
	//메소드:CRUD
	@Override
	public void insert(String sql) {
	System.out.println("MariaDB:insert()호출됨");
	}
	
	@Override
	public void select(String sql) {
		System.out.println("MariaDB:select()호출됨");
		}
	//IDatabase에서 정의된 default 메소드를 사용가능
}
