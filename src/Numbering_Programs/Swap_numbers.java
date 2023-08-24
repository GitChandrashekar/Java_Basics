package Numbering_Programs;

public class Swap_numbers
{
public static void main(String[] args)
 {
	System.out.println("swapping of two numbers");
	int a=20;
	int b=30;
	System.out.println("Before swapping a : "+a);
	System.out.println("Before swapping b : "+b);
	
	a=a+b;  //a= 20+30 =50
	b=a-b;  //b= 50-30 =20
	a=a-b;  //a= 50-20 =30
	System.out.println("--------------------------------------");
	System.out.println("after swapping a : "+a);
	System.out.println("after swapping b : "+b);
	
	
	
System.out.println("second method to swap of two numbers ");
int s=10;
int t=20;
int temp;
System.out.println("Before swapping s : "+s);
System.out.println("Before swapping t : "+t);
	
temp=s;  //temp=10//
s=t;     //s=t s=20//
t=temp;  //t=temp t=10//

System.out.println("--------------------------------------");
System.out.println("Before swapping s : "+s);
System.out.println("Before swapping t : "+t);

  System.out.println("Thrid method for swap of two numbers");
  int d=5;
  int f=10;
  System.out.println("Before swapping d : "+d);
  System.out.println("Before swapping f : "+f);
  
  d=d*f;    //d=5*10=50//
  f=d/f;    //f=50/10=5//
  d=d/f;    //d=50/5=10//
  
  
  System.out.println("--------------------------------------");
  System.out.println("Before swapping d : "+d);
  System.out.println("Before swapping f : "+f);
	
 }
}
