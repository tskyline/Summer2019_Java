package day59_exceptions;

public class throwsKeyword
{
	public static void sleep(long miliSec)throws InterruptedException
	{
		Thread.sleep(miliSec);//procrastinator-leaves the problem to the next caller
	}
	
	public static void sleep2(long miliSec)
	{
		try
		{
			Thread.sleep(miliSec);
		} catch (Exception e)
		{
			// TODO: handle exception
		}
		
	}
	public static void main(String[] args)
	{
		//sleep(3000);
		sleep2(3000);
	}
}
