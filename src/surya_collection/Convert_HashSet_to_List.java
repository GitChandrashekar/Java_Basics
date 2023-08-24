package surya_collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Convert_HashSet_to_List {
	public static void main(String[] args)
	{
		Set<String> Str = new HashSet<String>();
		Str.add("Data");
		Str.add("Bata");
		Str.add("Pata");
		Str.add("Yata");
		Str.add("Wata");
		Str.add("Lotus");
		System.out.println(Str);
		System.out.println("-------------------*****************");
		
		
		//how to access the value based on index position //
		String [] Str11 = Str.toArray(new String[Str.size()]);
		System.out.println("the 2th index position value is "+Str11[2]);
//		System.out.println(Str11.toString().indent(0));
		
//		how to convert from the hashset(Set) to the arraylist(List)
		List<String> Arrray_1 = new ArrayList<String>(Str);
		Arrray_1.add(4, "Lotus");
		System.out.println(Arrray_1);
		System.out.println(Arrray_1.size());
		System.out.println("-------------------*****************");

		
		Set<String> Set_1 = new HashSet<String>(Arrray_1);
		Set_1.add("Lotus");
		System.out.println(Set_1);
		System.out.println(Set_1.size());
		for(String DJ : Set_1 )
		{
			System.out.println(DJ);
		}
		
		
		
		
//		System.out.println(Set_1.size());
//		System.out.println("-------------------*****************");
//
//		Set_1.add("Lotus");
////		System.out.println(Set_2.indexOf("Lotus"));
//		for(String Set_2:Set_1)
//		{
//			System.out.println(Set_2);
//		}
//
//		//Array converted  values printing//
//		System.out.println(Arrray_1);
//		System.out.println(Set_1);
//
//		for(String Arr_11 : Arrray_1)
//		{
//			System.out.println(Arr_11);
//		}

	}

}
