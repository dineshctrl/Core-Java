package ConstructorExample;

public class ConstrucorOverloading {
	
	
	public ConstrucorOverloading() {
		
		System.out.println("Zero args constructor");
	}
	
	public ConstrucorOverloading(int a) {
		
		System.out.println("having 1 args");
		System.out.println(a);

	}
	
	public ConstrucorOverloading(double i) {
		
		System.out.println("having diff args");
		System.out.println(i);
		
	}
	
	public ConstrucorOverloading(int b, char c) {
		
		System.out.println("having 2 args");
		System.out.println(b);
		System.out.println(c);


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstrucorOverloading c = new ConstrucorOverloading();
		ConstrucorOverloading c1 =new ConstrucorOverloading(20);
		ConstrucorOverloading c2 =new ConstrucorOverloading(20.5);
		ConstrucorOverloading c3 =new ConstrucorOverloading(21, 'c');

	}

}
