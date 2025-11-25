package CoreJava;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int[] arr = {10,20,30,40};
	
	System.out.println("Accessing array elements");
	
	for (int i=0;i<arr.length;i++) {
		
		System.out.println(arr[i]);
	}

	System.out.println("Array elements after reversing");
	for(int i= arr.length-1;i>=0;i--) {
		
		System.out.println(arr[i]);
	}
	}

}
