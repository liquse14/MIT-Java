package study.chap07.argument_polymorphism;

public class VehicleExample {

	public static void main(String[] args, Bus vehicle) {
		Driver driver = new Driver();
		driver.drive(new Bus());	//������ ����->����
		driver.drive(new Taxi());	//�ýø� ����
		Bus bus=(Bus)vehicle;//���� Ÿ�� ��ȯ
		driver.drive(vehicle);
		driver.drive(new Taxi());
		double d=1.24;
		int num = (int) d;
		//�Ű������� � �ڽİ�ü�� �־��ֳĿ� ���� �ڽİ�ü�� run()�� ȣ��ȴ�
	}
}
