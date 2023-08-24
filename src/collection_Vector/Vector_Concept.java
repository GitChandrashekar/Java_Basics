package collection_Vector;
import java.util.*;
public class Vector_Concept {

	public static void main(String[] args)
	{
		Vector v1 = new Vector();
		v1.add("Chandhu");
		v1.add("shakear");
		v1.add("liger");
		v1.add("Tiger");
		
		Vector v2 = new Vector();
		v2.add("Pura");
		v2.add(0,"Hari");
		
		System.out.println(v2);
//		adding the elements of the V1 to  v2
		for(int i=0;i<v1.size();i++)
		{
			v2.add(v1.get(i));
		}
		System.out.println(v2);
	}

}
