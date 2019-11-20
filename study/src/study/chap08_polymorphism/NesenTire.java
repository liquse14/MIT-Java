package study.chap08_polymorphism;

public class NesenTire implements Tire {

	//�ʵ�: Tire Class���� ���ǵ� ->���� Ŭ����
	String location;
	int maxRotation;
	int accumulatedRotation;
	
	//������
	public NesenTire(String location,int maxRotation) {
		this.location=location;
		this.maxRotation=maxRotation;
	}
	//Tire �������̽� ������
	//������ �������� ����:����, ����ȸ����,��ũ,��ġ�� ��ȯ
	@Override
	public boolean roll() {
		accumulatedRotation++;	//������ ȸ��
		if(accumulatedRotation<maxRotation) {//��� ���
			System.out.println(location+"NesenTire ���� ����"
					+(maxRotation - accumulatedRotation));
			return true;	//��ӻ�밡��
		}
		else {
			System.out.println("****"+location + " NesenTire ��ũ****, ");
			return false;
		}
	}

}
