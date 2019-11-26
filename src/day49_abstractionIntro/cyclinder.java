package day49_abstractionIntro;

public class cyclinder extends shape
{
	/*
	 	 Area of the cylinder: (2 * 3.14 * radius * radius) + height(2*3.14*radius)
    volume of cylinder: 3.14 * radius * radius * height .  
	 */
	double radius;
	double height;
	public cyclinder(double radius,double height)
	{
		this.height=height;
		this.radius=radius;
	}
	@Override
	protected void area()
	{
		area=(2 * pi* radius * radius) + height*(2*pi*radius);
		System.out.println("Area of the cylinder is "+area);
	}
	
	@Override
	protected void capacity()
	{
		volume=pi* radius * radius * height;
		System.out.println("Volume of the cylinder is "+volume);
	}
	
}
