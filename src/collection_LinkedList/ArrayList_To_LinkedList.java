package collection_LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ArrayList_To_LinkedList {

	public static void main(String[] args)
	{
ArrayList<Integer> AI = new ArrayList<>();
AI.add(30);
AI.add(30);
AI.add(20);
AI.add(null);

//LinkedList<Integer> LL = new LinkedList<>(AI);
//System.out.println(LL);

LinkedList<Integer> LL = new LinkedList<>();
LL.addAll(0,AI);
LL.add(44);
LL.add(49);
System.out.println(LL);
LL.removeAll(AI);
System.out.println(LL);




	}

}
