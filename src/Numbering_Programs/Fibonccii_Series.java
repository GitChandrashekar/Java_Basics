package Numbering_Programs;

public class Fibonccii_Series {

	public static void main(String[] args)
	{
		//0 1 1 2 3 5 8 13 21 34 55
	 
		System.out.println("printing fibonoccee numbers");
		int a=0;
		int b=1;
		int res;
		System.out.print(a+" "+b);
		for(int i=3;i<=10;i++)
		{
			res=a+b;
			System.out.print(" "+res);
			a=b;
			b=res;
		}

	}

}
