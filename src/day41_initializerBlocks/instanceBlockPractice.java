package day41_initializerBlocks;

public class instanceBlockPractice
{
	public String name="Shirin";//1
	
	public instanceBlockPractice()
	{
		name="Dinara";//3
	}
	
	{//instance block
		name="Mihray";//2
	}
	
	
	public static void main(String[] args)
	{
		instanceBlockPractice obj=new instanceBlockPractice();
		System.out.println(obj.name);
	}

}
