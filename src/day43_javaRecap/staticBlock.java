package day43_javaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class staticBlock
{
	static String[] arr=new String[3];
	static ArrayList<String> list=new ArrayList<>();
	double salary;
	
	static
	{
		System.out.println("static block");
		arr[2]="Ayla";
		arr[0]="Kateryna";
		arr[1]="Ruslan";
		list.addAll(Arrays.asList(arr));
		//salary=5000;  static only accepts static
	}
	
	public static void main(String[] args)
	{
		System.out.println("main method");
		
		System.out.println(Arrays.toString(arr));
		System.out.println(list);
	}
}
