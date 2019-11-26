package day29_returnMethods;

public class returnStatement
{
	public static int number()
	{
		if(true)
			System.exit(0);		//pulls the plug, all the execution will stop
		
		return 5;
	}
	public static void main(String[] args)
	{
		System.out.println(number());
		System.out.println("Done");
	}
}	
