package day43_javaRecap;

import java.util.Arrays;

public class instanceBlock
{
	String[] names=new String[3];
	
	{
		System.out.println("instance block");
		names[0]="Ayla";
		names[1]="Seyfo";
		names[2]="Khursed";
		
	}
	
	public instanceBlock()
	{
		System.out.println("constructor");
		names[0]="Arda";
		names[1]="Tuna";
		names[2]="Rahva";
	}
	
	public static void main(String[] args)
	{
		instanceBlock obj=new instanceBlock();
		
		System.out.println("main method");
		
		System.out.println(Arrays.toString(obj.names));
		
		instanceBlock obj1=new instanceBlock();
	}
}
