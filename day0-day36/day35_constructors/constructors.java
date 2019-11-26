package day35_constructors;

public class constructors
{
	/*
	 	13 rules of constructor
	 	1.	Only a constructor can call another constructor.
	 	2.	Constructor cannot be called by constructor name.
	 		Constructor can be only called by "this()" keyword to call the constructor.
	 	3.	Constructor call has to be a priority. It has to be the first statement.
	 	4.	Constructor cannot call itself.
	 	5.	One constructor can only call one constructor.
	 	6.	Constructor cannot contain itself.
	 	7.	
	 */
	public constructors(int a)
	{
		// RULE4 this(true);
		
		System.out.println(a);
	}
	public constructors(boolean b)
	{
		// RULE3 SYSTEM.OUT.PRINTLN("");
		this(10);	//rule1,2
	}
	public static void main(String[] args)
	{
		constructors obj=new constructors(10);
	}
}
