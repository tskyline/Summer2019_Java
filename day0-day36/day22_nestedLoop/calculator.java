package day22_nestedLoop;

import java.util.Scanner;

public class calculator
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Hello, Welcome to the T-CALC");
		System.out.println("PLease type the number of functionality you want to use");
		System.out.println("Type;\n 1 Multiplication(*)\n 2 Division(/)\n 3 Addition(+)\n 4 Substruction(-) \n 5 Remainder(%)");
		s.nextLine();
		int sel=s.nextInt();
		while(true)
		if(sel==1)
		{
	
			System.out.println("Please enter a valid choice");
			sel=s.nextInt();
			
		}
		

	}
}
