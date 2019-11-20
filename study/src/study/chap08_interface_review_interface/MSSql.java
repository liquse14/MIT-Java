package study.chap08_interface_review_interface;

public class MSSql implements IDatabase {

	@Override
	public void insert() {
		System.out.println("MSSql:inset()");

	}

	@Override
	public void select() {
		System.out.println("MSSql:select()");

	}

}
