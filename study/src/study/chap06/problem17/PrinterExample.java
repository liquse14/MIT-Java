package study.chap06.problem17;

public class PrinterExample {

	// 정적 메소드와 인스턴스 메소드의 차이점
	public static void main(String[] args) {
		Printer.println(10);
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("홍길동");
	}

}
