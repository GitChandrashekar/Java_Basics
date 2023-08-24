package Enumeration_Concept;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
public class Legacy_Cls_TO_Iter {

	public static void main(String[] args)
	{
        //Legacy class collection //
		Hashtable<Integer, String> Data1 = new  Hashtable<>();
		
		//Adding elements into it //
		Data1.put(1, "Kings");
		Data1.put(2, "of");
		Data1.put(3, "the");
		Data1.put(4, "King");
		Data1.put(5, "Tiger");
		
		//converting the Legacy class collection  data into Iterator by using the asIterator()//
		
       //Iterator<String> Iter_Data = ((Enumeration<String>) Data1).asIterator();//-->shows error while
       //printing the elements
		
		Enumeration< String > obj1 = Data1.elements();
		while(obj1.hasMoreElements())
		{
			System.out.println(obj1.nextElement());
		}
		
		System.out.println("-----******-------*****----");
		
		Iterator< String > obj2 = ((Enumeration<String>) Data1).asIterator();
		
		while(obj2.hasNext())
		{
			System.out.println(obj2.next());
		}
		
	}

}
