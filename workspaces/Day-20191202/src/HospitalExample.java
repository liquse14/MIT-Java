public class HospitalExample {
	public static void main(String args) {
		PersonValue pv=new PersonValue();
		DoctorValue dv=new DoctorValue();
		NurseValue nv=new NurseValue();
		PatientValue pav=new PatientValue();
		
		System.out.println("Person Info :"+pv.getInfo());
		System.out.println("Doctor Info :"+pv.getInfo());
		System.out.println("Nurse Info :"+pv.getInfo());
		System.out.println("Patien Info :"+pv.getInfo());
	}
}
