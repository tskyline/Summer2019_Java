package day56_polymorhisim_review;

public class polimorhisimReview
{
	public static void methodd()
	{
		System.out.println("method c from a class");
	}
	public static void main(String[] args)
	{
		a obj=new a();
		a obj1=new b(); //object is created from child class(polimorhisim-is a relation)
		obj1.methodA();//you can only call methods from A class
		//obj1.methodB();  
		b obj2=new b();//on child classes object you can call methods both from super and sub classes methods
		obj2.methodA();
		obj2.methodB();
		
		//c obj3=new c();  abstract class is not concrete
		c obj4=new d();//object must be from not abstract child class
		
		e obj5=new d();
		
		a obj6=new b();
		obj6.methodA(); //method a from b
		obj6.methodC();	//method c from a
		
		
	}
}

class a
{
	protected void methodA()
	{
		System.out.println("methodA");
	}
	public static void methodC()
	{
		System.out.println("method c from a class");
	}
}

class b extends a
{
	public void methodB()
	{
		System.out.println("methodB");
	}
	
	
	@Override //overriding
	public void methodA()//(int a)overloading
	{

		System.out.println("method a from b class");
	}
	
	public static void methodC()
	{
		System.out.println("method c from b class");
		
	}
}
abstract class c 
{
	a obj6=new a();		//has a relation
}

class d extends c implements e
{

	
	
}

interface e
{

	
	
}
abstract class f implements e
{
	
}
