package review;

public class Add1 {
//필드명(맴버변수)
int num1;
int num2;
//생성자
	Add1(int num1,int num2){
		this.num1=num1;
		this.num2=num2;
	}
	Add1(){

	}
//메소드
	int sum() {
		return num1+num2;
	}
	int sub() {
		return num1-num2;
	}
	void print(){
		System.out.print(+num1);
		System.out.println(","+num2);
	}
}
