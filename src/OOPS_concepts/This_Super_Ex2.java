package OOPS_concepts;
class parenFollow
{
	int i=110;
	int j=999;
	
}
class child111 extends parenFollow
{
	int j=100000;
}
class Follow extends child111
{
	int i=90;  //second preference will be given//
	void liger()
	{
		int i=20; // b using this.i it will prints //
System.out.println("the i value is : "+this.i+" from using object and intialing value to the variable this keyword");
System.out.println("the i value is : "+i+" normal i prefers the global declaration of class");
System.out.println("the i value is :"+super.i+" it will prints ");
System.out.println("the j value is : "+j);//
System.out.println("the super j value is : "+super.j);//
	}
}
public class This_Super_Ex2 {

	public static void main(String[] args)
	{

		Follow obj1 = new Follow();
//		obj1.i=900;  // first preference will be given//
		obj1.liger();
		
		
		

	}

}
