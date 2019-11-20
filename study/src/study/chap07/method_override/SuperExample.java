package study.chap07.method_override;

public class SuperExample {

	public static void main(String[] args) {
		SuperSonicPlane ssp=new SuperSonicPlane();
		ssp.setMode(1);
		ssp.fly();		//일반 비행
		ssp.setMode(2);
		ssp.fly();		//초음속 비행
		
		

	}

}
