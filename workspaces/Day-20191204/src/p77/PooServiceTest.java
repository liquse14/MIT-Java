package p77;

public class PooServiceTest {

	public static void main(String[] args) {
		Object obj=new FooService("Hello!");

		System.out.println(obj instanceof FooService);
		System.out.println(obj instanceof AbstractBaseSerivce);
		System.out.println(obj instanceof BaseService);
		System.out.println(obj instanceof Integer);
	}

}
