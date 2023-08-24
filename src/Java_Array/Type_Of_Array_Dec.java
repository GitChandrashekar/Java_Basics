package Java_Array;

public class Type_Of_Array_Dec 
{
public static void main(String[] args)
{   
	
	System.out.println("The  declartion types of array in java ");
	
	//1
	int[] A=new int[3];
	A[0]=12;
	A[2]=11;
	for(int i=0;i<=A.length-1;i++)
	{
		System.out.println("the array elements of A is "+A[i]);
	}
	
	//2
	int B[]=new int[4];
	B[0]=1;
	B[1]=16;
	B[2]=18;
	B[3]=28;
	for(int i=0;i<=B.length-1;i++)
	{
		System.out.println("the array elements of B is "+B[i]);
	}
	
	
	//3
	int C[]= {31,32,33,34,35,35};
	for(int i=0;i<=C.length-1;i++)
	{
		System.out.println("the array elements of C is "+C[i]);
	}
	
	
	//4
	int[] D= {41,42,43,4,45};
	for(int i=0;i<=D.length-1;i++)
	{
		System.out.println("the array elements of D is "+D[i]);
	}
	
	
	//5
	int E[]=new int[] {11,12,13,14,15};
	for(int i=0;i<=E.length-1;i++)
	{
		System.out.println("the array elements of E is "+E[i]);
	}

	System.out.println();
	
	//6
	int[] F=new int[]{11,12,13,14,15};
	for(int i=0;i<=F.length-1;i++)
	{
		System.out.println("the array elements of F is "+F[i]);
	}
	
}
}
