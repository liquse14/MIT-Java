package study.chap07.method_override;

public class SuperExample {

	public static void main(String[] args) {
		SuperSonicPlane ssp=new SuperSonicPlane();
		ssp.setMode(1);
		ssp.fly();		//�Ϲ� ����
		ssp.setMode(2);
		ssp.fly();		//������ ����
		
		

	}

}
