package OOPS_concepts;

class Q
{
	int i=20;
}
class R
{
	int j=30;
}
class S extends Q    //class S extends Q,R//
{
	void Horror()
	{
		System.out.println(i);
	}
}
public class Multiple_InherEX {

	public static void main(String[] args)
	{
       S Child =new S();
       Child.Horror();
       

	}

}
