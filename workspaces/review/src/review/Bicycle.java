package review;

public class Bicycle {
int cadence=0;
int speed=0;
int gear=1;

void changeCadence(int newValue) {	//���Ƚ������
	cadence=newValue;
}
void changeGear(int newValue) {	//�ܼ�����
	gear=newValue;
}
void speedUp(int increment) {	//�ӵ�����,���°���ŭ �߰��ӵ�����
	speed=speed+increment;
}
void applybraker(int decrement) {	//�ӵ�����,���� ����ŭ �߰�����
	speed=speed-decrement;
}
void printStates() {	//������ ���Ƚ���� �ӵ� �ܼ����� �ֿܼ� ���
    System.out.println("cadence:" +
            cadence + " speed:" + 
            speed + " gear:" + gear);
}
}
