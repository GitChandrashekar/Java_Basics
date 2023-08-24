package interface_demo;
abstract class Q
{
	void god()
	{
		System.out.println("hi hello im from Q");
	}
}
 class C extends Q implements Ainterface,Binterface
{
	public void DemoA() 
	{
	System.out.println("im from the child C DemoA");
	}
	public void DemoB()
	{
		System.out.println("im from the child C DemoB");		
	}	
}
class Cinterface
{
	public static void main(String[] args) {

		
		Binterface obj1 = new C();   //we can call all members of Ainterface  
		obj1.DemoA();               // by creating Binterface obj bcz Binterface
		obj1.DemoAA();              //Extends Ainterface 
		obj1.DemoB();
		obj1.DemoBB();
		
		C obj2 = new C();  //here C is extending Q class and implementing the 
		obj2.DemoA();       // Binterface(where it extending Ainterface) so we can  
		obj2.DemoAA();   //use all the members of the Ainterface,Binterface and Q class
		obj2.DemoB();
		obj2.DemoBB();
		obj2.god();
		
		
		
		
	}
	}
