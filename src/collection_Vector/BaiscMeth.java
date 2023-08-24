package collection_Vector;

import java.util.Vector;

public class BaiscMeth {
public static void main(String[] args)
{
	Vector dataD = new Vector();
	dataD.add("GOAT");
	dataD.add("LIGER");
	dataD.add("RUNHO");
	dataD.add("HMAAR");
	dataD.add("RUNHO");

	
	//for updation we will use the set()
     dataD.set(0, "Tiger");
     
    //finding the index of the element//
    System.out.println(dataD.indexOf("RUNHO")); 
     
     //finding the index of the element from last index position//
     System.out.println(dataD.lastIndexOf("RUNHO")); 
     
     //finding the first element of the vetoe list
    System.out.println(dataD.firstElement()); 
     
     //finding the last element of the vector list//
    System.out.println( dataD.lastElement());
     
    
     System.out.println(dataD);
     


	
}
}
