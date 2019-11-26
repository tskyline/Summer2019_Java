package day49_abstractionIntro;

public abstract class abstraction
{
	public abstract void startTheCar();
	
}

class VW extends abstraction
{
	@Override
	public void startTheCar()
	{
		System.out.println("Auto gearbox");
	}
	
}

class Mazda extends abstraction
{
	@Override
	public void startTheCar()
	{
		System.out.println("Manual gearbox");
	}
}
/*
 OOP Abstraction Intro
           1. abstract methods
           2. abstract class
           3. abstract class vs regular class
Package: day49_Recap
class name: Shape
WarmUp: 
1. create a class called Shape
   Actions: Area(), perimeter(), capacity()
2. create sub classes of Shape:
               Circle
               rectangle
               square
               cylinder
and give the instance variables that are needed to calculate the Area, perimeter, and Volume of those shapes
3. override super class' Area(), perimeter(), capacity() methods to the sub classes
Formulas:
Area of the circle:     3.14 * radius * radius
Area of the rectangle:  width * length
Area of the square:     side * side
Area of the cylinder: (2 * 3.14 * radius * radius) + height(2*3.14*radius)
Perimeter of circle:    3.14 * 2 * radius
Perimeter of rectangle: (width + length) * 2
Perimeter of Square: 4 * side
perimeter of cylinder: 2 ( pi * D + h)
volume of cylinder: 3.14 * radius * radius * height .  
remaining java topics:  Abstraction ( abstract method, abstract class, interfaces)
               Polymorphisim
               Exception handling
               Collections
           LocalDateTime
           properyties file
override vs overload:
overload: same method name, different parameter
         return-type can be same or different
         Access modifier can be same or different
         can happen in same class
         any method can be overloaded
override: same method name, same parameter
         return-type MUST be same
         access modifiers need to be same or more visible
         MUST be overridden in sub class
         only the instance method can be override
         access modifer cannot be private
         final methods cannot be overridden
         @Override annotation must be applicable
Abstraction: concetrating on essentials/important things, not worrying about the dtails/implementation
       hiding the implementation details
car: 
   start(){ 
           put the key
           turn the engine on
           start driving
       }
abstract method: a method without body/implementation
           public abstract start();  ==> generic
       it's a method that's meant to be override ( cannot be final, private), in the regular sub class
       Only the instance methods can be override and can be abstract
       
       abstract method can only be declared in abstract class and interface
           ex: 
               Pontanic car:   
                   start(){
                       call the mechanic
                       put the key in
                       start the engine
                       jump start
                       driver
                   }
               Tesla ca:
                   start(){
                       say "start"
                       driver
                   }
abstract class:  abstract is something not concrete
       we cannot create object from
       a class meant to be extended
       abstract class cannot be final
       if the sub class is regular class, the sub class MUST override the abstract methods
       if the sub class is asbtract, no need to override
why we cannot create object from abstract class?
       abstraction is something not concrete, object is concrete
*/