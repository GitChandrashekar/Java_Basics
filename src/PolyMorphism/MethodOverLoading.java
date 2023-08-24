package PolyMorphism;

class First
{
	void Add(int k )
	{
		int i=k+20;
		System.out.println("the Add operation from the first method is "+i);
	}
	void Add(char l)
//	void Add(int l,int h)
	{
		int i=l+20;
		System.out.println("the Add operation from the second method is "+i);
	}
}
public class MethodOverLoading {

	public static void main(String[] args)
	{
		First F1=new First();
		F1.Add(30);
		F1.Add(80);
		
	}

}
