package study.chap07.field_polymorphism;

public class KumHoTire extends Tire {

	public KumHoTire(String location, int maxRotation) {
		super(location,maxRotation);
	}
	
	//�ڽ� ��ü���� �θ��� �޼ҵ带 ������
	@Override
	public boolean roll() {
		++acculatedRotation;
		if(acculatedRotation<maxRotation) {//��� ��� ����
			System.out.println(location+"KumHoTire ����:"+(maxRotation-acculatedRotation));
		}else {
			System.out.println("***"+location+"KumHoTireTire��ũ***");
			return false;
		}
		return false;
	}
}
