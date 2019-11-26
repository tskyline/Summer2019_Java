package day46_superKeyword;

class a
{
	String name="tunb";
	public void methodA()
	{
		
	}
	public a(int a)
	{
		
	}
}
public class superKeyword extends a
{
	public void method()
	{
		System.out.println(super.name);
		super.name = "Mahir";
        this.name = "Ihsan";
        super.methodA();
        this.methodA();
	}
	
	public superKeyword(int a)
	{
		super(10);
	}
	/*
	 Topic: super Keyword: super. & super()
       Constructor in Inheritance
       super vs this
package: day46_SuperKeyword
Inheritance:  super and sub classes
    
        class   A    extends    B
                sub            super
        subclass:  sub class inherits features from the super class
                    sub class gets rich
                    public and protected access modifiers can always be inheritable in the subclass
                    default access modifier can only be inherited to the classes that are in the same package with
                    private can NEVER be inherited
        superclass: super class does not inherit anything from the sub class
this. : used for calling instances variables, can only be used in object instances
super. : used for calling instances (instance variable and methods) from the super class 
            super keyword can only be used in the subclass
this. vs super. :
        this. : used for calling the instances from the class itself
                to use this, we dont need inheritance 
        super. : used for calling the instances from the super class
                to use super, we MUST have super class and sub class
Constructor: at least one of the constructors from the super class has to be called in the sub class
        
        super class' default constructor is called in the sub class by default
super(): used for calling the constructors from the super class
        MUSt be used in the sub class.
this(): used for calling the constructors from the class itself

	 */
}
