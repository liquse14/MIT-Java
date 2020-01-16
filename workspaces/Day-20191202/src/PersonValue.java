
public class PersonValue {
	public int age;
	public String name;
	
	public PersonValue() {
		age=0;
		name="Someone name";
	}
	
	public String getInfo() {
		String rt=new String();
		rt="age:"+age+",name:"+name;
		return rt;
	
	}
}
