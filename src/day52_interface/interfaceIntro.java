package day52_interface;

//no instance block, no static block
//any variable in interface is "public static final" by default

public interface interfaceIntro
{
	public abstract void methodA();
	//abstract method in interface
	
	//public interfaceIntro()
	//{ no constructor can be created in interface because there is no class, also no object}
	
	//public void method() {}
	//no instance method since it belongs to the object
	
	public static void ss()
	{
		//static method can be created in interface
		
	}
	
	//default method designed to help lamda expression
	public default void method()
	{
		
	}
	int a=100;	//this is not an instance variable. It gets static by default
	
	public static void main(String[] args)
	{
		interfaceIntro.ss();
		System.out.println(a);
		//a=500;
	}
}

interface data
{
	/*
	 	Topic: Abstraction
            Interface Intro
            Interface vs Abstract class
package: day52_Interface    
two ways to achieve abstractions:
            1. Abstract class
            2. Interface
why do we need interface?
what we can have in interface?
what we cannot have in interface?
Interface: it's blueprint of class, but it's not a class
        public interface InterfaceName{
        }
        we can store abstract methods, and let classes implement abstract methods
        interface is meant to be implemented
    implements keyword: we use the implements keyword to implement abstract methods to the class
why do we need interface?
    A class can implement multiple interfaces
    A class can extend one class only
what we can have in Interface ?
        methods: Abstract methods, static methods, default method
        variables:  public static final ==> automatically
                variables are public, static and final by default 
What we cannot have in Interface?
        Constructor
        Instance methods
        instance variable
        instance block
        static block
interface we have used: 
                    WebDriver
                    WebElemnt
                    List
                    Set
                    Map
next topic: Interface continue
                extends vs implmnets 

	 */
}

class test implements interfaceIntro,data //extends interfaceInfo
	//subtype			supertypes
{
	
	@Override
	public void methodA()
	{
		
	}
}