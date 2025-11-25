package CoreJava;

public class MethodOverloading {
	
	
	public static void hello() {
		
		System.out.println("Non-parametized method");
	}
	
	//passing data type
	public static void hello(int a ) {
		
		System.out.println("Having int type arguments");
	}
	
	//change in data type
	public static void hello(int a, char c) {
		
		System.out.println("Having two arguments");
	}

	//change in data type
	public static void hello(double a, int b) {
		
		System.out.println("Having chnage in data types arguments");
	}
	
	//Executing in Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		hello();
		hello(20);
		hello(20, 'a');
		hello(2.5, 21);

	}

}
