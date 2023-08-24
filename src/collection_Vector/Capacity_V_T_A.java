package collection_Vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class Capacity_V_T_A {

	public static void main(String[] args)
	{
	Vector mas = new Vector(300); //we can declare the capacity of the vector at initially also that is//
	mas.add("Mass");
	mas.add("Hero");

	System.out.println(mas.size());
	System.out.println(mas.capacity());
		
	
	System.out.println("----**8--------");
	Object[] Arr1 = new Object[]{11,22,33,44,55}; //Array of objects//
	
//	asList :- it is used to create the list of and maintain that in the passed parameter inside it// 
	Vector Vec = new Vector(Arrays.asList(Arr1));  //Array inserted to vector//
	System.out.println(Vec);
	
	System.out.println(Vec.size());
	System.out.println(Vec.capacity());  //we cannot declare the capacity initially when we are when array is inserted//
	
	}

}
