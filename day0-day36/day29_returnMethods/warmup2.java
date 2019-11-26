package day29_returnMethods;

public class warmup2
{
	public static void main(String[] args)
	{
		String str="AABBCCCeedddeee";	//expexted result="A2B2C3D4";
		String expected="";
	
		
	for(int j=0;j<str.length();j++)
		{
		int count=0;
			for (int i = 0; i < str.length(); i++)
			{
			if(str.charAt(i)==str.charAt(j))
				count++;
			}
			expected+=""+str.charAt(j)+""+count;
			str=str.replace(""+str.charAt(j),"");
		}
	System.out.println(expected);
	
	}
}
