package day44_accessModifiers;

public class testData
{
	public static String Name="Julia";
	public static String ID="007";
	
	static int age=20;				// default access modifier
	protected static int year=2019;	//protected access modifier: difference is , it is inharitable outside
	public static void printHello()
	{
		System.out.println("Hello");
	}
}
