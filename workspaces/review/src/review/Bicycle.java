package review;

public class Bicycle {
int cadence=0;
int speed=0;
int gear=1;

void changeCadence(int newValue) {	//페달횟수변경
	cadence=newValue;
}
void changeGear(int newValue) {	//단수변경
	gear=newValue;
}
void speedUp(int increment) {	//속도증가,들어온값만큼 추가속도증가
	speed=speed+increment;
}
void applybraker(int decrement) {	//속도감소,들어온 값만큼 추가감소
	speed=speed-decrement;
}
void printStates() {	//현재의 페달횟수와 속도 단수값을 콘솔에 출력
    System.out.println("cadence:" +
            cadence + " speed:" + 
            speed + " gear:" + gear);
}
}
