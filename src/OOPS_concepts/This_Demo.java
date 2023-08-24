
package OOPS_concepts;
class Main1{
	int i=100;
	int show()
	{
		System.out.println("i from the Main1 show"+i);
		return i;
	}
	class Demo1
	{
		int i=20;
		void show()
		{
			System.out.println("i from the Demo1 show"+i);
		}
	}
	class Demo2
	{
		int i=30;
		void show()
		{
			System.out.println("i from the Demo1 show"+i);
		}
	}
}

public class This_Demo 
{
	public static void main(String[] args) 
	{
		
		Main1 M= new Main1();
		M.i=1000;
		int y=M.show();
		System.out.println(y);
		
		Demo1 g =new Demo1();
//		g.show(22);
	}
}





