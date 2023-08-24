package Java_Array;

public class MultiDimen {
public static void main(String[] args) 
{
	
	
//	int[] S = {10,20,30,40,50,60,70,80,90};
//	S[5]=100;
//	System.out.println(S[1]);
	
//	for(int j:S)
//	{
//		System.out.println(j);
//	}
//	for(int i=0;i<=S.length-1;i++)
//	{
//		System.out.println(S[i]);
//	}
	
	//multidemensional array//
	
//	int M[][]=new int[3][4];
	int Mul[][] = {{1,2,2},{2,2,1},{3,4,4},{4,5,7}};
	for(int i=0;i<Mul.length;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.print(Mul[i][j]+" ");
		}
		System.out.println();
	}
	
	

	                 
	
	                      
}
}
