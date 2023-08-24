package surya_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Working_With_Map {

	public static void main(String[] args)
	{
		Map<Integer, String> Mp_Value = new HashMap<Integer, String>();
		Mp_Value.put(1, "potta");
		Mp_Value.put(2, "Motta");
		Mp_Value.put(3, "Botta");
		Mp_Value.put(4, "notta");
		Mp_Value.put(0, "notta");
		Mp_Value.put(6, "notta");
		Mp_Value.put(1, "cotta");
		
		System.out.println(Mp_Value.get(1));    // potta will be replaced and updated by cotta and prints cotta//
		System.out.println(Mp_Value.get(9));    //notta//
		System.out.println("------*------*--------");
		System.out.println(Mp_Value);           //{0=notta, 1=cotta, 2=Motta, 3=Botta, 4=notta, 6=notta}//
		System.out.println("------*------*--------");
        System.out.println(Mp_Value.size());    //6//

        
        Map<Integer, String> Mp_Value2 = new HashMap<Integer, String>();
        Mp_Value2.putAll(Mp_Value);               //adding the Mp_Value members to Mp_Value2 members//
        Mp_Value2.put(6, "Gotta");
        System.out.println("------*------*--------");  
        
        System.out.println(Mp_Value2);             //{0=notta, 1=cotta, 2=Motta, 3=Botta, 4=notta, 6=notta}
        System.out.println(Mp_Value2.remove(4));  //note will be removed//


//			System.out.println(Mp_Value.keySet().size());
			
		
		

	}

}
