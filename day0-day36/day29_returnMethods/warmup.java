package day29_returnMethods;

import java.util.Arrays;

public class warmup
{
	public static void main(String[] args)
	{
		String freq="xxxyyyyzz";
		String temp="";	//to store non dup values
	
		for (int i = 0; i < freq.length(); i++)
		{
			if(!temp.contains(freq.substring(i,i+1)))
				temp+=freq.substring(i,i+1);	
		}
	
		String result="";
		for (int j = 0; j < temp.length(); j++)
		{
			int count=0;
		
		for (int i = 0; i < freq.length(); i++)
		{
			
			if(freq.substring(i,i+1).equals(temp.substring(j,j+1)))
			{
				count++;
			}
		}
		result+=temp.substring(j,j+1)+count;
		}
			System.out.println(result);
			
	
			//*********************************Solution 2***************************//
			
		String input="aaabbcccc";
		String nonDuplicates="";//to store unique characters
		for (int i = 0; i < input.length(); i++)
		{
			if(!nonDuplicates.contains(""+input.charAt(i)))
			{
				nonDuplicates+=""+input.charAt(i);
			}
				
		}
		String expectedResult="";
		for(int j=0;j<nonDuplicates.length();j++)
		{
		int times=0;
		
		for (int i = 0; i < input.length(); i++)
		{
			if(input.substring(i,i+1).equals(nonDuplicates.substring(j,j+1)))
				times++;
		}
		expectedResult+=nonDuplicates.substring(j, j+1)+times;	
		}
		System.out.println(expectedResult);
			
			
	}
}
