package day50_abstraction;
class a
{
	public a()
	{
		System.out.println("a");
	}
	
}

class b extends a
{
	public b()
	{
		System.out.println("b");
	}
	
}
public class classNotes
{
	
	
		public classNotes()
		{
			System.out.println("c");
		}
		
		public static void main(String[] args)
		{
			
		}
	
	/*
	 	Abstract class VS Non-Abstract class
        Abstract interveiw questions

abstract method: can only be declared in abstract class and interface
                
                hiding the implemantation details ( does not have body)
                it's meant to be overridden in subclass (non-abstract class)
                cannot be: final, private, static
                abstract methdo can be overload
abstract keyword: can only applicable to classes & methods
Abstract class vs Non-abstract class:
        
        abstract class: 
                we can have abstract methods mamd all the non-abstract methods 
                ( anything that a non abstract class can have, abstract class can also have it)
                         a class that's meant to be extended
                         cannot be final
                         cannot create object ( object is concrete, abstraction is not concrete)
        non-abstract class: cannot have abstract methods
                            we can create objects
                            can be final (cannot extended)
final keyword: can only be applicable to variables, methods, and classes
                variables: variable becomes constent, cannot re assigned
                methods: the method cannot be overridden
                class: class becomes immutable, the class cannot be super class ( cannot be extended)
A class can only extend one class, A class can be extended by multiple classes
quiz topics: method overriding VS overloading (yesterday's note)
             final keyword 
             inheritance (this & super)
             abstraction
             questions: 20 ~ 25  ==> 40 minutes
OOP: 1. Encapsulation
     2. Inheritance
     3. Abstraction
     4. Ploymorphisim
	 */
}
