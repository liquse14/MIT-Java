package study.chap07.field_polymorphism;

public class KumHoTire extends Tire {

	public KumHoTire(String location, int maxRotation) {
		super(location,maxRotation);
	}
	
	//자식 객체에서 부모의 메소드를 재정의
	@Override
	public boolean roll() {
		++acculatedRotation;
		if(acculatedRotation<maxRotation) {//계속 사용 가능
			System.out.println(location+"KumHoTire 수명:"+(maxRotation-acculatedRotation));
		}else {
			System.out.println("***"+location+"KumHoTireTire펑크***");
			return false;
		}
		return false;
	}
}
