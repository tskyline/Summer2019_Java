package day42_OOP_Encapsulation;

public class test
{

	
	public static void main(String[] args)
	{
		testData obj=new testData();
		//System.out.println(obj.Name);	//cant get it because data is private
		System.out.println(obj.getName());
		System.out.println(obj.getID());
		
		obj.setName("Cemre");
		
		obj.setID(9);
		
		System.out.println(obj.getName());
		System.out.println(obj.getID());
		
	}
}
