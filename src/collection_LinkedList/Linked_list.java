package collection_LinkedList;

import java.util.LinkedList;

public class Linked_list {

	public static void main(String[] args)
	{
LinkedList<String> LL = new LinkedList<>();

LL.add("cheetah");
LL.add("Liger");
LL.add("Tiger");
LL.add("Lion");

System.out.println(LL);                 // [cheetah, Liger, Tiger, Lion]
System.out.println(LL.remove());        //removes first element// //cheetah//
System.out.println(LL.remove("JaugR")); //false//
System.out.println(LL.remove("Lion"));   //true// 
	}

}
