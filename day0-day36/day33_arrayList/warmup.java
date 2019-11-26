package day33_arrayList;

import java.util.Arrays;

public class warmup
{
	/*
	 	Warm up:
1	write a return method that accepts an int array and sorts it in descending order

2	write a return method that accepts a double array and sorts it in descending order

3	write a return method that accepts a char array and sorts it in descending order

4	write a return method that accepts a String array and sorts it in descending order

		Hint: method overloading is prefered here

	 */
	public static void main(String[] args)
	{
		int a[]= {1,4,2,3};
		String ar[]= {"Tuna","Arda","Cemre","Ilknur"};
		
		System.out.println(Arrays.toString(sort(a)));
		System.out.println(Arrays.toString(sort(ar)));
	}
	
	public static int[] sort(int a[])			//1
	{

		int ar[]=new int[a.length];
		Arrays.sort(a);
		int j=0;
		for (int i = a.length-1; i >=0; i--)
		{
			
				ar[j]=a[i];
			j++;
		}
	
		return ar;
	}
	
	public static double[] sort(double a[])		//2
	{

		double ar[]=new double[a.length];
		Arrays.sort(a);
		int j=0;
		for (int i = a.length-1; i >=0; i--)
		{
			
				ar[j]=a[i];
			j++;
		}
	
		return ar;
	}
	
	public static  char[] sort(char a[])		//3
	{

		char ar[]=new char[a.length];
		Arrays.sort(a);
		int j=0;
		for (int i = a.length-1; i >=0; i--)
		{
			
				ar[j]=a[i];
			j++;
		}
	
		return ar;
	}

	public static String[] sort(String a[])		//4
	{

		String ar[]=new String[a.length];
		Arrays.sort(a);
		int j=0;
		for (int i = a.length-1; i >=0; i--)
		{
			
				ar[j]=a[i];
			j++;
		}
	
		return ar;
	}

	public static Integer[] sort(Integer a[])
	{
		Integer ar[]=new Integer[a.length];
		Arrays.sort(a);
		int j=0;
		for (int i = a.length-1; i >=0; i--)
		{
			
				ar[j]=a[i];
			j++;
		}
	
		return ar;
	}
}
