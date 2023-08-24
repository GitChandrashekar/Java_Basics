package Enumeration_Concept;

import java.util.Enumeration;
import java.util.Properties;

public class Prop_Enum {

	public static void main(String[] args)
	{
Properties prop =new Properties();
prop.setProperty("Shekar", "chandhu");
prop.setProperty("Fox", "Lion");
prop.setProperty("Van", "Ran");
prop.setProperty("Pan", "Can");

Enumeration<Object> E_propw = prop.elements(); 
//here we cannot take the value element of the property . bcz property will always
//sets key and value as string and string 
while(E_propw.hasMoreElements())
{
	System.out.println(E_propw.nextElement());
}

	}


}
