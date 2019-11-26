package day34_constructors;

public class constructorM
{	
	
	public  constructorM()
	{
		System.out.println("Default Constructor");
	}
	public constructorM(String a)
	{
		System.out.println(a+" "+a);
	}
	public constructorM(int num)
	{
		System.out.println(num);
	}
	public static void main(String[] args)

	{
		/*
		 	methods:
		 		access-modifier   specifier    return-type    methodname(parameter){}
		 		
		 	Constructor:
		 		access-modifier   className(parameter){}
		 		
		 		Every single class must have a constructor. Otherwise class never compiles
		 		If constructor hasn't provided, compiler will arrange the default constructor(no argument).
		 	
		 	default constructor:
		 		access-modifier className(){}
		 		
		 	constructor with an argument:
		 		access-modifier className(parameter){}
		 		
		 		constructor cannot have return-type and specifier
		 		constructor's name must be the same as class name
		 		
		 	constructor calls:
		 		only a constructor can call another constructor
		 		
		 	how to execute:
		 		depends on the creation of the object
		 	
		 	create an object from a class:
		 		className referenceName = new existingConstructorMethod
		 		
		 	If you wanna have more than one constructor, you need to overload the constructor
		 	
		 		
		 */
		
		constructorM obj=new constructorM();
		//constructorM obj=new constructorM("A"); not gonna work because object was not created with existing constructor
		
		constructorM obj2=new constructorM("abc");
		constructorM obj3=new constructorM(9);
		
	
	}
	
}
