package break_And_Continue;

public class Break_Concept {
public static void main(String[] args) 
{
	System.out.println("the break ex is : ");
	for(int i=1;i<=10;i++)
	{
		if(i==6)
		{
			break;
		}
		System.out.println(i);
	}
	System.out.println("----------------------");
	System.out.println("the Continue ex is : ");
	for(int i=1;i<=10;i++)
	{
		if(i==6)
		{
			continue;
		}
		System.out.println(i);
	}
}
}
