package day45_inheritance;

public class protected_vs_default
{
	protected static String name;	//Protected
	static String ID;			//default
	
	protected static void printHello()	//public
	{
		System.out.println("Hellos");
	}
	
	protected static void hola()		//private method can be only called in the class
	{
		System.out.println("hola");
	}
	public static void main(String[] args)
	{
		
	}
}
class cybertek
{
	class a
	{
		
	}
	public static void main(String[] args)
	{
		protected_vs_default obj=new protected_vs_default();
		obj.printHello();
		obj.hola();
		
		 
	}
}
