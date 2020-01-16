package p77;

public class FooService extends AbstractBaseSerivce {

	public FooService(String name) {
		super(name);
		
	}

	@Override
	public String say() {
		
		return "hello!";
	}

}
