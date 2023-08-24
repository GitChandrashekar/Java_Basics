package Enumeration_Concept;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Stack;

public class Stack_Enumeration {
    //Enumeration is an interface which was introduced for iterating the legacy Collection objects
	//Legacy classes version :- v1.0
	//Legacy classes :- stack,vector,hashtable,Dictionary and the properties//
    //New class :- v1.2
	public static void main(String[] args)
	{
		
		//legacy class collections //
		Stack<Integer> st = new Stack<>();
		st.add(11);
		st.add(12);
		st.add(13);
		st.add(14);
		st.add(15);
		st.add(20);

		//accessing the legacy collection classes collection using the enumeration interface //
		Enumeration<Integer> E =  st.elements();
//		System.out.println(E);  //java.util.Vector$1@7a81197d//
		
//		for(Integer i: E)
//		{
			            //Can only iterate over an array or an instance of java.lang.Iterable//
//		}
		
	while(E.hasMoreElements())
	{
		System.out.println(E.nextElement());
	}
	
    //methods provided by the Enumeration to retrive the elements from the v1.0 classes collection
	//1.hasMoreElements()//
    //2.nextElement()//
	}

}
