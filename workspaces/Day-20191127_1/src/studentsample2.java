
public class studentsample2 {

	public static void main(String[] args) {
				
		Student shion1=new Student();
		Student shion2=new Student();
		
		if(shion1!=shion2) {
			System.out.println("�ٸ���");
		}else {
			System.out.println("����");
		}
		if(shion1.equals(shion2)) {
			System.out.println("�ٸ���");
		}else {
			System.out.println("����");
		}
	}

}
