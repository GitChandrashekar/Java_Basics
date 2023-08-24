package Enumeration_Concept;

import java.util.ListIterator;
import java.util.Vector;

public class List_Iteratot {

	public static void main(String[] args) 
	{
		Vector<Integer> Vdata = new Vector<>();
		Vdata.add(61);
		Vdata.add(62);
		Vdata.add(63);
		Vdata.add(64);
		Vdata.add(65);
  
ListIterator<Integer>  L_Data = Vdata.listIterator();
L_Data.add(11);
while(L_Data.hasNext())
{
	System.out.println(L_Data.next());
}
L_Data.add(12);
System.out.println("------*****-------");

while(L_Data.hasPrevious())
{
	System.out.println(L_Data.previous());
}
L_Data.remove();
System.out.println(Vdata);

	}
	

}
