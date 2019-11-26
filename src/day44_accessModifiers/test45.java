package day44_accessModifiers;

import day45_inheritance.protected_vs_default;

public class test45 extends protected_vs_default
{
	public static void main(String[] args)
	{
		
		printHello();
		hola();							//protected
		System.out.println(name);	//only public and protected can be inheritad outside the package 
		//System.out.println(obj.ID);
		
		//default: not visible outside the package
		
		testData obj=new testData();
		System.out.println(obj.year);
	}
}
