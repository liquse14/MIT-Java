
public class Student {
	private String name;
	private int score;
	private static final int MAX_SCORE=100;
	
	public void setScore(int score) {
		this.score=score;
	}

	public int getScore() {
		return score;
	}
	
	public int setName(String name) {
		this.name=name;
		return score;
	}
	//BL
	public void printScore() {
		System.out.println(this.name + "����"+MAX_SCORE + "�� ���� ��,"+this.score+"�� �Դϴ�.");
	}
	
}
