package OOPS_concepts;
class Const_Demo
{
	int regno;
	String name;
	int age;
	
    Const_Demo(int r)
	{
		regno=r;
	}
    
     Const_Demo(int r,String sname)
	{
		regno=r;
		name=sname;
	}
     
     
     Const_Demo(int r,String sname,int A)
	{
		regno=r;
		name=sname;
		age=A;
	}
     void Goatt()
     {
    	 System.out.println(regno+" and "+name+" and "+age);
     }
}
public class Constructor_Overload_Demo {
	public static void main(String[] args)
	{
		Const_Demo obj1 = new Const_Demo(60);
		obj1.Goatt();
        // Output:-60 and null and 0//
		
		
		Const_Demo obj2 = new Const_Demo(60,"Chandhu");
		obj2.Goatt();
		//Output:- 60 and Chandhu and 0//
		
		
		Const_Demo obj3 = new Const_Demo(60,"Chandhu",26);
		obj3.Goatt();
		//Output :- 60 and Chandhu and 26//
	}
}
