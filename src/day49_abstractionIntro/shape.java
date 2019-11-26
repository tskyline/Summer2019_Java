package day49_abstractionIntro;

public class shape
{
	/*
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
    volume of cylinder: 3.14 * radius * radius * height .  
	 */
	double pi=3.14;
	double area;
	double perimeter;
	double volume;
	
	protected void area()
	{
		
	}
	protected void perimeter()
	{
		
	}
	protected void capacity()
	{
		
	}
	
	
	public static void main(String[] args)
	{
		rectangle rec=new rectangle(10,20);
		rec.area();
		rec.perimeter();
		
		cyclinder cy=new cyclinder(2, 3);
		cy.capacity();
		cy.area();
		
	}
}

