package OOPS_concepts;

class A     //super or parent  class //
{
	void Show()
	{
	int i=20;
	System.out.println("i's value is "+i);
	
	}
	
	int a=20+20;
	
}
class B extends A      //sub or child class//
{
	void BB()
	{ 
		int i=50;
		System.out.println("im from B : "+i);
		System.out.println(a);
	}
}
public class Inheritance_Single
{

	public static void main(String[] args)
	{
		
		B obj =new B();
		obj.Show(); 
		
		// inheriting the A from the B.//
		
		 A obj1 = new A();
		 obj1.Show();
		 
//		 obj.BB();
		 
		

	}

}
