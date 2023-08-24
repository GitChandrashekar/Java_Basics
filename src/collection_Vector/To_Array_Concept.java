package collection_Vector;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Vector;

public class To_Array_Concept {

	public static void main(String[] args)
	{
		Vector Dere = new Vector();
		Dere.add("GOAT");
		Dere.add("LIGER");
		Dere.add("RUNHO");
		Dere.add("HMAAR");
		Dere.add("RUNHO");
		
		//converting the vector list to the array//
		Object[] ArrTo = Dere.toArray();
		System.out.println(Arrays.toString(ArrTo));
		
	}

}
