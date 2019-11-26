package day25_arraysUtility;

import java.util.Arrays;

public class arraysMethods
{
	public static void main(String[] args)
	{
		int[]arr= {3,2,1};
		//to print  single dimensional arrays to a string value
		//Arrays.toString(variablename)
		
		//Arrays class: import from util package
		
		String str=Arrays.toString(arr);
		System.out.println(str);
		
		String names[]= {"tuna","arda","cemre"};
		System.out.println(Arrays.toString(names));
		
		/*
		 	Arrays.sort(varaiableName):
		 	
		 	sort the array in ascending order
		 	
		 */
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		
		//***************// 				sort the array in descending order
		int rra[]= new int[arr.length];
		int z=0;
		for (int i = arr.length-1; i>=0; i--)
		{
			
				rra[z]=arr[i];
			
				z++;
			
			
		}
		System.out.println(Arrays.toString(rra));
	}
}
