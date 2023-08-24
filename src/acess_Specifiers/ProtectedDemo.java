package acess_Specifiers;

 class Lion
{
	protected void King()
	{
	System.out.println("hi Lion protected");	
	}
}


public class ProtectedDemo {

	public static void main(String[] args)
	{
		
		Lion obj3 = new Lion();
		obj3.King();

	}

}
