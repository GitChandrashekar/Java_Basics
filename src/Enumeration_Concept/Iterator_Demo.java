package Enumeration_Concept;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Demo {
//iterator :- it is the interface in which allows to access the elements of both legacy and new classes
	//objects 
	//where it will provide two special methods that HasNext(),Next()
	//it is one way direction of accessing the elements read only permission
	//and provides a special permission such as remove the elements//
	
	public static void main(String[] args)
	{
     ArrayList<Integer> Array_int = new ArrayList<>();
     Array_int.add(11);
     Array_int.add(12);
     Array_int.add(13);
     Array_int.add(14);
     Array_int.add(11);
     Array_int.add(null);

    Iterator<Integer> Array_Itera = Array_int.iterator();
    System.out.println(Array_Itera);   //java.util.ArrayList$Itr@5acf9800//
    

    
    Array_Itera.next();
   Array_Itera.remove();
  System.out.println(Array_int);  //[12, 13, 14, 11, null]
  
  Array_Itera.next();
  Array_Itera.remove();
 System.out.println(Array_int);  //[13, 14, 11, null]
  

while(Array_Itera.hasNext())
{
   Array_Itera.next();
  Array_Itera.remove();
}
System.out.println(Array_int);   //[]//

	}

	}


