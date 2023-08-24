package surya_collection;

import java.util.ArrayList;
import java.util.List;

public class List2_Concepts {

	public static void main(String[] args)
	{
		List<String> Data1 = new ArrayList<String>();
		Data1.add("Hello");
		Data1.add("Sends");
		Data1.add("Porre");
		Data1.add("kihhg");
		System.out.println(Data1);
		System.out.println("-----*----------*-----*------");
		
		//how to add into List//
		Data1.add(4, "Sends");
		Data1.add("Longg");
		
		//how to find the total size of the list//
		System.out.println("the total count of the list elements : "+Data1.size());
		System.out.println("-----*----------*-----*------");
		
		//how to add data into a specific index of the lists//
		Data1.add(4, "follow");
		


		//how to get the data from the list//
		System.out.println(Data1);
		System.out.println("**************");
		System.out.println(Data1.get(2));
		for(int i=0;i<Data1.size();i++)
		{
			System.out.println(Data1.get(i));
		}
		System.out.println("**************");
		for(String data2:Data1 )
		{
			System.out.println(data2);
		}
		System.out.println("-----*----------*-----*------");
		
		
		//how to get the index value of the added element//
		System.out.println(Data1.indexOf("kihhg"));
		System.out.println(Data1.lastIndexOf("kihhg"));
		System.out.println("-----*-------*-----*------");
		
		

		//how to get the total size of the elements//
		System.out.println("the total count of the list elements : "+Data1.size());
		System.out.println("-----*-------*-----*------");
		
		
		//how to get the total elements data//
		for(int i=0;i<Data1.size();i++)
		{
			System.out.println(Data1.get(i));
		}
		System.out.println("**************");
		for(String data2:Data1 )
		{
			System.out.println(data2);
		}
		System.out.println("-----*----------*-----*------");
		
		
		
		//how to remove the element from the string//
		Data1.remove("Porre");
		System.out.println(Data1);  // Porre removed from the list//
		System.out.println("-----*----------*-----*------");

		//how to know the data is available or not//
		Boolean Contt = Data1.contains("Porre");
		System.out.println(Contt);
//		System.out.println("the true data is : " +Data1.equals("Sends"));
		System.out.println(Data1.contains("Sends"));
		System.out.println("-----*----------*-----*------");
		
		//how to know the string is empty or not//
		System.out.println(Data1.isEmpty());
		System.out.println("-----*----------*-----*------");

		//how to clear all the data from the string?//
		  Data1.clear();
          System.out.println(Data1);
          System.out.println(Data1.isEmpty());
	}

}
