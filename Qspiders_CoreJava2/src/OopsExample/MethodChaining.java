package OopsExample;

public class MethodChaining {
	
	//Non static Method
	public void hello() {
		
		System.out.println("Hello Method");
		test();
		demo();
		//Calling non static method of diff class within the non static method of another class
		Method m1 = new Method();
		m1.nonstaticMethod();
	}
	//Non static Method
	public void demo() {
		
		System.out.println("Demo Method");
	}
	
	public static void test() {
		
		System.out.println("Static Method");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Calling the non static method by creating the Object
		MethodChaining m = new MethodChaining();
		m.hello();
		

	}

}

class Method{
	
	public void nonstaticMethod() {
		
		System.out.println("Non static method in different class");
	}
}
