package study.chap07.field_polymorphism;

public class Tire {
	//�ʵ�
	public int maxRotation;			//����
	public int acculatedRotation;	//���� ȸ����
	public String location;			//������ġ
	
	//������
	public Tire(String location,int maxRotation) {
		this.location=location;
		this.maxRotation=maxRotation;
	}
	//�޼ҵ�
	public boolean roll() {//Tire�� �������� ���
		++acculatedRotation;
		if(acculatedRotation<maxRotation) {//��� ���
			System.out.println(location+" Tire����: " + (maxRotation- acculatedRotation));
			return true;	//��� ��� ����
		}else {		//������ �� ��
			System.out.println("***" +location + " Ÿ�̾� ��ũ***");
			return false;	//��ũ �߻�
		}
	}
	
}
