package HasaRelation;

public class HasarelationEg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		College c =  new College(111, "Allen","Chennai" , new Student (1,"John",90.0));

	}

}

//dependemt object
class Student{
	
	int sid;
	String sname;
	double smarks;
	
	public Student(int sid, String sname, double smarks) {
		
		this.sid = sid;
		this.sname = sname;
		this.smarks = smarks;
		
	}
	
	public void studentdetails() {
		
		System.out.println("StudentID :"+sid+","+"Student name: "+sname+","+ "Student Marks: "+smarks);
	}
}

//depending object

class College{
	
	int cid;
	String cname;
	String clocation;
	
	//dependent type variable 
	Student st;
	
	public College(int cid, String cname ,String cloaction, Student st ) {
		
		this.cid=cid;
		this.cname = cname;
		this.clocation =  clocation;
		this.st=st;
	}
	public void collegedetails() {
		
	
		System.out.println("College ID:"+cid+","+" College name:"+cname+","+"College Location:" +clocation);
	}
}
