package day14_scanner;

import java.util.Scanner;
//imports Scanner class only from java.util package
import java.util.*;
//imports all the classes

public class Zcanner
{
	public static void main(String[] args)
	{
		//scanner class that provides the methods to get user inputs
		//in order to use it, it must be imported "import java.util.Scanner;"
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a byte");
		byte byteNum=input.nextByte();
		System.out.println("You entered: "+byteNum);
		
		System.out.println("Enter another one");
		byte byteNum2= input.nextByte();
		
		System.out.println(byteNum2+" + "+byteNum+" = "+(byteNum+byteNum2) );
		
		
		
	}
}
