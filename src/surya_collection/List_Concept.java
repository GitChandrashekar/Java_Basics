package surya_collection;

import java.util.ArrayList;
import java.util.List;

public class List_Concept {

	public static void main(String[] args)
	{
		List<String> Data =new  ArrayList<String>();
		Data.add("chandhu");
		Data.add("Shekar");
		Data.add("Rams");
		Data.add("kkiinngg");
		
		//getting the value of the index number 2 //
		System.out.println(Data.get(2));  //Rams//
		
		System.out.println("-----*------*-------*------");
System.out.println(Data.indexOf("kkiinngg")); //finding kkiinngg index number//
		
//		Data.addAll(2, Data);

		System.out.println("-----*------*-------*------");
		  for(int i=0;i<Data.size();i++)  //which carries total list of strings
		  {
			  System.out.println(Data.get(i)); //printing each value
		  }
		  
		  
		  System.out.println("-----*------*-------*------");
		  for(String Pari : Data)
		  {
			  System.out.println(Pari);  //printing each value
		  }

		  System.out.println("-----*------*-------*------");

	System.out.println(Data.size());  //provides total count//
	Data.add(4, "Liger");            //adds the liger to the 4 index//
	System.out.println(Data.get(4));  //Liger// //fecthes the 4 index value ArrayList//
	Data.add("hello");  //it will adds the hello to the end of the arraylist//
	Data.remove("Shekar");
		  System.out.println("-----*------*-------*------");
		  for(String Parrot : Data)
		  {
			  System.out.println(Parrot); //printing the updated  list of  
			  }
		  System.out.println("-----*------*-------*------");


System.out.println(Data.hashCode());   //fetches hashCode(hashCode)//
System.out.println(Data.contains("chandhu")); //checks value and prints boolean val//
System.out.println(Data.containsAll(Data));
System.out.println(Data.isEmpty());  //checks it is empty / not//
System.out.println(Data.indexOf("chandhu")); //fetches the index number of the chandhu//

		
		  
		  
	}

}
