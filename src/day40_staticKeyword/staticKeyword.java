package day40_staticKeyword;

public class staticKeyword
{
	//static: means that we can access the members through the class name
		//static members belongs to the class(class members)
	
	/*
	 	What can be static in Java:
	 		1. static variables
	 		2. static methods
	 		3. static block
	 		4. static inner class(nested class)
	 		
	 	instance variables	: 	created in the class outside any method.
	 							belongs to the object.
	 							each object will have their own copy 
	 	
	 	local variables	  	:	declared within methods or blocks
	 		 					only accessible within the method or block
	 	
	 	static variables	:	created in the class outside any method with "static" keyword.
	 							When a variable is static, it's shared by class and all objects of the class 
	 							We can call it through the class name.
	 							There can only be one copy.
	 			
	 	static method		:	A method that we can call through the class name
	 							static methods only accept class members
	 							
	 							non-static can only be called through the objects in the static method.
	 	
	 	instance variable VS static variable:
	 			instance variables belong to object(fields)
	 			static variables belong to the class(class variables)
	 			
	 			static methods only accepts class members, non-static
	 			must be called through the object
	 			
	 			static features are shared by class
	 			
	 		summary:
	 			1. static is shared by class and all other objects
	 			2. there can only be one copy for the static variable
	 			3. each objects has its own copy of instance variable
        		4. static members can be called through the class name
        		5. static methods only accepts static members
        		6. in order to call none static in a static method we MUST call it though the object
	 		
	 */
			int a;
	static 	int b=73;
	public static void method1()
	{
		
	}
	
	public static void main(String[] args)
	{
		staticKeyword obj=new staticKeyword();
		obj.a=100;
		
		staticKeyword obj1=new staticKeyword();
		obj1.a=200;
		
		System.out.println(staticKeyword.b);
		System.out.println(obj1.b);
		
		
	}
	
}
