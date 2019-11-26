package day19_forLoop;

import java.util.Scanner;

public class warmup
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your user name");
		String user=s.nextLine();
		System.out.println("Enter your password");
		String pass=s.nextLine();
		
		String username="tunaskyline@gmail.com";
		String password="Tc230409";
		user=user.toLowerCase();
		if(user.endsWith("@gmail.com"))
		{
			if(user.equalsIgnoreCase(username)&&pass.equals(password))
			System.out.println("Loged in successfully");
			else
				System.out.println("Invalid password");
			
		}
		else
			System.out.println("Email not valid");
		
	}
}
