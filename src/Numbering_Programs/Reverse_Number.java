package Numbering_Programs;

public class Reverse_Number {

	public static void main(String[] args)
	{
		System.out.println("reverse of given number");
		int num=1002 ,rev=0,rem;
		System.out.println("before reverse the number: "+num);
		while(num>0)
		{
			rem = num%10;           // 1002%10=2    100%10=0  10%10=0     1%10=1
			rev = rev*10  + rem ;   // 0*10+2 =2   2*10+0=20 20*10+0=200  200*10+1=2001 <-- rev value
			num = num/10;           //1002/10=100  100/10=10 10/10=1       1/10=0
		}
		System.out.println("after reverse the number : "+rev);
//		System.out.println(200*10+1);

	}

}
