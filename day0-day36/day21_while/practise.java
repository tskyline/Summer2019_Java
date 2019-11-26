package day21_while;

import java.util.Scanner;

public class practise
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		while(true)
		{
			
		System.out.println("enter a number");
		int a=s.nextInt();
		System.out.println("enter another number");
		int b=s.nextInt();
		
		System.out.println("addition is :"+(a+b));
		System.out.println("do you wanna add more");
		String answer=s.next();
		if(answer.equalsIgnoreCase("no"))
			break;
		
		
		
	}
	}
}
