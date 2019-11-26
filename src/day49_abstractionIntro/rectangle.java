package day49_abstractionIntro;

public class rectangle extends shape
{
	double width;
	double length;
	public rectangle (double length,double width)
	{
		this.length=length;
		this.width=width;
	}
	@Override
	protected void area()
	{
		area=width*length;
		System.out.println("Area of the rectangle is "+area);
		
	}
	@Override
	protected void perimeter()
	{
		perimeter=2*(width+length);
		System.out.println("Perimeter of the rectangle is "+perimeter);
	}
}
