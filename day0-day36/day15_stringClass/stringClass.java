package day15_stringClass;

public class stringClass
{
	public static void main(String[] args)
	{
		String str="TK";	//str will be stored in String Pool
		String a="TK";
		String b="TK";		//They all share same memory 
		
		String strr=new String ("TK");	//stored somewhere at Java Heap memory
		
		System.out.println(str==strr); 	//False because they have different memory location
	}
}
