package string_methods;

public class String_Methods {

	public static void main(String[] args) {
		String str1 = "ManualTesting";
	   	
		String str2 = "Automation";
		
		String str3 = new String("Chandrashekar");
		
//		1.CharAt() :- fetches the charcter based on string value
		System.out.println(str1.charAt(4));  //a
		System.out.println(str2.charAt(7));  //i
//		System.out.println(str3.charAt(15)); //java.lang.StringIndexOutOfBoundsException//
		
//		2.Length()	:- fetches the totla length of the string
		System.out.println(str2.length());   //the total length of str2 is 10
	
		
//		3.substring():-this meth is used to get the part of the string based on index value
		System.out.println(str1.substring(6));    //Testing
		System.out.println(str2.substring(4, 8));  //it will not consider last index value
		
//		4.contains():-it will checks wheather the inserted string value present / not
		System.out.println(str3.contains("Cha"));  //true
		System.out.println(str1.contains("test"));  //if casesenstive value 
//	                                                	 differs it will prints false
		
		
		String str4 = "manualTesting";
		String str5 =new String ("ManualTesting");
		String str6="";
		
//		5.equals():- used to compare 2 strings
		System.out.println(str4.equals(str1));  //true
    	System.out.println(str4.equals(str5));  //true
		System.out.println(str4.equals(str2));  // false
		boolean B=str1.equals(str4);
		System.out.println("the case sensitive also it will print = "+B);
		
//		6.IsEmpty():-it will checks the given element is empty / not?
		System.out.println(str5.isEmpty());   //false
		System.out.println(str6.isEmpty());   //true
		
//		7.Replace():- it is used to replace the string values with other values
		System.out.println(str4.replace("Man"," Men"));
		
//		8.Repeat():-it will repeats the string based on count
		System.out.println(str3.repeat(3));  //ChandrashekarChandrashekarChandrashekar
		System.out.println(str3);        //Chandrashekar
		
//		9.equalsIgnoreCase():-it will ignore lower and uppercase and compare the string value
		System.out.println(str1.equalsIgnoreCase(str4));  //true
		
		
//		10.IndexOf():-it will fetches the index of the provided string value
		System.out.println(str2.indexOf('o'));  //3
		System.out.println(str2.indexOf(2));    //-1
		
//		11.ToUpperCase():-converts the string to uppercase
        System.out.println(str2.toUpperCase());
        
//       12.ToLowerCase():-converts to lowercase
        System.out.println(str5.toLowerCase());
        
        String F = "     Hi Hello Uper Pogat  ";
        
//      13.Trim():-Removes empty spaces in beggining and end of the string
        System.out.println(F.trim());  //Hi Hello Uper Pogat
        
//      14.concat():- used to concate two string values 
		System.out.println(str2.concat(" "+str5));//Automation ManualTesting
		
//		15.ValueOf()
		
		
		
		
		
	}

}
