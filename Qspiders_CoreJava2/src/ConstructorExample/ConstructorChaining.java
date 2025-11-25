package ConstructorExample;

public class ConstructorChaining {
	
	public ConstructorChaining() {
		
		this(20.5);
		System.out.println("First constructor");
		
	}
	
	public ConstructorChaining(double d) {
		
		this(20);
		System.out.println("Second constructor");

	}
	public ConstructorChaining(int a) {
		
		System.out.println("Third constructor");

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorChaining c = new ConstructorChaining();

	}

}
