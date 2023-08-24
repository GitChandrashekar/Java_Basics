package string_pblms;

public class Vowels_pgm {

	public static void main(String[] args)
	{
		String Vowel =" hi hello im a Lion in side umbrella ";
		int Count=0;
		for(int i=0;i<Vowel.length()-1;i++)
		{
			if(Vowel.charAt(i)=='a' || Vowel.charAt(i)=='e' || Vowel.charAt(i)=='i' || Vowel.charAt(i)=='o' || Vowel.charAt(i)=='u' )
			{
				Count++;
			}
		}
System.out.println("the vowels count in the given string is : "+Count);
	}

}
