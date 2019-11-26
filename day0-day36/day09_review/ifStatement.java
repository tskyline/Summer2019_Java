package day09_review;

public class ifStatement
{
	public static void main(String[] args)
	{
		// single if statement
		int a=0;
		if(a%2==1)
				//block only gets executed if boolean expression is true	
		{
			System.out.println(a+" is an odd number.");
			
		}
			else if(a%2==0)
		{
			System.out.println(a+" is an even number.");
		}
			else
			{
				System.out.println("Please enter a positive value.");
			}
		System.out.println((int)(10.0/3));
		
	}
}
