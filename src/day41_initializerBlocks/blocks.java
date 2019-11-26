package day41_initializerBlocks;

public class blocks
{

	/*
	 	static member	:
	 					1.Static Variable
	 					2.Static methods
	 					3.Static initializer blocks
	 					4.inner class(nested class)
	 					
	 	static variable	: declared in the class,outside any method, with static keyword
	 					(class variables)
	 					shared by the class and all the objects of the class
	 					
	 	static method	: Shared by the class(global),a method that can be called using class name
	 					
	 					
	 	static initializer block: used for initializing static variables, first thing that gets executed
	 							
	 	
	 	"	static 
	 	{
	 		statement;
	 	}
	 	"
	 	
	 */
	
	static
	{
		System.out.println("Static Block A");
		
	}
	public blocks()
	{//constructions execution depends on the creation of object
		System.out.println("Constructor");
	}
	public static void main(String[] args)
	{
		blocks obj=new blocks();
		blocks obj1=new blocks();
		blocks obj2=new blocks();
		blocks obj3=new blocks();
		blocks obj4=new blocks();
		System.out.println("Main Method");
		
	}
	static
	{
		System.out.println("Static Block B");
	}
}
