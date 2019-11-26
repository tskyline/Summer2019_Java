package day24_review;

public class warmup
{
	public static void main(String[] args)
	{
		int[]a= {13,42,23,22};
		int g=99999999;
		int max=0;
	
		for (int i = 0; i < a.length; i++)	
		{
			if(a[i]>max)	//max
			{
				max=a[i];	
			}
			if(a[i]<g)		//min number in the array
			{
				g=a[i];	
			}
		}
		System.out.println(max);
		System.out.println(g);
		int s=9999999;
		int secondmax=0;
		for (int j = 0; j < a.length; j++)	
		{
			if(a[j]>secondmax&&a[j]!=max)	//second max
			{
				secondmax=a[j];	
			}
			
			if(a[j]<s&&a[j]!=g)		//second min number in the array
			{
				s=a[j];	
			}
		}
		System.out.println(secondmax);
		System.out.println(s);
		
	}
	
}
