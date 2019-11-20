package study.chap07.method_override;

public class SuperSonicPlane extends Airplane {
	int mode;	//비행모드1:일반비행기로 비행,2:초음속으로 비행
	
	public void setMode(int mode) {
		this.mode=mode;	
	}
	
	@Override	//어노테이션 (재정의)->컴파일러에게 재정의한다고 알림
	public void fly() {
		if(mode==1)		//일반 비행
		super.fly();	
		else 			//초음속 비행
			System.out.println("초음속으로 비행 합니다.");
	}
	
	public void method() {
		super.fly();
	}
}
