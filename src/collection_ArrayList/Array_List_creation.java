package collection_ArrayList;

import java.util.ArrayList;

public class Array_List_creation {
	
public static void main(String[] args)
{
	ArrayList<Integer> ArrData = new ArrayList<>(); // default capacity = 0//
	ArrData.add(20);                                //Initial capacity will be 10//
	System.out.println(ArrData);     
	System.out.println(ArrData.size());
	
//	System.out.println(ArrData.capacity()); //we cannot fetch the capacity of the arraylist//
	
//	after adding the 10 elements the capacity of the arraylist will be changes from 10 to 15. 50% increase

	ArrData.add(11);
	ArrData.add(11);
	ArrData.add(null);
	ArrData.add(0,22);
	System.out.println(ArrData);     
	System.out.println(ArrData.size());
	
	
}
}
