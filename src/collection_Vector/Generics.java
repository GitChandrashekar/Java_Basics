package collection_Vector;

import java.util.Vector;

public class Generics {

	public static void main(String[] args)
	{
       //Vector VG = new Vector(); // vector is introduced in the 1.2//
                          //generics is introduced in 1.5//
		
		Vector<Integer> vect = new Vector<>();  //by using the generics user is specifying the datatype before 
		 vect.add(22);                                       //entering the data into it //
//		vect.add("parry");  //error.//
		vect.add(11);
		vect.add(12);
		vect.add(13);
		System.out.println(vect);
		System.out.println(vect.size());
		System.out.println(vect.capacity());
		

	}

}
