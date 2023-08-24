package exceptionHandling;

public class Try_CatchHandling {

	public static void main(String[] args)
	{
		int i=100;
		int j=0;
		System.out.println("program starts execution");
		try {
			int res=i/j;
			System.out.println("the value is "+res);
		    } 
		catch (Exception e)
		   {
			System.out.println(e);
		   }
		finally
		{
			String g="Chandhu";
			System.out.println(" commonly provides this finally block : "+g);
		}
		
		int Forr[]= {10,20,30,40,50};
		
		try
		{
			System.out.println(Forr[30]);
		} catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		System.out.println("program end here");
		
		

	}

}
