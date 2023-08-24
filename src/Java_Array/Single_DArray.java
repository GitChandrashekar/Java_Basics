package Java_Array;

public class Single_DArray {

	public static void main(String[] args)
	{
		int A[]=new int[4];
		A[1]=22;
		A[0]=11;
		A[2]=33;
		A[3]=44;
		
		System.out.println(A[2]);
		System.out.println(A[0]);
		
		System.out.println("the total length of the array : "+A.length);
		
		//WAP to print the all the array values in a single pgm?//
		
		for(int i=0;i<=A.length-1;i++)
		{
			System.out.println(A[i]);
		}
		System.out.println("------------");
		
		int B[]= {10,20,30,40};
		System.out.println("B array length is : "+B.length);
		for (int i=0;i<B.length;i++)
		{
			System.out.println(B[i]);
		}
		

	}

}
