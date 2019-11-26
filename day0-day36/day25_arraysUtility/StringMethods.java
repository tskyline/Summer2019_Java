package day25_arraysUtility;

import java.util.Arrays;

public class StringMethods
{
	public static void main(String[] args)
	{
		/*
		 	split(str):
		 				splits the string by the given value and returns as String array
		 	
		 	
		 */
		
		String sentence="Today is great day, Good day to learn Java";
		String arr[]=sentence.split(" ");
		System.out.println(Arrays.toString(arr));
		
		String email="Tuna_Skyline";
		String arrg[]=email.split("_");
		
		String str=Arrays.toString(arrg);
		System.out.println(str.replace("[","").replace("]",""));
		
		
		/*
		 	toCharArray():
		 					returns a char array from the string
		 */
		String st="java";
		char[] ch=st.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		
	}
}
