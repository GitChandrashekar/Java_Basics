package advance_Collection_concept;

import java.util.ArrayList;

public class Basic_ArrayList {

	public static void main(String[] args)
	{
		ArrayList ArrObj = new ArrayList();
	//adding data into the ArrObj
		ArrObj.add("demo");
		ArrObj.add("memo");
		ArrObj.add("remo");
		ArrObj.add(12);
		ArrObj.add(4,15);
		System.out.println(ArrObj);    //[demo, memo, remo, 12, 15]//
		
		//removing element friom the arraylist		
		ArrObj.remove(2);              //remo removed//
		System.out.println(ArrObj);    //[demo, memo, 12, 15]//
//		ArrObj.clear();
		System.out.println(ArrObj);    //[]
		ArrObj.set(2, "marri");
		System.out.println(ArrObj); 
	}

}
