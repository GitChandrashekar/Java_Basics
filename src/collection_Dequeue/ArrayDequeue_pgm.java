package collection_Dequeue;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeue_pgm {

	public static void main(String[] args)
	{
ArrayDeque<String> DataQueue =new ArrayDeque<String>();
//Queue<String > Queue_String = new ArrayDeque<>();//

DataQueue.add("Chandhu");
DataQueue.addFirst("yourr");  
DataQueue.addLast("parrot");  
DataQueue.add("orange");
DataQueue.addLast("Merw");
DataQueue.addLast("Tiger");  
DataQueue.addLast("lonn");  
DataQueue.addLast("werre");  

System.out.println(DataQueue);

DataQueue.poll();                //yourr will be removed//
System.out.println(DataQueue);


DataQueue.pollFirst();          //Chandhu will be removed//
System.out.println(DataQueue);

DataQueue.pollLast();           //werre will be removed //
System.out.println(DataQueue);

	}

}
