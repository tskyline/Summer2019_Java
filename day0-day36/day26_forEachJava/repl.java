package day26_forEachJava;

import java.util.Scanner;

public class repl
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
	     String str = scan.next();
	     String s="";
	     String b="bread";
	     int count=0;
	     for(int i=0;i<str.length()-4;i++)
	     {
	    	 if(str.substring(i,i+5).equals(b))
	    		 count++;
	     }
	     System.out.println(count);
	     if(!str.contains(b))
	     s="nothing";
	     else if(count==1)
	    	 s="nothing";
	     else if(count>1)
	    			 s=str.substring(str.indexOf(b)+5,str.lastIndexOf(b));
	    			 
	     System.out.println(s);
	}
}
