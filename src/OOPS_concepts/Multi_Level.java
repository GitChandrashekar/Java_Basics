package OOPS_concepts;



class A1 extends D1{
	void showA1()
	{
		System.out.println("hi helo im from the A1");
	}
}
class B1 extends C1 {
	void showB1()
	{
		System.out.println("hi helo im from the B1");
	}
}
class C1 extends A1{
	void showC1()
	{
		System.out.println("hi helo im from the C1");
	}
}
class D1  {
	void showD1()
	{
		System.out.println("hi helo im from the D1");
	}
}
public class Multi_Level {

	public static void main(String[] args)
	{
		C1 objC=new C1();
		objC.showA1();
		
		B1 objB =new B1();
		objB.showC1();
		 
		A1 objA = new A1();
		objA.showD1();

	}

}
