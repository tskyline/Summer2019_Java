package day21_while;

import java.util.Scanner;

public class whileLoop
{
	public static void main(String[] args)
	{
		/*while(condition)
		{
			statement;
			loop gets executed as long as the 
			condition is true.
		}*/
		int a=9;
		while(a>8)
		{
			System.out.println("Hello While");
			a--;
		}
		
		int count=0;
		String sentence="I like book, I read book. book ";
		while(sentence.contains("book"))
		{
			count++;
			sentence=sentence.replaceFirst("book", "");
		}
		System.out.println(count); 
		int i=0;
		while(true)
		{
			
			i++;
			System.out.println("He :"+i);
			if(i==5)
			break;//any for loop can always be converted to while loop
		}
		
		/*converting for loop to while loop
		 *  initialization;
		 *  	while(condition)
		 *  		statements;
		 *  		iteration;
		 */
		
		Scanner s=new Scanner(System.in);
		int start=s.nextInt();
		
		int end=s.nextInt();
		
		for(int j=start;j<=end;j++)
		{
			if(j%2==0)
			System.out.print(j+" ");
			
		}
		
		//for conv while
		
		int k=start;
		while(k<end)
		{
			if(k%2==0)
				System.out.print(k+" ");
		k++;	
		}
		
		
	}
}
