package day45_inheritance;
class testBase
{
	static String chromeDriver;
	
	public static void takeScreenShot()
	{
		System.out.println("took screenshot");
		
	}
}



public class inheritance extends testBase
{			//sub				//super
	//sub class is gonna inherit all the visible or protected features from the super class
	public static void main(String[] args)
	{
		System.out.println(chromeDriver);
		takeScreenShot();
	}
}
/*
 	Access modifiers: public, private, default, and protected
    public access modifier: visible at everywhere 
    private access modifier: only visible within the class
    default access modifier: only visible to the classes that are in the same package
                            not visible outside the package
            if we don't give public, private or protected keywords, 
            then the default access modifier will be given by default
                        ex: package A
                            public class a{
                                int num =100;
                            }
                            package B
                            public class b{
                            //  num is not visible in this class, 
                             * because those two classes are located in two different packages 
                            }
    protected access modifier: only visible to the classes that are in the same package. 
                but it can be inheritable to the classes outside the package
                Not visible but inheritable
Multiple classes: we can have multiple classes in a java file
            
            there can only be one public class, and the public class' name MUST match with the java file' name
            other classes we are creating MUST have default access modifiers
            one public class in per java file
Inheritance: used for building relationships between classes, it build super and sub relationships between classes
            
            we use "extends" keyword to build super and sub relationships between classe
 
            public  class   A    extends    B
                            sub           super 
            sub class (A): it's also called child class,
             sub class can inherit the visible or protected features from the super class
            
                features that have public or protected access modifiers:
                 can be inherited any any where, even outside the package.
                
                features that have default access modifier: 
                 can only be inherited to the classes that are in the same package with
                
                features that have private access modifier can never be inherited
            super class (B): 
            it's also called parent class, super class cannot inherit any feature from the sub class
            one class can only extend one class, but one class can be extended by multiple classes
            one super class can have multiple sub classes
 */
