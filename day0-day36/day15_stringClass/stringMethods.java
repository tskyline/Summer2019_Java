package day15_stringClass;

public class stringMethods
{
	public static void main(String[] args)
	{
		String str="Tunahan Kirtil";
		//index num:0123456789ABCD
		
		int j=str.length();
		System.out.println(j); 			//length()
		
		String s1="Hedbele";
		s1=s1.concat(" diffikko");						//String can not be modified.
		System.out.println(s1); 		//concat()			returns as a brand new string value
		
		str=str.toUpperCase();
		System.out.println(str);		//toUppercase() 	
		
		str=str.toLowerCase();			//toLowerCase()
		System.out.println(str);
		
		char ch=str.charAt(0);			//charAt(index)
		System.out.println(ch);
		
		int i=ch;
		System.out.println(i);
		
		
	}
}
