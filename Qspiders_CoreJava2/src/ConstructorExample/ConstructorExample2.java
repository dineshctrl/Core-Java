package ConstructorExample;

public class ConstructorExample2 {
	
	//Non static Global variables 
	int number;
	double decimal;
	char c;

	//Non static Global variables initialized using parameterized constructor 
	public ConstructorExample2(int n, double d, char ca) {
		
		//this keyword
		this.number = n;
		this.decimal = d;
		this.c = ca;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorExample2 ch = new ConstructorExample2(20,20.5,'h');
		ConstructorExample2 ch1 = new ConstructorExample2(100,21.5,'g');

		System.out.println(ch.number);
		System.out.println(ch.decimal);
		System.out.println(ch.c);
		
		System.out.println(ch1.number);
		System.out.println(ch1.decimal);
		System.out.println(ch1.c);

		
	}

}
