package day23_arrays;

public class warmup2
{
	public static void main(String[] args)
	{
		//write a program that picks unique character
		//aaabbbbcccqwlkkkkk
		//qwl
		
		String s="aaabbbbcccqwlkkkkt";
		String uq="";
	
		for (int j = 0; j < s.length(); j++)
		{
			int count=0;
		
		for(int i=0;i<s.length();i++)
		{
		
			if(s.substring(i,i+1).equals(""+s.charAt(j)))
			{
				count++;
					
			}	
				
		}
		if(count==1)
		{
			uq+=""+s.charAt(j);
		}
		
		}
		
		System.out.println(uq);
	}
}
