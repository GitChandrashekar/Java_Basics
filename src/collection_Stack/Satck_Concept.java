package collection_Stack;

import java.util.Stack;

public class Satck_Concept {

	public static void main(String[] args)
	{
     Stack<String> Data_Stck = new Stack<>();
     //stack is a legacy class which is introduced in the 1.0 version//
     //special java methods provides for stack class 
     Data_Stck.push("Red");
     Data_Stck.push("blue");
     Data_Stck.push("green");
     Data_Stck.push("yellow");
     
     System.out.println(Data_Stck);               // [Red, blue, green, yellow]//
     
     System.out.println(Data_Stck.peek());        //yellow//      //provides peek element of the stack//
     System.out.println(Data_Stck.search("blue"));//3//  //search for the mentioned element in the stack//
     System.out.println(Data_Stck.pop());         //yellow//      //Removes the last element of the stack//
     System.out.println(Data_Stck);               //[Red, blue, green]//
     
     System.out.println("before removing the stack is : "+Data_Stck.empty()); //before removing the stack false//
     Data_Stck.clear();
     System.out.println("after removing the stack is : "+Data_Stck.empty()); // before removing the stack is : true//
	}
}
