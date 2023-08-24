package surya_collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set_Concept {
	public static void main(String[] args)
	{

		Set<String> Content = new HashSet<String>();
		
		//how to add into set//
Content.add("puspha");
Content.add("Kanthara");
Content.add("KGF");
Content.add("Salaar");
Content.add("puspha");  //it will ignores duplicate value[not consider index position also//
		

		//how to find the total size of the string//
		System.out.println(Content.size());
		
		//how to convert string to array// //to exact indexed data//
		String [] S = Content.toArray(new String[Content.size()]);
		System.out.println("the value of oth index postion of Cotent is :"+S[0]);
		
		//how to add Set items to list and convert from hashSet to arraylist//
		List<String> List_Val =new  ArrayList<String>(Content);
		System.out.println("the size is "+List_Val.size());
		System.out.println("***********9999999***********");
		for(String list : List_Val)
		{
			System.out.println(list);
		}
 
		
		
//how to add data into a specific index of the strings//
//-->here we dont have an option to add the element specifically through an index/
		
		
//how to get the data from the list//
System.out.println(Content); //retuns string [Kanthara, KGF, puspha, Salaar]//
//here we dont have an option to fecth the vlaues based on the index position//
		

//how to get the index value of the added element//
//--> here we cannot fetch the value index position//
//System.out.println("the index value of kanathara is "+(Content.indexOf("Kanthara"));

//how to get the total size of the elements//
int totalCount = Content.size();
System.out.println("the total count of the string is :"+totalCount);

//how to get the total elements data//
//how to print the members of the strings//

//1.type
for (String Movies :Content)
{
	System.out.println("the movies are : "+Movies);
}


//2.type
System.out.println(Content);

//how to remove the element from the string//
Content.remove("puspha");
		
System.out.println(Content);
		
//how to know the data is available or not//
System.out.println(Content.contains("Kanthara"));

//how to know the string is empty or not//
System.out.println(Content.isEmpty());
System.out.println(Content.equals("KGF")); // false //not executed//


//how to all the data from the string?//
Content.clear();
System.out.println(Content);

	}

}
