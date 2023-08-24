package acess_Specifiers;

 public class XW
{
	public void Mango()
	{
		System.out.println("hi hello");
	}
	
	 public int Data(int k,int p)
	 {
		int res=k+p;
		System.out.println("the k and p is :"+res);
		 return 0;
	 }
	
}
 class Public_Demo {

	public static void main(String[] args)
	{
		XW House= new XW();
		House.Mango();
		House.Data(20, 100);

	}

}
