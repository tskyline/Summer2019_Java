package day45_inheritance;
class data
{
	public String name;
	private String age;
	String ID;
	
	public String getAge()
	{
		return age;
	}
	
	
	public void printHello()	//public
	{
		System.out.println("Hellos");
	}
	
	private void hola()		//private method can be only called in the class
	{
		System.out.println("hola");
	}
	
	void aloha()			//default
	{
		System.out.println("aloha");
	}
	
	
}
public class multiClassPractice
{
	public static void main(String[] args)
	{
		data obj=new data();
		System.out.println(obj.name);	//public is visible everywhere
		
		System.out.println(obj.getAge());	//private is not visible outside the class
		
		System.out.println(obj.ID);	//default access modifier is visible to class
		
		obj.printHello();
		obj.aloha();
		//obj.hola();
		
		
		
		
	}
}
