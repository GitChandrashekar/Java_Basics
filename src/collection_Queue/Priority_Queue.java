package collection_Queue;

import java.util.PriorityQueue;

public class Priority_Queue {

	public static void main(String[] args) {

//		PriorityQueue<Integer> data_Queue= new PriorityQueue<>(Comparator.reverseOrder());
//      if we are using  "Comparator.reverseOrder()" the first / head / peek element
//		will be the largest number of queue //
		PriorityQueue<Integer> data_Queue= new PriorityQueue<>();
		
		//for adding the elements in the queue 
        //1.offer,2.add
		
		data_Queue.add(12);
//		data_Queue.offer(null);
		data_Queue.offer(13);
		data_Queue.offer(11);
		data_Queue.offer(3);
		data_Queue.offer(2);   
		data_Queue.offer(6);
		
		//to see the first/head element of the queue//
		System.out.println(data_Queue.peek());  //it will just sees the head value //  when the queue is empty it will print " null"
		System.out.println(data_Queue);  //[]:- when the queue is null//
		
		//to retrieval the head element of the element of the queue//
		System.out.println("the removed element is : "+data_Queue.poll());
		System.out.println(data_Queue); // 2 will be removed from the queue// //[]:- when the queue is null//
		
		//for verification of the elements exists in queue we will use contains()//
		System.out.println(data_Queue.contains(11));    //true//
		System.out.println(data_Queue.contains(121));   //false//

		
		//retrieving the elements from the queue as same as in Priority_Queue. without priority  //
		System.out.println("using the foreach loop");
		for(Integer ele : data_Queue)
		{
			System.out.println(ele);
		}
		System.out.println("---------------------------------------------");
		
		
		//removes the elements from the queue in sorted/priority order //
		//it will removes the elements in the sorted order//
		while(!(data_Queue.isEmpty()))
		{
			System.out.println(data_Queue.poll());
		}
		
		//if we want to remove the queue //
		data_Queue.clear();
		System.out.println(data_Queue);   // [] //
		
		}

}
//if we are using the remove() for the empty queue then it will returns the exception //
//if we are using the poll() for the empty queue then it will returns the null //
