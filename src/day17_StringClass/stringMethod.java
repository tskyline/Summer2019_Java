package day17_StringClass;

public class stringMethod
{
	public static void main(String[] args)
	{
		//trim(): removes the unused spaces
		String s1="       hello";
		s1=s1.trim();
		System.out.println(s1);
		String s2="         hedene         sdkjfbsldkf";
		s2=s2.trim();
		System.out.println(s2); //hedene         sdkjfbsldkf
		
		//substring(beginning index): give an index number and it will consider as beginning index
		s2=s2.substring(0,3);
		System.out.println(s2);
		
		//replace(old char, new char): replaces all old char values with new given char values 
		//returns it as new String value
		String str="Java is Fun Programming Language";
		str=str.replace('a','i');
		System.out.println(str); //Jivi is Fun Progrimming Linguige
		
		//replace(old str,new str):
		str=str.replace("Jivi","Java");
		System.out.println(str); 	//Java is Fun Progrimming Linguige
		
		//replaceFirst(old str,new str):
		str=str.replaceFirst("Java","Python");
		System.out.println(str);
		
		
	}
}
