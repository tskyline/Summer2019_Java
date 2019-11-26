package day46_superKeyword;

import day45_inheritance.protectedVariables;

class data
{
	public int num1=10;
	protected int num2=20;
	private  int num3=30;
	int num4=40;
	
	
	}

public class inheritanceReview extends data
{				//sub					super
	
	static int staticNum=100;//it belongs to the class
	
	public static void main(String[] args)
	
	{
	
		data obj=new data();
		System.out.println(obj.num1);
		System.out.println(obj.num2);
		//System.out.println(obj.num3);
		System.out.println(obj.num4);
		
		
		inheritanceReview obj1=new inheritanceReview();
		System.out.println(obj1.num1);
		System.out.println(obj1.num2);
		//System.out.println(obj1.num3);
		System.out.println(obj1.num4);
		
		protectedVariables obj2 =new protectedVariables();
		System.out.println(obj2.namepub);
		
		
		
	}
}
