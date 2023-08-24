package collection_Set;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Demo {

	public static void main(String[] args)
	{
//Treeset :- this class have a unique feature compared to other classes of set that is ,, it will 
//maintains the sorted order//
		
		NavigableSet<Integer> Tree_Set = new TreeSet<>();
		Tree_Set.add(11);
		Tree_Set.add(1);
		Tree_Set.add(-11);
		Tree_Set.add(20);
		Tree_Set.add(5);
		Tree_Set.add(20);
//		Tree_Set.add(null);  //it wll not accept the null values//

		System.out.println("by default it maintains the sorted order : ");
		System.out.println(Tree_Set);   //[-11, 1, 5, 11, 20]//
		
//		Special methods of the treeeSet in the Set interface//
		System.out.println(Tree_Set.first());    //-11// shows First ele
		System.out.println(Tree_Set.last());      //20// shows last ele
		System.out.println(Tree_Set.pollFirst());   //-11// removes first ele
		System.out.println(Tree_Set.pollLast());     //20//  removes last ele
		System.out.println(Tree_Set.descendingSet());  //[11, 5, 1]//
        System.out.println(Tree_Set.subSet(0, 10));    //[1, 5]// //fetches the ele from the 0 to 10//
        
        
        
//     System.out.println(Tree_Set.remove());
//		System.out.println(removeAll());
//		Tree_Set.clear();
		



		
	}

}
