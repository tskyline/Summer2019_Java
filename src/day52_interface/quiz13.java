package day52_interface;

public class quiz13
{
	public static void main(String[] args)
	{
		B obj=new B();
		
	}
	
}

class A
{
	public A()
	{
		System.out.print("A ");
	}
	
	/*public A(int a)
	{
		
	}*/
}
class B extends A
{
	//Every sub class must call constructor of Super class
	//the default constructor is called by compiler automatically
	//however if it wasn't a default constructor on class A you would had to call is via super keyword
	public B()
	{
		//super(10);
		System.out.print("B ");
		
	}
	
		

}