package day16_recap;

import java.util.Scanner;

public class nextLine
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your phone number");
		//int phonenum=s.nextInt();	//1234 Enter (before giving the value you can press enter
		
		System.out.println("Enter your name");
		//String name=s.nextLine();	//it will take everything in th scanner memory even the enter
									//that s why you can't enter phonenum
									//after pressing enter no value can be added 
		
		
		int phone=s.nextInt();
		s.nextLine();				//to be able to use nextline with other methods use extra nextline
		String na=s.nextLine();
		System.out.println(phone+na);
		
	}
}
