package LoopingStatements;

public class SwitchStatement 
{
public static void main(String[] args)
{
	System.out.println("example for switch condition");
	char dem='A';
	switch(dem)
	{
	
	case 'B' : System.out.println("BlockBuster");
	break;
	
	case 'A' : System.out.println("Adventure time");
	break;
	
	case 'F' : System.out.println("Calm time");
	break;
	
	default : System.out.println("not found");
	break;
	}
	
 String day="mon";
 switch(day)
 {
 case "jjj":System.out.println("it is monday");
 break;
 case "ooo":System.out.println("it is monday");
 break;
 case "pp":System.out.println("it is monday");
 break;
 case "ppp":System.out.println("it is monday");
 break;
 case "mon":System.out.println("it is sunday");
 break;
 default :System.out.println("no day found");
 break;
 }
	}
	
}


