package Enumeration_Concept;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable_Enumeration {

	public static void main(String[] args) {
Hashtable<Integer, String> Hdata = new Hashtable<>();

Hdata.put(11, "India");
Hdata.put(12, "Bhutan");
Hdata.put(13, "Srilanka");
Hdata.put(14, "Russia");

System.out.println(Hdata.elements());  //java.util.Hashtable$Enumerator@5acf9800//
Enumeration<String> Edata = Hdata.elements(); 
//we can not pass integer as a enumerated 
//data bcz it will only accept the elements/values but not keys//

while(Edata.hasMoreElements())
{
	System.out.println("-->"+Edata.nextElement());
}

	}

}
