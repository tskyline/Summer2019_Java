package day30_arrayList;

import java.util.Arrays;

public class wrapper_class
{
	public static void main(String[] args)
	{
		/*
		 	every primitives in java has a class that's designed to it.
		 	
		 	primitives		: byte, short, int, 	long, float, double, boolean, char
		 	wrapper classes	: Byte, Short, Integer,	Long, Float, Double, Boolean, Character
		 	
		 	all wrapper classes presented in "java.lang" package
		 	
		 	String class is also presented in "java.lang" package
		 	
		 	All classes in "java.lang" are imported by default.
		 */
		
		int num=10;
		Integer numw=10;
		
		double d=1.1;
		Double dw=1.1;
		
	
		long l=20L;
		Long lw=l;	//	Auto-Boxing: process in the background 
		
		Boolean rw=false;
		boolean r=rw;	// Unboxing
		
		int[]arr=new int[3];
		System.out.println(Arrays.toString(arr));
		Integer[]arw=new Integer[3];
		System.out.println(Arrays.toString(arw));
		
		
		//All the default value of wrapper classes is "null".
		
		/*		
		 		useful methods of wrapper class
		 		Max_Value
		 		Min_Value
		 		parse methods
		 		ValueOfmethods
		 		
		 */
		
		Integer num2=20;
		int x=num2.MAX_VALUE;
		System.out.println(x);
		
		
		
		}
}
