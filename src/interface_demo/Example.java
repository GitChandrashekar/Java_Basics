package interface_demo;

//1 interface 
 interface Print
{
//undefined method in interface//
void print();

//defined method have to use by declaring it by default keyword in interface//
default  void horse()
{
	int r=90;
	System.out.println("hi hello im Horse from the print interface "+r);
}
}
 //2.interface
 interface Show_Table
{
	 // undefined method from interface 2nd//
	void show();
	
	public default void Joke()
	{
		System.out.println("hey im form joker joke :-)");
	}
}

 //class which is implementing 2 interfaces//
 //here we are achieving multiple inheritance  by including two interfaces at a time//
//the interfaces methods which are undefined is mandatory to make them as defined in implemented class
//for the defined methods in the interface it is optional to use in the implemented class// 
class Fera implements Show_Table,Print
{
	public void print() 
	{
		System.out.println("from print interface representing in Fera through Example ");
	}

	
	public void show() 
	{
		System.out.println("from Show_Table interface representing in Fera through Example ");
	}
}
public class Example {

	public static void main(String[] args)
	{
		
//		interface's object cannot be created directly by using the interface construtor
//		we have to use subclass for creating object
		
		Print obj1 = new Fera();
		obj1.print();
		obj1.horse();
		
		Show_Table obj2 = new Fera();
		obj2.show();
	}
}
