package CoreJava;

public class Operators {
	

	public static void main(String[] args) {
		
		//Arithmetic operators

		System.out.println(10+2); 
		System.out.println(10-2);
		System.out.println(10*2);
		System.out.println(10/2); //Gives the quotient
		System.out.println(10%2); //Gives the remainder 
		
		// + operator with the string -> Concatination -> Number + string - Number will concatenate with the string
		
		System.out.println(10+10 +" "+  "Hi");
		System.out.println(20 + "Hello");
		System.out.println("Hi" +" "+"Good Morning");
		System.out.println(10+ "Hello" +20);
	
		
		//relational operators
		
		int a = 20;
		int b = 10;
		int c = 5;
		
		System.out.println(a==b);
		System.out.println(a<b);
		
		
		//Logical Operator
		
		//Logical AND
		System.out.println(a<b && a>=b);
		System.out.println(a<b && a>=c);
		
		//Logical OR
		System.out.println(a<b || a>=b);
		System.out.println(a<b || a>=b);
		
		
		//Conditional Operator
		
		System.out.println(10>20?10:20);
		
		//Increment Operator
		System.out.println(b++); //post increment
		System.out.println(++b); //pre increment
		
		


		
	}

}
