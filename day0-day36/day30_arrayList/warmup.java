package day30_arrayList;

public class warmup
{
	//returns removed duplicated chars from a String
	public static String dup(String a)

	{
		String b="";
		for (int i = 0; i < a.length(); i++)
		{
			if(!b.contains(a.substring(i,i+1)))
				b+=a.substring(i, i+1);
		}
		return b;
	}
	//returns unique chars from a String
	public static String uni(String a)
	{
		String b="";
		for (int i = 0; i < a.length(); i++)
		{
			int count=0;
			for (int j = 0; j < a.length(); j++)
			{
				if(a.charAt(i)==a.charAt(j))
					count++;
			}
			if(count==1)
				b+=a.charAt(i);
			
		}
		return b;
	}
	
	public static void main(String[] args)
	{
		String a="aaabbbcccccddef";
		System.out.println(dup(a));
		System.out.println(uni(a));
		
	}
}
