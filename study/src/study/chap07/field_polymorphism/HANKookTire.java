package study.chap07.field_polymorphism;

public class HANKookTire extends Tire {

	public HANKookTire(String location, int maxRotation) {
		super(location,maxRotation);
	}
	
	//�ڽ� ��ü���� �θ��� �޼ҵ带 ������
	@Override
	public boolean roll() {
		++acculatedRotation;
		if(acculatedRotation<maxRotation) {//��� ��� ����
			System.out.println(location+"HanKookTire ����:"+(maxRotation-acculatedRotation));
		}else {
			System.out.println("***"+location+"HanKookTire��ũ***");
			return false;
		}
		return false;
	}
}
