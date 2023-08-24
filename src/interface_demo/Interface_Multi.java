package interface_demo;
interface Hero
{
	void King();
	default void Bahu()
	{
		System.out.println("hi helllo prabhas");
	}
}
interface Anuksha extends Hero
{
	void Queen();
	default void Avanthika()
	{
		System.out.println("hi helllo anushka");
	}
}
 class Mahendra implements Anuksha
{

	
	public void King() {
		System.out.println("the king is mahendra");
		
	}


	public void Queen() {
		System.out.println("the king is Avnathika");
		
	}
	
}
public class Interface_Multi {

	public static void main(String[] args)
	{
		Mahendra obj1 = new Mahendra();
		obj1.Avanthika();
		obj1.Bahu();
		obj1.King();
		obj1.Queen();
		
	}

}
