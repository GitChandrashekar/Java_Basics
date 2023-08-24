package advance_Collection_concept;

import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args)
	{
LinkedList list = new LinkedList();
list.add(12);
list.add(1,12);
list.addFirst("hello");
list.addLast("Close");

System.out.println(list.get(0));
System.out.println(list);
list.set(3, "list");
list.removeLast();
System.out.println(list);
	}

}
