package day58_exceptionContinue;

public class exception_handling
{
	public static void main(String[] args)
	{
		
		try
		{
			//System.out.println(9/0);
			Thread.sleep(2000);
			System.out.println("try block");
			
		} catch (Exception e)
		{
			System.out.println("catch block");
		}
		finally
		{
			System.out.println("finally block");
		}
	}
}
