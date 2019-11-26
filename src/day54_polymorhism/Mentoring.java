package day54_polymorhism;

public class Mentoring
{
	
	//Write a return  method that can find the unique characters from the String
//Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
	
	public static String unique(String str)
	{
		String []arr=str.split("");
		String unique="";
		for (int i = 0; i < arr.length; i++)
		{
			int num=0;
			for (int j = 0; j < arr.length; j++)
			{
				if(arr[j].equals(arr[i]))
					num++;
					
			}
			if(num==1)
				unique+=arr[i];
		}
		
		
		return unique;
	}
	
	//Write a return method that can reverse  String

	//		Ex: Reverse("ABCD"); ==> DCBA
	
	public static String reverse(String str)
	{
		String reverse="";
		for (int i = str.length()-1; i >= 0; i--)
		{
			reverse+=str.toCharArray()[i];
		}
		return reverse;
	}
	
	/*
	 	
Write a method which prints out the numbers from 1 to 30 but for numbers 
which are a multiple of 3, print "FIN" instead of the number and for numbers 
which are a multiple of 5, print "RA" instead of the number. 
for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
			
	 */
	
	
	public static void main(String[] args)
	{
		int i=1;
		String text="";
		while(i<=30)
		{
			text+=i%15==0?" FINRA ":i%5==0?" RA ":i%3==0?" FIN ":i+" ";
			i++;
		}
		System.out.println(text);
		
	}
}
