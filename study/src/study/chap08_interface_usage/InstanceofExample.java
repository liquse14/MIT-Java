package study.chap08_interface_usage;

public class InstanceofExample {
	
	public static void main(String[] args) {
		RemoteControl rc=new SettopBox();	//왼쪽 인터페이스 타입 변수이름=new구현객체();
//		rc.volume=10;	//구현객체에서 정의한 필드
		//강제타입변환
		SettopBox sb=(SettopBox)rc;
		if(rc instanceof Television) {
			Television tv=(Television)rc;//Error(ClassCastException 발생)
		}else if(rc instanceof SettopBox) {
			SettopBox s2=(SettopBox)rc;
		}
	}

}
