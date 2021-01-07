package mq.corejava.staticmethods;

public class FirefoxBrowser
{

	static void OpenBrowser()
	{
		System.out.println("Browser Opened");
	}
	
	static void EnterUrl()
	{
		System.out.println("page Loaded");
	}
	

	public static void main(String[] args)
	{
		/*
		 * Any static methods with in class we can call
		 * without out help of class name
		 * 
		 * 		methodname();
		 */
			OpenBrowser();
			EnterUrl();

	}

}
