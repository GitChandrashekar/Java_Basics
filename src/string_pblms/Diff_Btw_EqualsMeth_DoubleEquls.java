package string_pblms;

public class Diff_Btw_EqualsMeth_DoubleEquls {
public static void main(String[] args) 
{
	String C ="chandhu";
	String D ="chandhu" ;
	String S = new String("chandhu");
	
	System.out.println(C==D);  // True//
	System.out.println(D==S);  //== opertor will checks the 2 string / 2 values//  //False//
	System.out.println(C.equals(D));
	System.out.println(C.equals(S)); //Checks both  2 classes and 2 values are equal are not//
}
}
