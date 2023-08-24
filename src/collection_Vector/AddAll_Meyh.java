package collection_Vector;

import java.util.*;

public class AddAll_Meyh {

	public static void main(String[] args)
	{
Vector v1 = new Vector();
v1.add("Arya");
v1.add("Sarainodu");

Vector v2 = new Vector();
v2.add("Chandhu");

System.out.println("before addAll :"+v2);

v2.addAll(v1);   //after addAll : [Chandhu, Arya, Sarainodu]//
v2.addAll(0,v1);    //after addAll : [Arya, Sarainodu, Chandhu]
System.out.println("after addAll : "+v2);


	}

}
