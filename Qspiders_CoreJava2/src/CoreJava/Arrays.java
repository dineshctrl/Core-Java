package CoreJava;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaration o an array
		int[] ar;
		
		//Creation of an array
		ar = new int[3];
		
		//starting the elements in an array
		ar[0] = 10;
		ar[1] = 20;
		ar[2] = 30;
		
		System.out.println(ar);
		
		System.out.println(ar[1]);
		
		
		//Another array
		
		int[] arr = {10,20,30,40};
		
		System.out.println(arr);
		
	//using foreach loop to print all the statements
		for(int i : arr) {
			
			System.out.println(i);
		} 
	}

}
