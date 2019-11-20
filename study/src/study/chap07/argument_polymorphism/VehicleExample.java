package study.chap07.argument_polymorphism;

public class VehicleExample {

	public static void main(String[] args, Bus vehicle) {
		Driver driver = new Driver();
		driver.drive(new Bus());	//배차를 버스->운전
		driver.drive(new Taxi());	//택시를 운전
		Bus bus=(Bus)vehicle;//강제 타입 변환
		driver.drive(vehicle);
		driver.drive(new Taxi());
		double d=1.24;
		int num = (int) d;
		//매개변수에 어떤 자식객체를 넣어주냐에 따라 자식객체의 run()이 호출된다
	}
}
