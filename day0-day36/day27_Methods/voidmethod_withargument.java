package day27_Methods;

import java.util.Arrays;

public class voidmethod_withargument
{
	 //methoods with parameters:
	 //sometimes method needs specific information to perform its task
	public static void paraOddEven(int a)
	{
		if(a%2==0)
		System.out.println("Your number is even");
		else
			System.out.println("Your number is odd");
	}
	
	public static void sum(int a,int b)
	{
		System.out.println("Sum of your numbers is "+(a+b));
	}
	
	public static void removeduplic(String a)//remove duplicate method
	{
		String str="";
		
		for (int i = 0; i < a.length(); i++)
		{
			if(!str.contains(a.substring(i, i+1)))
				str+=a.substring(i,i+1);
				
		}
		System.out.println(str);
	}
	
	public static void main(String[] args)
	{
		String a="aaaabbbbcccck";
		paraOddEven(12);
		sum(10, 15);
		removeduplic(a);
		
		int haci[];
	
		int del[]= {1,2,3,4,5};
		haci=del;
		for(int each:haci)
		{
			System.out.print(each);
		}
		System.out.println(Arrays.toString(haci));
		
		
	}
}
