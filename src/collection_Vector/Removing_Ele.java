package collection_Vector;

import java.util.Vector;

public class Removing_Ele {

	public static void main(String[] args)
	{
Vector v = new Vector();
v.add(1);
v.add(11);
v.add(12);
v.add(14);

Vector v11 = new Vector();
v11.addAll(v);

System.out.println(" v11 : "+v11);  //[1, 11, 12, 14]
v11.add("Fox");
v11.removeAll(v);

System.out.print("after removeAll method v in v11 : ");   //v11 : []
System.out.println(v11);

System.out.println("v :"+v);  // [1, 11, 12, 14]
v.remove(0);
v.remove("14");
System.out.println("v :"+v);  //[11, 12, 14]
v.clear();
System.out.println("v :"+v);  //[]

	}

}
