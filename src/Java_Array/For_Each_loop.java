package Java_Array;

public class For_Each_loop
{
	public static void main(String[] args)
	{
		int i[]= {10,12,13,14,15};
		for(int j:i)
		{
			System.out.println("values are : "+j);
		}
		double v[]=new double[4];
				for (int l=0;l<=v.length-1;l++)
				{
					System.out.println(v[l]);
					
				}	
		
		
		
char c[]=new char[10];
c[0]='a';
c[1]='b';
c[2]='c';
c[4]='F';
c[6]='R';
c[8]='G';

for (int f=0;f<=c.length-1;f++)
{
	System.out.println(c[f]);
	
}
//System.out.println(c[11]);  //ArrayIndexOutOfBoundsException://
//System.out.println(c[-11]); //ArrayIndexOutOfBoundsException://
//System.out.println(c[10]);    //ArrayIndexOutOfBoundsException://
	}

}
