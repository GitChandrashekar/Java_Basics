package OOPS_concepts;

public class DoubleClass {
//Without encapsulation declaring that and using that//
int Sky()
{
	int moon=10,sun=20,power=moon+sun;
	System.out.println("power value is = "+power);
	return power; 
}
public static void main(String[] args)
{
	DoubleClass DB = new DoubleClass();
	DB.Sky();
}
	
}

