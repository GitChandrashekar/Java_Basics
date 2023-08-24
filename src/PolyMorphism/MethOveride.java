package PolyMorphism;

class Parent
{
	void Run()  //parent method
	{
		int d=30;
		System.out.println("d from parent = "+d);
	}
}
class Child extends Parent
{
	void Run()  //this method will execute by over_riding the parent method 
	{
		int d=50;
		System.out.println("d from Child = "+d);
	}
}
public class MethOveride {

	public static void main(String[] args)
	{
		
		Child Ch= new Child();
		Ch.Run();

	}

}
