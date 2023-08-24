package collection_Map;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import javax.swing.text.html.parser.Entity;

public class Basic_Map {

	public static void main(String[] args)
	{
//List<String> LS = new Vector<>();
		
		//creation of MAP//
		Map<Integer, String> m = new Hashtable<>();
		m.put(112211, "Goopprr");
		m.put(112222, "Vottro");
		m.put(112233, "rosee");
		m.put(112244, "horree");
		m.put(112255, "morroo");
		System.out.println(m.keySet());             //[112255, 112244, 112233, 112222, 112211]//
		System.out.println(m);            //{112255=morroo, 112244=horree, 112233=rosee, 112222=Vottro, 112211=Goopprr}//

		System.out.println("---------------------------");
		
        //retrieving Keys from the map//
		Set<Integer> i = m.keySet();
		System.out.println(i);                         //[112255, 112244, 112233, 112222, 112211]//
		System.out.println("-----------------------------");
		for(Integer key : i)
		{                                               //112255
			                                            //112244
			                                            //112233
			System.out.println(key);                    //112222
			                                            //112211
			
		}
		
		System.out.println("-----------------------------");

		
		//retrieving the elements(values) from the map//
		System.out.println(m.values());                 //[morroo, horree, rosee, Vottro, Goopprr]//
		Collection<String> value = m.values();
		for(String elements : value )
		{
			
			
			System.out.println(elements);        //morroo
			                                     //horree
			                                     //rosee
			                                     //Vottro
			                                     //Goopprr
		}
		
		
		System.out.println("-----------------------------");

		//retrieving the values based on the key //
		System.out.println(m.get(112211));
		
		//retrieving the key with element //
		for(Integer Tyre : i)
		{
			
			
			
	System.out.println(Tyre +" >>>>>>>>>>> "+m.get(Tyre)); 
			                                                         //112255 >>>>>>>>>>> morroo
			                                                         //112244 >>>>>>>>>>> horree
			                                                         //112233 >>>>>>>>>>> rosee
			                                                         //112222 >>>>>>>>>>> Vottro
			                                                         //112211 >>>>>>>>>>> Goopprr
		}
		System.out.println("-----------------------------");

		
		//deletion of elements from the stack//
		m.remove(112244);                     //horree removed//
		System.out.println(m);                //{112255=morroo, 112233=", 112222=Vottro, 112211=Goopprr}//
		
		m.remove("morroo");
		m.remove(112222, "Vottro");            //  Vottro will be removed//
		System.out.println("--------"+
		m);               // {112255=morroo, 112233=rosee, 112211=Goopprr}
		
//		m.clear();
//		System.out.println(m);                 //{}
		
		
		System.out.println("-----------------------------");

		
		//verification of elements in map//
		System.out.println(m.containsKey(112233));       //true
		System.out.println(m.containsValue("horree"));   //false
		
		System.out.println("-----------------------------");
		

		//updation of elements //
		System.out.println(m);             // {112255=morroo, 112233=rosee, 112211=Goopprr}
		m.put(112255, "Tiger");
		System.out.println(m);             //   {112255=Tiger, 112233=rosee, 112211=Goopprr}//
		
		m.putIfAbsent(112255, "Liger");    
		System.out.println(m);             //{112255=Tiger, 112233=rosee, 112211=Goopprr}//
		m.remove(112255);
		m.putIfAbsent(112255, "Liger");  
		System.out.println(m);            //{112255=Liger, 112233=rosee, 112211=Goopprr}//
		
		//using Entry method retrieving the vale and key of the map//
		Set<Entry<Integer,String>> Key_Value = m.entrySet();
		for(<Entry<Integer,String>> K_V : Key_Value)
		{
			Integer intkey = K_V.geKey();
			String  StrVal = K_V.getValue();
			System.out.println(intkey+" : "+StrVal);
		}
	}

}
