package day29_returnMethods;

import java.util.Arrays;

public class returnMethod
{
	//			new return type:...
	public static void main(String[] args)
	{
		//void :does not return any value
		//if the return type is not Void: the method MUST return a value
		name();//this is a String value 
		System.out.println(name());
		System.out.println(!bol());
		System.out.println(add(10,20));
		int arr[]= {1,2,3,4,565,456,3458,67834,234};
		System.out.println(ar(arr));
		String st[]= {"Arda","Tunahan","diffikkokomatsu"};
		System.out.println(str(st));
		int arrr[]= {1,2,3,4,5,6};
		System.out.println(Arrays.toString(sortrev(arrr)));
		
	}
	
	public static String name()
	{
		// used for exiting the method
		// also we can use "return" to return a value
		return "TK";
			/*
			 	1.does not have "void" as return type
			 	2.Must return a value
			 	3.The returning value must match with the return type of the method
			 	4.The method body must be closed with "return"
			 */
	}
	public static int []sortrev(int []arr)//reverse sorts the array(int)
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
	public static String str(String arr[])	//returns the longer string from a string array
	{
		String big="";
		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i].length()>big.length())
				big=arr[i];
		}
		return big;
	}
	public static int ar(int a[])		//returns max value from an array
	{
		Arrays.sort(a);
		
		return a[a.length-1];
	}
	public static int max(int a,int b,int c)//returns max of 3 number
	{
		int arr[]= {a,b,c};
		Arrays.parallelSort(arr);
		return arr[2];
	}
	
	public static boolean bol()
	{
		return false;
	}
	public static int add(int a,int b)
	{
		return a+b;
		
	}
	
}
