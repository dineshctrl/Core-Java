package ConstructorExample;

public class ThiskeywordEg {
	
	//Non static Global Variable
	int a = 10;
	
	public void demo() {
		
		//Local variable - Always first preference will give for the local variable
		int a = 20;
		System.out.println(this.a); //Calling Non static global variable
		System.out.println(a);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThiskeywordEg t = new ThiskeywordEg();
		System.out.println(t.a); //Global variable will be accessed
		t.demo();

	}

}
