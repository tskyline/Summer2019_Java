package day53_interfaceContinue;

public interface extends_vs_implements extends b
{				//subtype					supertype
	void method1();	//public
	void method2(); //public
	//void method3(); hidden (implemented from interface b)
	  // public void method3() { }
	
	/*
	 	Extends keyword vs Implements keyword:
    
        extends keyword: a class can be extended by multiple classes
                         a class can extend only one class
                         class extends class
                         interface extends interface
        implements: only used for interface to be implemented to the class
                    can implement as many interfaces as we want
                    class implements interface 
        we can use extends and implement keyword at the same time
            class extends class implements interface(S)
	 */
	
}

//abstract class a implements extends_vs_implements
class a implements extends_vs_implements 
{

	@Override
	public void method3()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2()
	{
		// TODO Auto-generated method stub
		
	}
	
}

interface b
{
	void method3();
}

class c extends a implements b,extends_vs_implements 
{
	//extends first implements next
}


