package mq.corejava.staticmethods;

public class Test_Firefox {

	public static void main(String[] args)
	{
		/*
		 * Inorder to call static methods from outside class
		 * we should add classname 
		 * 
		 * 			Classname.methoname();
		 */
		FirefoxBrowser.OpenBrowser();
		FirefoxBrowser.EnterUrl();

	}

}
