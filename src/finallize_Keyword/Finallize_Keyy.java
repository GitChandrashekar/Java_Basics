package finallize_Keyword;



public class Finallize_Keyy {

	public static void main(String[] args)
	{
		Finallize_Keyy obj1 = new Finallize_Keyy();
		System.out.println("the hashcode is : "+obj1.hashCode());
		obj1 = null;
		System.out.println("the obj1 val after it is null : "+obj1 );
		System.gc();
		
//		System.out.println(obj1);
		
		
		
		
		

	}

}
