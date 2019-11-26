package day20_forLoop2;

import java.util.Scanner;

public class warmup
{
	public static void main(String[] args)
	{
		//sum of all even numbers 1-1000
		int sume=0;
		int sumo=0;
	
		for (int i = 0; i <=1000; i+=2)
		{
				sume+=i;
		}
		System.out.println(sume);
		
		//sum of all odd numbers
		for(int i=1;i<=1000;i+=2)
		{
			sumo+=i;
		}
		System.out.println(sumo);
		//sum of 10 numbers entered
		/*
		int sum=0;
		Scanner s=new Scanner(System.in);
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Enter your number");
			int in=s.nextInt();
			sum+=in;
		}
		System.out.println(sum);
		*/
		
		//max number
		int sum=0;
		Scanner s=new Scanner(System.in);
		int j=-999999999;
		for (int i = 1; i < 6; i++)
		{
			System.out.println("Enter your number");
			int in=s.nextInt();
			if(in>j)
				j=in;
			//sum+=in;			min number
			//if(sum/i>=in)
			//	j=in;
			
		}
		System.out.println(j);
		
		
	}
}
