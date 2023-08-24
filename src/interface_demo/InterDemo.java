package interface_demo;
interface inter
{
	void show();
	void demand();
	void ego();
	
	default void boom9()
	{
		System.out.println("hi hello from interface boom9");
	}
}
	class Rat implements inter
	{
		public void show()
		{
			System.out.println("from Show Rat");
		}
		public void demand() 
		{
			System.out.println("from Show demand");
		}
		public void ego()
		{
			System.out.println("from Show ego");
		}
	}

	class Dare extends Rat
	{
		
	}
public class InterDemo {

	public static void main(String[] args)
	{
		inter obj1 = new  Dare();
		obj1.boom9();
		obj1.show();
		obj1.demand();
		obj1.ego();
	}
}