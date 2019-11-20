package study.chap07.method_override;

public class MainExample {

	public static void main(String[] args) {
		LazerPrinter printer =new LazerPrinter();
		printer.print("문서1");	//부모로부터 상속받은것,자식(재정의)
			//자식(재정의)->자식이 재정의한 메소드를 실행(규칙)

	}

}
