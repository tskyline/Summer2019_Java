package day49_abstractionIntro;

public class square extends shape
{
	double side;
	public square(double side)
	{
		this.side=side;
	}
	@Override
	protected void area()
	{
		area=side*side;
		System.out.println("Area of the square is "+area);
	}
	@Override
	protected void perimeter()
	{
		perimeter=side*4;
		System.out.println("Perimeter of the square is "+perimeter);
	}
}
