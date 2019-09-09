package day06_arithmaticOperators;

public class primitivesCasting 
{
	public static void main(String[] args) 
	{
		//casting:converting larger primitive to smaller size.
		//	datatype variablename = (datatype) value
		
		/*	castings : Explicit & implicit
		 	primitives: byte, short, int, long, float, double
		 	
		 */
		
		int a=10;
		byte b=(byte) a;
		System.out.println(b);
		
		int i=128;
		byte c=(byte) i;
		System.out.println(c);
		
		double d=10.5;
		float f= (int) d;
		System.out.println(f);
		
		long l=300L;
		int j=(short)l; 	//no byte due to range
		System.out.println(j);
		
		//implicit casting
		byte bs=100;
		int is=bs;
		
		short sh=100;
		long ls=sh;
		
		//implicit casting is done automatically by Java
		
		double db=100.8765;
		byte bd=(byte)db;
		System.out.println(bd);		//100	
		
		int num1=100, num2=200, num3=300;
		
		//LOCAL VARIABLES MUST BE DEFINED BEFORE USE//
		
		//boolean r;
		//System.out.println(r);
		
		
		
		
		
		
	}
}
