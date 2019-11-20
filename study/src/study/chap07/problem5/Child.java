package study.chap07.problem5;

public class Child extends Parent {
	private int studentNo;
	
	//기본 생성자가 정의되어 있지 않음
	//기본 생성자가 필요하면 꼭 정의를 해주어야 함.
	
	
	//디폴트생성자가 아닌 다른 생성자
	public Child(String name,int studentNo) {
		super(name);	//부모 Parent의 디폴트 생성자를 호출
		this.name=name;
		this.studentNo = studentNo;
		
	}
}
