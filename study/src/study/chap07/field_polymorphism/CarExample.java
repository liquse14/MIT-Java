package study.chap07.field_polymorphism;

public class CarExample {

	public static void main(String[] args) {
		//�ڵ����� ����->������ Ƚ���� ����->Ÿ�̾� ������ ���ؼ� ��ũ
		//�ڵ����� stop->Ÿ�̾ ��ü->��� ����	
		Car car=new Car();
		for(int i=0;i<5;i++) {
			int problemLocation =car.run();
			switch(problemLocation) {
			case 1:
				System.out.println("�տ��� HankookTire�� ��ü");
				car.frontLeftTire=new HANKookTire("�տ���", 15);
				break;
				case 2:
				System.out.println("�տ����� KumHoTire�� ��ü");
				car.frontLeftTire=new HANKookTire("�տ�����", 10);
				break;
				case 3:
				System.out.println("�տ��� HankookTire�� ��ü");
				car.frontLeftTire=new HANKookTire("�տ���", 15);
				break;
				case 4:
				System.out.println("�ڿ����� KumHoTire�� ��ü");
				car.backRightTire=new HANKookTire("�ڿ�����", 15);
				break;

				
			}
		}

	}

}
