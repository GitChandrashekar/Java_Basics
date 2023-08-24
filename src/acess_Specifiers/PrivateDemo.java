package acess_Specifiers;

public class PrivateDemo {
	
	 	 private void Demo(int goat,int boat)
	 	 {
	 	   System.out.println("hi Goat from private"+goat); 
	 	   System.out.println("hi boat from public "+boat);
	      }
	 	 
	 	public static void main(String[] args) 
	 	{
	 		PrivateDemo King =new PrivateDemo();
	 		King.Demo(10000, 20000);
	 		
	 	}

}
