package day54_polymorhism;

abstract class abstractClass
{
	
}

public class test extends abstractClass 
{
	public static void main(String[] args)
	{
	//	abstractClass abj=new abstractClass(); 		ce-because we can not create object from abstract or interface class
	
		abstractClass abj=new test();
	}
}
