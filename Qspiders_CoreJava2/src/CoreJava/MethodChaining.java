package CoreJava;

public class MethodChaining {
	
	
	public static void hello() {
		
		System.out.println("Hello Method");
		demo();
	}
	
	public static void test(double d) {
		
		System.out.println("Passing the data type");
		System.out.println(d);
		hello();
	}
	
	public static void demo() {
		
		System.out.println("demo method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test(0.5);

	}

}
