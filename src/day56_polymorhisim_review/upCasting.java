package day56_polymorhisim_review;

public class upCasting
{
	public static void main(String[] args)
	{
		dog obj= new dog();	
		
		obj.method1();
		obj.method2();
		
		animal obj1=(animal)obj;	//upcasting (only allowed if there IS A RELATIONSHIP)
		
		obj1.method1();
		
		animal obj2=new animal();
		//	dog obj3=(dog)obj2;		//it will throw exception downcasting not allowed
		
		
	}
}

class animal
{
	public void method1()
	{
		
	}
}

class dog extends animal
{
	public void method2()
	{
		
	}
	
}