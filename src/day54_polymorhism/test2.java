package day54_polymorhism;

interface interFace
{
	/*
	 
	 	
        if we make the abstract class as reference type, the object MUST be created from it's sub class (Non-Abstract)
        if we make the interface as reference type, 
        object MUST be created from the classes (non abstract) that are implementing the interface
Method overriding: ONLY THE INSTANCE METHOD CAN BE OVERRIDEN
            cannot be static, final, private
            MUST take place at sub class
extends & implements:
        class extends class
        interface extends interface
        
        class implements interface

	 
	 */
	abstract void get();
}

interface interFace2 extends interFace
{
	abstract void frame();
}

abstract class abstracClass
{
	
}


public class test2 extends abstracClass implements interFace,interFace2
{
	public static void main(String[] args)
	{
		interFace obj=new test2();
		obj.get();
		
		interFace2 obj1=new test2();
		obj1.frame();
		obj1.get();
		
		abstracClass obj2=new test2();
		
		
	}

	@Override
	public void get()
	{
		System.out.println("Chrome browser");
	}

	@Override
	public void frame()
	{
		System.out.println("frame");
		
	}
}
