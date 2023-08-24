package collection_Set;

import java.util.HashSet;
import java.util.Set;

public class HashSet_Demo {

	public static void main(String[] args)
	{
//-------------major operation of HashSet----------------//
		
//		1.creations of the HashSet
//		Set<String> data_Set = new HashSet<>();
		HashSet<String> Data_Set = new HashSet<>();
		
//		2.adding the element into the HashSet
//		--> it will not accept the duplicate elements it will not print the duplicate elements
		
		Data_Set.add("Chandhu");
		Data_Set.add("Chandhu");
		Data_Set.add(null);
		Data_Set.add("Goat");
		Data_Set.add("Lol");
		Data_Set.add("Mall");
		Data_Set.add("Goat");
		System.out.println(Data_Set);
		System.out.println("----------------------------------");
//after creating the new element every time it will create the dummy empty object as "new object()"//
		
		
//		3.retrieving the element from the HashSet
         for(String Act_Data : Data_Set)
         {
        	 System.out.println(Act_Data);
         }
         
 		System.out.println("----------------------------------");

//		4.deleting the element from the HashSet
        System.out.println(Data_Set.remove("ranga")); 
        System.out.println(Data_Set.remove("Mall")); 
//        Data_Set.clear();
 		System.out.println(Data_Set);
		System.out.println("----------------------------------");

//		5.validating the element from the HashSet
		System.out.println(Data_Set.contains("ranga"));
		System.out.println(Data_Set.contains("Goat"));

		
		
		
	}

}
