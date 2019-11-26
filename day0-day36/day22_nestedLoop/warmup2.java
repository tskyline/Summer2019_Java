package day22_nestedLoop;

public class warmup2
{
	public static void main(String[] args)
	{
		//how to reverse a string
		//palindrome  abba= abba, level=level, tuna!=anut
		String str="Anastas mum satsana";
		String strr="";
		int i=str.length()-1;
		while(i>=0)
			{
				strr+=str.substring(i,i+1);
			i--;
			}
		System.out.println(str.equalsIgnoreCase(strr));
	}
}
