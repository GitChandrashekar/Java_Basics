package string_pblms;

public class Swapping_pgm {

	public static void main(String[] args) 
	{
		String Ste1 = "JAVA";
		String Ste2 = "automation";
//		String Temp="";
		
		System.out.println(" before swapping : "+Ste1);
		System.out.println(" before swapping : "+Ste2);
		
//		Temp=Ste1;
//		Ste1=Ste2;
//		Ste2=Temp;
//		
//		System.out.println(" after swapping : "+Ste1);
//		System.out.println(" after swapping : "+Ste2);
		
		//Second type of Swapping the without third variable?//
		Ste1 = Ste1+Ste2;   //JAVAautomation//
		Ste2 = Ste1.substring(0,Ste1.length()-Ste2.length());  //Ste1.length()=14 -10=4 => JAVA
		Ste1=Ste1.substring(Ste2.length());                    //Ste1.subString(4)
		
		System.out.println(" after swapping : "+Ste1);
       	System.out.println(" after swapping : "+Ste2);
		
	}

}
