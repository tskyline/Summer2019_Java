package day26_forEachJava;

public class continueStatement
{
	public static void main(String[] args)
	{
		//used for skipping the current iteration of the loop and jumps to the next statement
		for (int i = 0; i < 5; i++)
		{
			if(i==2)
				continue;
			System.out.print(i+" ");
			
		}
		System.out.println();
		
		
		int[] nums= {1,2,3,4,5};
		for (int i = 0; i < nums.length; i++)
		{
			if(i<3)
				continue;
			System.out.print(nums[i]+" ");
		}
		
		
	}
}	
