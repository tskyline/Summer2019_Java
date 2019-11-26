package day23_arrays;

import java.util.Scanner;

public class arrayss
{
	public static void main(String[] args)
	{
		int[] arr= {10,20,30,40};
		System.out.println(arr[0]);
		String []names= {"Tuna","Arda","Hovarda"};
		System.out.println(names[1]);
		//arrays size is fixed and is immutable
		
		for (int i = 0; i < names.length; i++)
		{
			System.out.println(names[i]);
		}
		
		/*
		 * Array's size must be initialized.
		 * We can initialize it 2 ways
		 * 	1. int[] a={1,2,3}	giving value
		 * 	2. int[] b=new int[length]; giving length
		 */
		
		int[] b=new int[3];
		b[0]=100;
		System.out.println(b[0]);
		Scanner s=new Scanner(System.in);
		for (int i = 0; i < b.length; i++)
		{
			System.out.println("enter array num "+i);
			b[i]=s.nextInt();
			
		}
		
		for (int i = 0; i < b.length; i++)
		{
			System.out.print(b[i]);
		}
		
	}
}
