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
//객체1 만들어서 페달50->스피드업10->기어 2단후에->현재값 출력
//객체2 만들어서 페달50->스피드업10->기어2단->페달40->스피드업10->기어3단->현재값
	
//결과값은 cadence:50 speed:10 gear:2
//		cadence:40 speed:30 gear:3
}
