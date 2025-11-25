package CoreJava;

public class SwitchStatement {

	
	public static void switchstate() {
		
		int a =10;
		switch(a)
		{
		case 1 : {
			
			System.out.println("Case 1");
		}
		break;
		case 2 : {
			
			System.out.println("Case 2");
		}
		break;
		case 10 : {
			
			System.out.println("Case 3");
		} 
	//break;
		default : {
			
			System.out.println("default case");
		}
		//break;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		switchstate();

	}

}
