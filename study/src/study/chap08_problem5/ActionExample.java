package study.chap08_problem5;

public class ActionExample {

	public static void main(String[] args) {
		//�͸�����ü�� ���
		Action action = new Action() {
			
			@Override
			public void work() {
				System.out.println("���縦 �մϴ�.");
			}
			
		};
		action.work();
	}

}
