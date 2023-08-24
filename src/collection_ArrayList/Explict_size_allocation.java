package collection_ArrayList;

import java.util.ArrayList;

public class Explict_size_allocation {

	public static void main(String[] args)
	{
ArrayList<String> Val_s = new ArrayList<>(200);
Val_s.add(null);
Val_s.add("star");
Val_s.add("Coolar");
Val_s.add("hello");
Val_s.add("Goat");

System.out.println(Val_s);
System.out.println(Val_s.size());

}

}
