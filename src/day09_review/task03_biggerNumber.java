package day09_review;

public class task03_biggerNumber
{
	public static void main(String[] args)
	{
		int n1=25,n2=22,n3=4;
		if(n1>n2 && n1>n3)
		{
			System.out.println("n1 is bigger");
		}
		else if(n2>n1&&n2>n3)
		{
			System.out.println("n2 is bigger");
		}
		else
		{
			System.out.println("n3 is bigger");
		}
	}
}
