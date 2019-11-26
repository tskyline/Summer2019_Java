package day07_unerayShorthand;

public class unaryOperators
{
	public static void main(String[] args)
	{
		//increment ++
		//decrement --
		int z=100;
		System.out.println(z--);
		System.out.println(z);
		
		int x=100;
		System.out.println(--x);
		
		int a=50;
			a=	  --a + a++ + a--  + a++;
		//	a=50  a=49	a=49  a=50   a=49 a=50
		System.out.println(a);
	}
}
