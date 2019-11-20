package study.chap08_interface_inherit;

import study.chap08_inferface_multiple_interface.RemoteControl;

public interface MultipleRemoteControl extends RemoteControl, SearchAble {
	//상수
	//RemoteControl:추상메소드 존재
	//RemoteControl Interface에서는 default 메소드->추상 메소드를 변경가능
	//Searchable:추상메소드 존재
	void setMute(boolean mute);
	
	//자식 인터페이스의 추상메소드를 새로 ㅊ가
	void changeChannel(int channel);
	//default 메소드
	//정적 메소드
}
