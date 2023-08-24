package OOPS_concepts;

class Z
{
	void showA()
	{
		System.out.println("from A");
	}
}
class Y extends Z
{
	void showB()
	{
		System.out.println("from B");
	}
}
class T extends Z
{
	void showC()
	{
		System.out.println("from C");
	}
}
public class Hieracical_Inhertance 
{
	public static void main(String[] args) 
	{
		
		Y objB = new Y();
		objB.showA();
		objB.showB();
		
		T objC = new T();
		objC.showA();
		objC.showC();
		
	}

}
