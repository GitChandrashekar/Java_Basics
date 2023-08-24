package string_pblms;

public class Palindrome_Pgm {

	public static void main(String[] args)
	{
		String Hum="parap";
		String Palin="";
		for(int i=Hum.length()-1;i>=0;i--)
		{
			Palin=Palin+Hum.charAt(i);
		}
		System.out.println(Palin);
		
		
		if(Hum.equals(Palin))
		{
//			System.out.println(Hum.equals(Palin));
			System.out.println("it is  a palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
		}
	}

