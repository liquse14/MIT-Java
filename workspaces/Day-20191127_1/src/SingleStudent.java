
public class SingleStudent {
	
	private static SingleStudent instance=new SingleStudent();

	public static SingleStudent getInstance() {
		return instance;
	}
}
