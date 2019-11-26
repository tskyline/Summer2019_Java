package day41_initializerBlocks;

public class instanceBlocks
{
	
	{
		System.out.println("instance block");
	}
	
	public instanceBlocks()
	{
		System.out.println("Constructor");
	}
	public static void main(String[] args)
	{
		instanceBlocks obj=new instanceBlocks();
		instanceBlocks obj1=new instanceBlocks();
		instanceBlocks obj2=new instanceBlocks();
		
	}
}
