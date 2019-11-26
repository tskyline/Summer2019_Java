package day18_stringMethod;



public class stringMethods2
{
	public static void main(String[] args)
	{
		//indexOf(str): returns the index number of the first character in the given string
		String str="Tunahan Kirtil";
		int i=str.indexOf('K');
		System.out.println(i); //8
		
		int j=str.indexOf("an");
		System.out.println(j);
		
		String email="Randomemail@gmail.com";
		int k=email.indexOf("@")+1;
		int l=email.indexOf(".com");
		String emailType=email.substring(k,l);
		System.out.println(emailType); 
		
		//lastIndexOf(): returns the last occured character index number as an int 
		int i2=str.indexOf('t');
		int j2=str.lastIndexOf('i');
		System.out.println(i2+","+j2);
		
		//isEmpty(): checks if the String is empty,returns boolean
		String str1="";
		Boolean b=str1.isEmpty();
		System.out.println(b); 
		
		//equals(str): checks if the two string' face values are equal or not
		String strr=new String("tuntin");
		String strrr="TunTin";
		
		System.out.println(strr.equals(strrr));
		
		
		//equalsIgnoreCase(str): ignores case sensitivity
		System.out.println(strr.equalsIgnoreCase(strrr));
		
		//contains(str); check if str is contained in the string or not, returns boolean
		boolean b1=str.contains("una");
		System.out.println(b1); //true
		
		//startsWith("str"):checks if the String is started with the str or not, then returns boolean expressions
		String Today="Java";
		boolean b2=Today.startsWith("J");
		System.out.println(b2); //true
		
		//endsWith(str): checks if the String is ended with the given str or not 
		
	}
}
