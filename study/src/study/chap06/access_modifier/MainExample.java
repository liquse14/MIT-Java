package study.chap06.access_modifier;

public class MainExample {

	public static void main(String[] args) {
		Car car = new Car();			// O
		Car car2 = new Car("����");		// O
		Car car3 = new Car(10.5);		// O
		Car car4 = new Car(10, "���");	// X
		car.field1 = 20;
		car.field2 = 20;
		car.field3 = 20;
		car.field4 = 20;
		
		car.method1();
		car.method2();
		car.method3();
		car.method4();
	}

}
