package OOPS_concepts;

public class ClassVairiables 
{
double TravelCharge=200;
double Shower=500;

 int SmallGoat()
 {
	 int Price=3000;
	 int Food=1000;
	 System.out.println("Common Travelcharge For big and small goat = "+TravelCharge);
	 System.out.println("Shower Charge common for both big and small goat =" +Shower);
	 double TotalPrice = Price+Food+Shower+TravelCharge;
	 System.out.println("the Small Goat price is :"+Price);
	 System.out.println("Food for Goat includes : "+Food);
	 System.out.println("overall Price of Small Goat : "+TotalPrice);
	 System.out.println("-------*---------*----------*----");
	 return Price;
	
 }


 
 int BigGoat()
 {
	 int price =10000,Food=2000;
	 double TotalPrice = price+Food+TravelCharge+Shower;
	 System.out.println("Common Travelcharge For big and small goat = "+TravelCharge);
	 System.out.println("Shower Charge common for both big and small goat =" +Shower);
	 System.out.println("the BigGoat Goat price is :"+price);
	 System.out.println("Food for BigGoat includes : "+Food);
	 System.out.println("overall Price of Big Goat : "+TotalPrice);
	 return price;
 }
	
	
}

