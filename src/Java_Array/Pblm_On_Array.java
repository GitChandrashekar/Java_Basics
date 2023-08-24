package Java_Array;

public class Pblm_On_Array
{
public static void main(String[] args)
 {
	//WAP to print the smaller if given array
	int a[]= {10,5,20,21,55,11};
	int lower = a[0];
	for(int i=0;i<a.length;i++)
	{
		if(lower > a[i])
		{
			lower=a[i];
		}
	}
	System.out.println("the smaller value is "+lower);
	
	
	
	
	//WAP to print the greater of given array ?
	int b[]= {10,5,20,21,55,11};
	int greater = b[0];
	for(int i=0;i<b.length;i++)
	{
		if(b[i]>greater)  // 10<10 //  //
		{
			greater=b[i];
		}
	}
	System.out.println("the greater value is "+greater);
	
	
	
	//WAP to sort the list of array elements?
	
	int T[]= {9,6,7,2,90,11,0,-9};
	for (int p=0;p<T.length;p++)     //p=0 ,p=1  
	{
		for (int j=p+1;j<T.length;j++) //j=1; j=2 ;j=3 ;j=4 ;j=5;j=6;j=7
		{
			int temp;
			if(T[p]<T[j])            // 9>6->T ,9>7->t ,9>2->T ,9>90->F ,9>11->F ,9>0->T, 9>-9->T
			{
				temp=T[p];  //temp=9 , temp=9 ,temp=9                             ,temp=9, temp=9
				T[p]=T[j];  //T[p]=6 , T[p]=7 ,T[p]=2                             ,T[p]=0, T[p]=-9
				T[j]=temp;  //T[j]=9 , T[j]=9 ,T[j]=9                             ,T[j]=9, T[j]=9
			}
			
		}System.out.println(T[p]);   // -9 
		
	}
	
   
	int array[]= {111,12,13,18,1,10,9,-9};
	int smaller=array[0];
	int bigger=array[0];
	for (int i=0;i<array.length;i++)
	{
		if(array[i]<smaller)
		{
			smaller=array[i];
		}
		else if(array[i]>bigger)
		{
			bigger =array[i];
		}
	}
	System.out.println("smaller element of the given array is "+smaller);
	System.out.println("bigger element of the given array is "+bigger);
	int q=12;
	char d;
	d=(char)q;
	int j;
	j=q;
	
	
 }}
 
     


