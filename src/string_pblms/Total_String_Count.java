package string_pblms;


public class Total_String_Count {

	public static void main(String[] args) 
	{
	  String King ="LIGER TIGER FIRE";
	  int count=0;
	  for(int i=0;i<King.length();i++)
	  {
		if(King.charAt(i) == 'L')
		{
			count++;
		}
	  }
System.out.println("the E is Counted this number of times : "+count);
	}

}
