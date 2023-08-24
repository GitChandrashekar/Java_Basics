package collection_Dequeue;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedList_Dequeue {

	public static void main(String[] args)
	{
Deque<String> LinkedList_Deque = new LinkedList<>();
LinkedList_Deque.add("AAAAA");
LinkedList_Deque.addLast("BBBBB");
LinkedList_Deque.addFirst("CCCCC");
LinkedList_Deque.addFirst("DDDD");
LinkedList_Deque.addFirst("EEEE");
LinkedList_Deque.addFirst("FFFFF");


System.out.println(LinkedList_Deque);

 //poll() in the Dequeue//
System.out.println("for  poll() it removes :-"+LinkedList_Deque.poll());

System.out.println("for  pollFirst() it removes :-"+ LinkedList_Deque.pollFirst());

System.out.println("for  pollLast() it removes :-"+LinkedList_Deque.pollLast());



//peak() in the Dequeue//
System.out.println(LinkedList_Deque.peek());
System.out.println(LinkedList_Deque.peekFirst());
System.out.println(LinkedList_Deque.peekLast());






	}

}
