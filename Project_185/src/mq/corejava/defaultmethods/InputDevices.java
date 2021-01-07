package mq.corejava.defaultmethods;

public class InputDevices
{
	
	void keyboard()
	{
		System.out.println("keyboard active");
	}
	
	void mouse()
	{
		System.out.println("mouse active");
		
	}

	public static void main(String[] args) {
	
		/*
		 * Inorder to call any instance method other than
		 * static method we should create object for class.
		 * 			new Classname().methodname();
		 */
		new InputDevices().keyboard();
		new InputDevices().mouse();
	}

}
