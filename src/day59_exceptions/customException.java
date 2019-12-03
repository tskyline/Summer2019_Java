package day59_exceptions;
class customEx extends RuntimeException//custom unchecked exception class
{
	public customEx()
	{
		System.out.println("There is no break");
	}
}


class customUnEx extends Exception	//custom checked exception class
{
	public customUnEx()
	{
		super();
		System.out.println("Time to stop");
	}
}

public class customException
{
	
	public static void main(String[] args) throws customUnEx
	{
		try
		{
			throw new customEx();
		} catch (RuntimeException e)
		{
			System.out.println("no break for you");
		}
		//********************************************//
		
			throw new customUnEx();
		/*
		 package day59_Exceptions;
public class NoBreakTimeException extends RuntimeException{
    public NoBreakTimeException() {
        
        super("Too much breaks have occured in java course");
        System.err.println("There is no break till we get job done");
    }
    
}
		 */
		
		
	}
}
