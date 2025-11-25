package CoreJava;

public class MethodExample {

	public static void hello() {
		
		System.out.println("Method 1");
	}
	
	public static int test(int a, double d) {
		
		System.out.println("Method 2");
		return 10;
	}
	
	public static void main(String[] args) {
		
		hello();
		test(2,2.2);
	}

}
