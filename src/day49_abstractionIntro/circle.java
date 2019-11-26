package day49_abstractionIntro;

public class circle extends shape
{
	//Area of the circle:     3.14 * radius * radius
	//Perimeter of circle:    3.14 * 2 * radius
	double radius;
	public circle(double radius)
	{
		this.radius=radius;
	}
	@Override
	protected void area()
	{
		area=pi*radius*radius;
		System.out.println("Area of the circle is "+area);
	}
	@Override
	protected void perimeter()
	{
		perimeter=pi*2*radius;
		System.out.println("Perimeter of the circle is "+perimeter);
	}
}
