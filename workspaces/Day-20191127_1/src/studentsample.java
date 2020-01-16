
public class studentsample {

	public static void main(String[] args) {
		
		/*1.객체 변수 생성
		 student shion*/
		
		/*2.객체 변수 생성
		 student shion=null;
		 */

		/*1.과2.경우
		 * 선언된 객체 변수 인스턴스화해서 생성
		shion=new student();*/
		
		/*3.
		 * 객체 변수 인스턴스 생성
		 * student shion = new student();*/
		
		Student shion=new Student();
		
		//입력값을 입력
		shion.setName("홍길동");
		shion.setScore(90);
		//구현된 처리로직을 호출
		shion.printScore();
	}

}
