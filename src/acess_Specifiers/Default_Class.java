package acess_Specifiers;

class Cat
{ 
	int r;
	void Zo()
	{
		System.out.println(20+r);
	}
}
public class Default_Class
{
   public static void main(String[] args)
    {
	Cat obj1 = new Cat();
	obj1.r=90;
	obj1.Zo();
    }
}
