package study.chap08_polymorphism;

public class HankookTire implements Tire {

	//�ʵ�: Tire Class���� ���ǵ� ->���� Ŭ����
	String location;
	int maxRotation;
	int accumulatedRotation;
	
	//������
	public HankookTire(String location,int maxRotation) {
		this.location=location;
		this.maxRotation=maxRotation;
	}
	//Tire �������̽� ������
	//������ �������� ����:����, ����ȸ����,��ũ,��ġ�� ��ȯ
	@Override
	public boolean roll() {
		accumulatedRotation++;	//������ ȸ��
		if(accumulatedRotation<maxRotation) {//��� ���
			System.out.println(location+"HankookTire ���� ����"
					+(maxRotation - accumulatedRotation));
			return true;	//��ӻ�밡��
		}
		else {
			System.out.println("****"+location + " HankookTire ��ũ****, ");
			return false;
		}
	}

}
