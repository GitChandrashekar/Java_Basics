package abstraction;

abstract class Fore
{
	//we cannot create abstract class's object  directly we have to create by using the sub class//
	//defined method//
	void goo()
	{
		int i=100;
		System.out.println("hi hello"+i);
	}
	
	//undefined methods//
	abstract void hii();
	abstract void hii2();
	abstract void hii3();
}
class Boran extends Fore
{

	
	void hii()
	{
	System.out.println("hii() hello hii()");	
		
	}

	
	void hii2() 
	{
		
		System.out.println("hii2() hello gop");
	}

	
	void hii3()
	{
	
		System.out.println("hii3() hello gop");
	}
	
}
public class Demo_Abstract {

	public static void main(String[] args)
	{
		Fore f = new Boran();
		f. hii();
		f.hii2();
		f.hii3();
		f.goo();
		
		Demo1_Abstract f1 = new Demo1_Abstract();
		f1.hii();
		f1.hii2();
		f1.hii3();
		
				
	}

}
