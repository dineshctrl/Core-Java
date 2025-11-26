package OOPSConcepts;

//Driver class
//Performing accessing operations
public class EncapsulationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee();
		e.setEmpid(111);
		System.out.println(e.getEmpid());
		
		e.setEmpname("Allen");
		System.out.println(e.getEmpname());
		
		e.setsalary(2000.50);
		System.out.println(e.getSalary());

		e.setphonenumber(735855);
		System.out.println(e.getphonenumber());
	}

}


//Logic class
class Employee {
	
	
	//Attributes or global variables
	private int empid;
	private String empname;
	private double salary;
	private long phonenumber;
	
	
	//getter Method
	public int getEmpid() {
		
		return empid;
	}
	public String getEmpname() {
		
		return empname;
	}
	public double getSalary() {
		
		return salary;
		
	}
	
	public long getphonenumber() {
		
		return phonenumber;
	}
	
	
	//Setter Method
	public void setEmpid(int empid) {
		
		this.empid = empid;
	}
	public void setEmpname(String empname) {
		
		this.empname = empname;
	}
	
	public void setsalary(double salary) {
		
		this.salary = salary;
	
	}
	public void setphonenumber(long phonenumber) {
		
		this.phonenumber = phonenumber;
	}
}