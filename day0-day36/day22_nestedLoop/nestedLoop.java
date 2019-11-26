package day22_nestedLoop;

public class nestedLoop
{
	public static void main(String[]args)
	{
		for (int i= 0;  i<5 ;i ++)
		{
			
			for (int j= 0; j < 5; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println();
	
		int z=5;
		while(z>0) 
		{
			int l=1;
		while(l<=5)
		{
			System.out.print("*");
			l++;
		}
		System.out.println();
		z--;
		}	
			
		for (int i=1; i<10; i += 2)//for triangle
		{
		    for (int k=0; k < (4 - i / 2); k++)
		    {
		     System.out.print("  ");
		    }
		    for (int j=0; j<i; j++)
		    {
		        System.out.print("* ");
		    } 
		  
		     System.out.println("");
		   
		}
		//System.out.println();
		for (int r=7; r>=1;r-=2)
	    {
			for (int b=0; b < (4 - r / 2); b++)
		    {
		     System.out.print("  ");
		    }
		    for (int c=0; c<r; c++)
		    {
		        System.out.print("* ");
		    } 
		  
		     System.out.println("");
	    }
		System.out.println("Count has been completed");
		
	}
	
}
