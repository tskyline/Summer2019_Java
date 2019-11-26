package day24_review;

import java.util.Scanner;

public class assignment
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		/*
		String[] five=new String[5];					//assignment Arrays_Printing
		System.out.println("Please type 5 words");
		for (int i = 0; i < five.length; i++)
		{
			five[i]=s.nextLine();
		}
		for (int i = 0; i < five.length; i++)
		{
			System.out.println(five[i].substring(0,3));
		}*/
		
		String input="xxxabyyyycd";						//assignment triples
		
		int count=0;
		for (int i = 0; i < input.length()-2; i++)
		{
			
			if(input.charAt(i)==(input.charAt(i+1))&&input.charAt(i)==(input.charAt(i+2)))
			{
					count++;
			}
		}
		System.out.println(count);
		
		/*String word = s.next();							//Repeat Seperator
		String separator = s.next();
		String out="";
		int count = s.nextInt( );
		
		for (int i = 1; i < count; i++)
		{
			out+=word+separator;
		}
		out+=word;
		System.out.println(out);
		*/
		String str="java is a gun java";
		 int count2=0;
		   
		    
		    for(int i=0;i<str.length()-3;i++)
		    {
		     
		      if(str.substring(i,i+4).equals("python"))
		      {
		        count2++;
		      }
		      
		    }
		    System.out.print(count2);
		    
		
		
		
	}
}
