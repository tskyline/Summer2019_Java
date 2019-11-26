package day34_constructors;

import java.util.ArrayList;

public class warmup
{
	public static String removeDup(String str)
	{
		/*
		  1. write  a return method that can remove duplicates from a string
        Ex: RemoveDup("abcabc") ==> returns "abc";
		 */
		String result="";
		for (int i = 0; i < str.length(); i++)
		{
			if(!result.contains(str.substring(i,i+1)))
				result+=str.substring(i, i+1);
		}
		return result;
	}
	public static int count(String a,String b)
	{
		/*
		 	 2. write a return method that accepts two parameter Strings a and b, 
		 	 and returns the total numbers of apperence of b in String a
        Ex: count("abcaba")  ==> returns 3 ;
		 */
		int count=0;
		/*Alternative
		 * int i=0;
		while(i<a.length())
		{
			if(a.substring(i,i+1).equals(b))
				count++;
			i++;
		}*/
		while(a.contains(b))
		{
			count++;
			a=a.replaceFirst(b,"");
		}
		return count;
	}
	public static String freq(String str)
	{
		String result="";
		/*
		 	3. use the above two methods to write a new method that can find the frequency of characters
        Ex: frequency("aabcabcabc") ==>a4b3c3
		 */
		String nonDup=removeDup(str);
		for (int i = 0; i < nonDup.length(); i++)
		{
			result+=nonDup.substring(i,i+1)+count(str,nonDup.substring(i,i+1));
		}
		return result;
	}
	public static Integer max(ArrayList<Integer> arr)
	{
	
		int maxi=Integer.MIN_VALUE;
		/*
		 	4. write a return method that can find the maximum number from an Integer arrayList  
		 	 (DO NOT use sort methods of Collections class)
		 */
		for (int i = 0; i < arr.size(); i++)
		{
			if(arr.get(i)>maxi)
				maxi=arr.get(i);
		}
		return maxi;
	}
	public static Integer min(ArrayList<Integer> arr)
	{
		
		int mini=Integer.MAX_VALUE;
		
		/*
		 	 5. write a return method that can find the minimum number from an Integer arrayList 
		 	     (DO NOT use sort methods of Collections class)
		 */
		for (int i = 0; i < arr.size(); i++)
		{
			if(arr.get(i)<mini)
				mini=arr.get(i);
		}
		return mini;
		
	}
	
	public static void main(String[] args)
	{
		System.out.println(count("aabbb","b"));
		System.out.println(removeDup("aabbbccdefffd"));
		System.out.println(freq("aabbbccdefffd"));
		ArrayList <Integer> a=new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(32);
		a.add(678);
		a.add(900);
		a.add(322);
		System.out.println(max(a));
		System.out.println(min(a));
	}
}
