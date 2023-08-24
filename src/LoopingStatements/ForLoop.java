package LoopingStatements;

public class ForLoop {
	
public static void main(String[] args)
{
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=4;j++)                 // * * * *
		{                                     // * * * *
			System.out.print("* ");           // * * * * 
		}                                     // * * * *  
		System.out.println();
	}
	
	System.out.println("------*-----------*---------------*");
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=4;j++)                 // 1 1 1 1
		{                                     // 2 2 2 2
			System.out.print(i+" ");          // 3 3 3 3 
		}                                     // 4 4 4 4  
		System.out.println();
	}
	
	System.out.println("------*-----------*---------------*");
	
	
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=4;j++)                 // 1 2 3 4
		{                                     // 1 2 3 4
			System.out.print(j+" ");          // 1 2 3 4
		}                                     // 1 2 3 4
		System.out.println();
	}
	
	System.out.println("------*-----------*---------------*");
	
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=4;j++)                 
	 {                                     
		if(i==j)
		{
			System.out.print("* ");              //*
		}                                        //  *
		else                                     //    *
		{                                        //      * 
			System.out.print(" ");
		}
		
	}
		System.out.println();
	}
	System.out.println("------*-----------*---------------*");
	
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=4;j++)                 
	 {                                     
		if(i+j==5)
		{
			System.out.print("* ");              //        *
		}                                        //      *
		else                                     //    *
		{                                        //  * 
			System.out.print(" ");
		}
		
	}
		System.out.println();
	}
	System.out.println("------*-----------*---------------*");
	
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=4;j++)                 
	 {                                     
		if(i==1||i==4||j==1||j==4)
		{
			System.out.print("* ");              // * * * *
		}                                        // *     *
		else                                     // *     *
		{                                        // * * * * 
			System.out.print("  ");
		}
		
	}
		System.out.println();
	}
	System.out.println("------*-----------*---------------*");
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)                 
	 {                                     
		if(i==3||j==1||j==5)
		{
			System.out.print("* ");              // *     *
		}                                        // *     *
		else                                     // * * * *    
		{                                        // *     * 
			System.out.print("  ");              // *     *
		}
		
	}
		System.out.println();
	}
	System.out.println("------*-----------*---------------*");
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)                 
	 {                                     
		if(i==j||j==1||j==5)
		{
			System.out.print("* ");              // *        *
		}                                        // *  *     *
		else                                     // *    *   *    
		{                                        // *      * *
			System.out.print("  ");              // *       **
		}
		
	}
		System.out.println();
	}
	System.out.println("------*-----------*---------------*");
	
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)                 
	 {                                     
		if(i==1||i+j==6||i==5)
		{
			System.out.print("* ");              // * * * * *
		}                                        //       *
		else                                     //     *  
		{                                        //   *
			System.out.print("  ");              // * * * * *
		}
		
	}
		System.out.println();
	}
	System.out.println("------*-----------*---------------*");
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)                 
	 {                                     
		if(i==j||i+j==6)
		{
			System.out.print("* ");              // *       *
		}                                        //   *   *
		else                                     //     *  
		{                                        //   *   *
			System.out.print("  ");              // *       *
		}
		
	}
		System.out.println();
	}
	System.out.println("------*-----------*---------------*");
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)                 
	 {                                     
		if(i==1||j==1||j==5||i==3)
		{
			System.out.print("* ");              // * * * * *
		}                                        // *       *
		else                                     // * * * * *       
		{                                        // *       * 
			System.out.print("  ");              // *       *
		}
		
	}
		System.out.println();
	}
	System.out.println("------*-----------*---------------*");
	
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)                 
	 {                                     
		if(i==5||j==1||j==5)
		{
			System.out.print("* ");              // *       *
		}                                        // *       *
		else                                     // *       * 
		{                                        // *       *
			System.out.print("  ");              // * * * * *
		}
		
	}
		System.out.println();
	}
	System.out.println("------*-----------*---------------*");
	for(int i=1;i<=8;i++)
	{
		for(int j=1;j<=8;j++)                 
	 {                                     
		if(i==1||j==1||i==8||j==8||i==j||i+j==9||i==4)
		{
			System.out.print("* ");              // * * * * *
		}                                        // * *   * *
		else                                     // *   *   *
		{                                        // * *   * *
			System.out.print("  ");              // * * * * *
		}
		
	}
		System.out.println();
	}
	System.out.println("------*-----------*---------------*");
	
	int k=1;
	for (int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			System.out.print(k+"   ");
			k++;
		}
		System.out.println("  ");
	}
	
	System.out.println("------*-----------*---------------*");
	char t='A';
	
	for (int i=1;i<=6;i++)
	{
		for(int j=1;j<=5;j++)
		{
			System.out.print(t+"   ");
			t++;
		}
		System.out.println("  ");
		
	}
	System.out.println("------*-----------*---------------*");
	char u='a';
	for (int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if(i==j)
			{
				System.out.print(u+" ");
				u++;
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	
	System.out.println("------*-----------*---------------*");
	char A=65;
	char Z=69;
	for (int i=A;i<=Z;i++)
	{
		for(int j=A;j<=Z;j++)
		{
			System.out.print(i+"   ");
			i++;
		}
		System.out.println("  ");
		
	}
	
}}
