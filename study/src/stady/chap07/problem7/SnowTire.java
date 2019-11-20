package stady.chap07.problem7;

public class SnowTire extends Tire {

	@Override
	public void run() {
		//부모 클래스 Tire의 메소드 run()을 재정의
		System.out.println("스노우 타이어가 굴러갑니다.");
		super.run();
	}
}
