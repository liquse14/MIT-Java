package review;

public class BicycleTest {

	public static void main(String[] args) {
		Bicycle bicycle=new Bicycle();
		bicycle.changeCadence(50);
		bicycle.speedUp(10);
		bicycle.changeGear(2);
		bicycle.printStates();
		
		bicycle.changeCadence(50);
		bicycle.speedUp(10);
		bicycle.changeGear(2);
		bicycle.changeCadence(40);
		bicycle.speedUp(10);
		bicycle.changeGear(3);
		bicycle.printStates();
	}
//��ü1 ���� ���50->���ǵ��10->��� 2���Ŀ�->���簪 ���
//��ü2 ���� ���50->���ǵ��10->���2��->���40->���ǵ��10->���3��->���簪
	
//������� cadence:50 speed:10 gear:2
//		cadence:40 speed:30 gear:3
}
