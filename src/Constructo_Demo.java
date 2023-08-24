
 class Data
 {
	 Data()
	 {
		 System.out.println("from Constructor Common break");
	 }
	
	 void Fox()
	 {
		 int i=90;
		 System.out.println("hello  from Fox : "+i);
	 }
	 void Dj()
	 {
		 int k=50;
		 System.out.println("hello  from Dj : "+k);
	 }
	 void Bj()
	 {
		 int p=20;
		 System.out.println("hello  from Bj : "+p);
	 }
 }
	 public class Constructo_Demo {
		 Constructo_Demo()
		 {
			 System.out.println("Hi ello");
		 }
			public static void main(String[] args)
			{
				Data D = new Data();  // after creating object by default constructor will be called//
				D.Fox();             //
				D.Dj();
				D.Bj();
				Constructo_Demo obj2 = new Constructo_Demo();
			}
		}


