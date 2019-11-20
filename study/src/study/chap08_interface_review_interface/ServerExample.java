package study.chap08_interface_review_interface;

public class ServerExample {

	public static void main(String[] args) {
		ClassA classA=new ClassA(new OracleDB());
		classA.insert();
		classA.select();
		ClassA classB=new ClassA(new OracleDB());
		classB.insert();
		classB.select();
		ClassA classC=new ClassA(new MSSql());
		classC.insert();
		classC.select();

	}

}
