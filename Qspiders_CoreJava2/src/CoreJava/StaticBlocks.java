package CoreJava;

public class StaticBlocks {
	
	
	
	public static void hello() {
		
		System.out.println("Hello Method");
	}
	
	static { //it will be executed first
		
		System.out.println("Static block is executed");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		hello();

	}

}