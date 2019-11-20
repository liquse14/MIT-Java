package study.chap08_problem5;

public class ActionExample {

	public static void main(String[] args) {
		//익명구현객체를 사용
		Action action = new Action() {
			
			@Override
			public void work() {
				System.out.println("복사를 합니다.");
			}
			
		};
		action.work();
	}

}
