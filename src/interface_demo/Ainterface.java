package interface_demo;

 interface Ainterface
{
	void DemoA();
	
	default void DemoAA()
	{
		System.out.println("from demoAA");
	}

}
	
