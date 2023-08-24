package Enumeration_Concept;

import java.util.HashMap;
import java.util.Iterator;

public class Iterable_HashMap {

	public static void main(String[] args)
	{

		HashMap<Integer, String> Iter_hash = new HashMap<>();
		Iter_hash.put(12, "daran");
		Iter_hash.put(13, "Maaran");
		Iter_hash.put(14, "Lorry");
		Iter_hash.put(15, "Orange");
		Iter_hash.put(16, "Parrot");

//	System.out.println(Iter_hash.keySet().iterator());
		
		
		Iterator<Integer> I_number = Iter_hash.keySet().iterator();
		while(I_number.hasNext())
		{
			System.out.println(I_number.next());
//			System.out.println(I_number.next().remove());
		}
	
		System.out.println("---------*----------*----------*--------*------");
		
		
		Iterator<String> I_Data = Iter_hash.values().iterator();
		while(I_Data.hasNext())
		{
			System.out.println(I_Data.next());
		}
	}

}
