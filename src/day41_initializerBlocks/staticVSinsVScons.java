package day41_initializerBlocks;

public class staticVSinsVScons
{
	static
	{
		System.out.println("static block");
		/*
		 static block execution does not depend on the object
		 executed as soon as class is loaded,ONLY ONCE
		 */
	}
	
	{
		System.out.println("instance block");
		//instance block' execution depends on the object
		//when object is created, instance block runs first,then constructor
	}
	
	public staticVSinsVScons()
	{
		System.out.println("constructor");
		//constructor' execution depends on the object
	}
	
	public static void main(String[] args)
	{
		staticVSinsVScons obj=new staticVSinsVScons();
		staticVSinsVScons obj1=new staticVSinsVScons();
	}
}
