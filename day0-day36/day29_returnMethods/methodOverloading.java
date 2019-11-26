package day29_returnMethods;

import java.util.Arrays;

public class methodOverloading	//feature that allows us to have more than one method with same name,
							 	//The methods must have different parameters
{
	//improves the reusability and readability
	public static void main(String[] args)
	{
		
		int result=sumof(10, 20,30);
		System.out.println(result);
		char ch[]= {'m','k','l'};
		ch=sort(ch);
		System.out.println(Arrays.toString(ch));
		
		
	}
	public static char []sort(char []arr)//reverse sorts the array(int)
	{
		 Arrays.sort(arr);  //
	        char[] numbers = new char[arr.length]; // numbers array has same length with the arr
	        
	        int z =0;
	        for(int i = arr.length-1; i >= 0; i--  ) {
	                     numbers[z]= arr[i];
	                     z++;
	        }
	        
	        return numbers;
	}
	public static int []sort(int []arr)//reverse sorts the array(int)
	{
		 Arrays.sort(arr);  //[2,3,3,5,22];
	        int[] numbers = new int[arr.length]; // numbers array has same length with the arr
	        
	        int z =0;
	        for(int i = arr.length-1; i >= 0; i--  ) {
	                     numbers[z]= arr[i];
	                     z++;
	        }
	        
	        return numbers;
	}
	
	public static int sumof(int a,int b)
	{
		return a+b;
	}
	public static int sumof(int a, int b,int c)
	{
		return a+b+c;
	}
}
