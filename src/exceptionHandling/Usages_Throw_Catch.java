package exceptionHandling;

import java.util.Scanner;

public class Usages_Throw_Catch {

	public static void main(String[] args) throws Exception
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter the name : ");

		String name = sc.nextLine();
		Thread.sleep(2000);
		System.out.print("the name is :"+name); 
		
		
		
//		System.out.println(" "+name);
		
	}

}
