package string_pblms;

public class Reverse_String {

	public static void main(String[] args) 
	{
		String Num="Chandhu";
		
		
//		System.out.print(Num.charAt(6));
//		System.out.print(Num.charAt(5));
//		System.out.print(Num.charAt(4));
//		System.out.print(Num.charAt(3));
//		System.out.print(Num.charAt(2));
//		System.out.print(Num.charAt(1));
//		System.out.print(Num.charAt(0));
		String s = " ";
		for(int i=Num.length()-1;i>=0;i--) // i=6 5 4 3 2 1 0
		{
			 s= s+Num.charAt(i);   // " U h d n a h C "
		}
		System.out.println(s);

	}

}
