package OOPS_concepts;

public class Demo 
{
	//void method without returning anything//
	public void Task()
	{
		int res=10+20;
		System.out.println("the res value is"+res);
		System.out.println("im from res method");
	}
	
	
	//method which will return a value based on method datatype//
	int Gett()
	{
		char a='p';
		int res1=30,output;
		System.out.println(output=a+res1);
		return 'o';
	}
	
	int Put()
	{
		int add=50;
		return add;
	}
	
	
	
	 //Call by vlaue method//
	public int CallByValue(int i)
	{
		int Sum;
		System.out.println(Sum=20+i);
		return Sum;
	}
	
	public int CallByValue(int j,int i)
	{
		int res;
		res=i+j;
		System.out.println(res);
		return res;
		
	}


}

