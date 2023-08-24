package interface_demo;

 interface Binterface extends Ainterface
 {
	 void DemoB();
	 
	 default void DemoBB()
		{
			System.out.println("from demoBB");
		}
 }
