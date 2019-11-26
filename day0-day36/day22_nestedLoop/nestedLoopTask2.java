package day22_nestedLoop;

import java.util.Scanner;

public class nestedLoopTask2
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String answer="";
		while(true)
		{
		System.out.println("Enter two numbers");
		int num1=s.nextInt();
		int num2=s.nextInt();
		System.out.println("Multiplication is: "+(num1*num2));
		System.out.println("Doo youuu you feel like I do");
		s.nextLine();
		answer=s.nextLine();
		while(!(answer.equals("yes"))||answer.equals("no"))
		{
			answer=s.nextLine();
		}
		if(answer.equalsIgnoreCase("no"))
			break;
		
		}
	}
}
