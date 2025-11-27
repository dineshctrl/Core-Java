package OOPSConcepts;

public class EncapsulationEg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s = new Student (111, "Allen", 80.5);
		System.out.println(s.getSid());
		System.out.println(s.getSname());
		System.out.println(s.getSmarks());
		
		System.out.println("...................");


		s.setSid(222);
		System.out.println(s.getSid());
		
		s.setSname("John");
		System.out.println(s.getSname());
		
		s.setSmarks(90.0);
		System.out.println(s.getSmarks());
		
		System.out.println("...................");
		
		Student s1 = new Student (333, "Smith", 90.5);
		System.out.println(s1.getSid());
		System.out.println(s1.getSname());
		System.out.println(s1.getSmarks());
		
	}

}

//logical class
 class Student{
	
	private int sid;
	private String sname;
	private double smarks;
	

public Student(int i, String string, double d) {
		// TODO Auto-generated constructor stub
		this.sid = sid;
		this.sname = sname;
		this.smarks = smarks;
		
		
	}

//getter methods
public int getSid() {
	
	return sid;
	
}

public String getSname() {
	
	return sname;
}

public double getSmarks() {
	
	return smarks;
}

//setter methods

public void setSid(int sid) {
	
	this.sid = sid;
	
}
public void setSname(String sname) {
	
	this.sname = sname;
}

public void setSmarks(double smarks) {
	
	this.smarks = smarks;
}
}
