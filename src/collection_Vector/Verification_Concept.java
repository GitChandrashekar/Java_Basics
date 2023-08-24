package collection_Vector;

import java.util.*;

public class Verification_Concept {

	public static void main(String[] args)
	{
		Vector Data1 = new Vector();
		Data1.add("chandhu");
		Data1.add("Bindhu");
		Data1.add("Bandhu");
		
		Vector Data2 = new Vector();
		Data2.add("Shaekar");
		Data2.add("Tiger");
		Data2.add("Bandhu");
		
		System.out.println(Data2.contains("chandhu"));
		System.out.println(Data2.contains("Tiger"));
		
		System.out.println(Data2.containsAll(Data1));
		Data2.addAll(Data1);
		System.out.println(Data2.containsAll(Data1));

		Vector pair1 = new Vector();
		pair1.add("Fox");
		pair1.add("mango");
		
		Vector pair2 = new Vector();
//		pair2.add("Mango");
		pair1.add("mango");
		pair2.add("Fox");
		
		System.out.println(pair1.containsAll(pair2));
		
	}

}
