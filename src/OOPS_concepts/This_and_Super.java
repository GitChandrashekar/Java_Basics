package OOPS_concepts;


class Parent 
{
	int i=10;
	int j=10;
	void funop()
	{
		int i=20;
	}
}
class Child1 extends Parent
{
	int j=600;
}
class Child2 extends Child1
{
	int i=30;
	void Fun()
	{
		int i=90;
		System.out.println("the i value when we use this keyword ="+this.i);
		System.out.println("the i value for normal printing ="+i);
		System.out.println("the i value when we use Super keyword ="+super.i);
		System.out.println("the i value when we use Super keyword ="+super.j);
	}
}
public class This_and_Super 
{
public static void main(String[] args) 
{
	Child2 Chi=new Child2();
	Chi.Fun();
}
}
