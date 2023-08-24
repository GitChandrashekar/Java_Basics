package OOPS_concepts;
class TwoconsDemo
{
	TwoconsDemo()
	{
		System.out.println("im from first constructor");
		System.out.println("non parameterized");
	}
	void Father()
	{
		int age=40;
		System.out.println("Father age is "+age);
	}
	TwoconsDemo(String d)
	{
		System.out.println("im from Second constructor");
		System.out.println("parameterized String type");
	}
	void Son()
	{
		int age=20;
		System.out.println("Son age is "+age);
	}
	TwoconsDemo(int y)
	{
		System.out.println("im from thirds constructor");
		System.out.println("parameterized Int type");
	}
	void Family()
	 {
		String t =" very good family ";
		System.out.println("whole family members : "+t);
	}
	
}
public class Two_Constructors {

	public static void main(String[] args)
	{
		
System.out.println("we can use multiple constructor by using the constructor overloading concept : ");
		TwoconsDemo Demo1= new TwoconsDemo();
		Demo1.Father();
		TwoconsDemo Demo2= new TwoconsDemo("Chandu");
		Demo2.Son();
		TwoconsDemo Demo3= new TwoconsDemo(100);
		Demo3.Family();
	}

}
