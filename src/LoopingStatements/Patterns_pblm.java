package LoopingStatements;

public class Patterns_pblm 
{
	public static void main(String[] args) {
		
		//1.// vertical 6 stars//
		for (int i=0;i<=5;i++)
		{
			System.out.println("*");
		}
		
		
	System.out.println("----------------------------");
	//2.//horizantal 6 starts//
	for (int i=0;i<=5;i++)
	{
		System.out.print("* ");
	}
	System.out.println("----------------------------");
	
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<=5;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	
	
	
	System.out.println("----------------------------");
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<=5;j++)
		{
			if(i==j)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print("  ");
			}
		    }
		 System.out.println();
	}
	
	System.out.println("----------------------------");
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<=5;j++)
		{
			if(i!=j)
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
		    }
		 System.out.println();
	}
	
	System.out.println("----------------------------");
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<=5;j++)
		{
			if(i>=j)
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
		    }
		 System.out.println();
	}
	
	System.out.println("----------------------------");
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<=5;j++)
		{
			if(i<=j)
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
		    }
		 System.out.println();
	}
	
	
	
	System.out.println("----------------------------");
	for(int i=1;i<7;i++)
	{
		for(int j=1;j<=7;j++)
		{
			if(i==1 || i==7 || i==j || i+j==8)                  
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
		    }
		 System.out.println();
		 
		 
	
			
	
	}
	
	
	
	
	
	
}}

