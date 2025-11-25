package ConstructorExample;

public class ConstructorEg {

	//Non Parameterized Constructor
	public ConstructorEg() {
		
		System.out.println("Non Parameterized Constructor");
		
	}
	//Parameterized Constructor
	public ConstructorEg(int a, double d) {
		
		System.out.println("Parameterized Constructor 1");
		System.out.println(a);
		System.out.println(d);

	}
	
	public ConstructorEg(char b) {
		
		System.out.println("Parameterized constructor 2");
		System.out.println(b);
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorEg c = new ConstructorEg();

		ConstructorEg c1 = new ConstructorEg(20, 20.5);
		
		ConstructorEg c2 = new ConstructorEg('c');


	}

}
