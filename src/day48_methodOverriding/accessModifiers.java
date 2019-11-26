package day48_methodOverriding;
class a
{
	void methodA()
	{
		System.out.println("Method A");
	}
}

public class accessModifiers extends a
{
	@Override 
	void methodA()	//private not accepted
	{
		System.out.println("Method A-Override");
	}
	/*
	 11/04/2019
Topics:     1. Method Overriding
            2. Overloading vs Overriding
            3. final keyword:
  Overriding
            
                    constant variables
                    immutable class
                    final methods
package: day48_MethodOverRiding
method overloading:  same name, different parmeter
                    return type doesn't matter
                    access modifiers don't matter
                    any method can be overload  
method overriding: same name, same parameters, implementation functionality is different
                    Return-Type MUST be same
                    cannot happen in the smae class
                    method MUST be override in sub class
                    ONLY THE INSTANCE METHODS CAN BE OVERRIDE
                    constructor and static methods cannot be overriden
                    private methods cannot be override
                    the method we are going to override MUST be inheritable to the sub class
                    override method' access modifiers need to be same or more visible
                                default ==> deafult, protected, public
                                protected ==> protected, public
                                public ==> public
                                private ==> cannot be overridden
                            public > protected > default > private
@Override: used to verify if the method is overridden or not
why do we need overriding?
        to implement specific functionality to the method
            we create methods with same name and same parameters, then provide different implementation
Example: 
                Webdriver driver = new chromeDriver();
                driver.get("URL"): goes to the URL in chrome browser
                WebDriver driver = new FireFoxDriver();
                driver.get("URL"): goes to URL in firefox browser
    super class: Bank
            actions: InterestRate()  ==>   9%
    sub classes: BankOfAmerica  ==> 7%
                 PNC            ==> 6%
                 CapitalOne     ==> 8%
Override VS overload:
        Overload: access modifier can be same or different
                  return-type can be same or different
                  parameters MUST be different
                  any method can be overload
                  method name MUST be same
                  can happen in the same class
        Override: access modifierneeds to be same or more visible.
                  the method MUST be inheritable to the sub class
                  return type MUST be same
                  method name Must be same
                  parameters MUST be same
                  only instance methods can be override
                  MUST be override in sub class
                  @Override annotation MUST be applicable
override benifits: 
            readable
            reusability
            flexible

	 */
}
