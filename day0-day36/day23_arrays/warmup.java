package day23_arrays;

public class warmup
{
	public static void main(String[] args)
	{
		//write a program that divides 2num without using division
		int a=10;
		int b=3;
		int n=0;
		
		System.out.println(a/b);
		for(int i=1;a>=b;i++)
		{
			a-=b;
			
			n=i;
		}
		System.out.println(a);//a is now remainder
		
	}
}
