package day19_forLoop;

public class forLoop
{
	public static void main(String[] args)
	{
		/*for (int i=1; i<10; i += 2)//for triangle
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
		}*/
		
		
		/*for (int i = 0; i <10; i +=2)
		{
			System.out.println(" the square of "+i+" is:"+(i*i)); 
		}*/
		
		/*
		for (int i = 0; i<=32; i+=1)
		{
		if(i%2==1)
			System.out.print(i+" ");
		}*/
		
		String s="Java";
		String rev=""+s.charAt(3)+s.charAt(2)+s.charAt(1)+s.charAt(0);
		String rev2="";
	
		for (int i = s.length()-1; i >=0; i--)
		{
			System.out.print(""+s.charAt(i));
		}
		System.out.println("\n"+rev2+rev);
	
	}
}
