package Numbering_Programs;

public class Even_or_Odd 
{
	public static void main(String[] args)
	{
		System.out.println("even or Odd number");
		int num=-9;
		if(num%2==0 && num>0)
		{
			System.out.println("it is even number : "+num);
		}
		else if(num%2==1 && num>0)
		{
			System.out.println("it is odd number : "+num);
		}
		else 
		{
			System.out.println("neither odd nor even : "+num);
		}
	}

	
}
