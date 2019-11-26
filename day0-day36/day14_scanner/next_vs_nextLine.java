package day14_scanner;

import java.util.Scanner;

public class next_vs_nextLine
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your first name :");
		String firstname=scan.nextLine();				//Tuna K.
		System.out.println(firstname);					//Tuna K.
														//nextLine returns the entire value as String
		
		String lastname=scan.next();				
		System.out.println(lastname);					//fakir
		
		String mid=scan.next();							//haci
		System.out.println(mid);						//next takes only one word at a time
		float f=123_45;
		float d=12_345;
		System.out.println(f+" "+d);
	}
}
