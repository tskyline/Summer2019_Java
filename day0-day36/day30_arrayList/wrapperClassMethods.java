		package day30_arrayList;

public class wrapperClassMethods
{
	public static void main(String[] args)
	{
		//max_value: returns maximum value of the primitive
		int maximum=Integer.MAX_VALUE;
		System.out.println(maximum);
		
		//min_value:	...
		byte min=Byte.MIN_VALUE;
		System.out.println(min);
		
		
		//parse methods: converts String value to primitives
		String str="123";
		Integer num=Integer.parseInt(str);	//Auto-Boxing
		System.out.println(num+1);
		
		int num2=Integer.parseInt("125");	//none
		System.out.println(num2+1);
		
		int num3=Byte.parseByte("19");		//none
		System.out.println(num3);
		
		Short num4=Short.parseShort("12");	//Auto-boxing
		System.out.println(num4+1);
		
		Boolean A=Boolean.parseBoolean("Cybertek");	//ignores case sensitivity, 
		System.out.println(A);	//prints out true only if the value is true ow false
		
		
		//valueof methods: converts value to wrapper class values
		
		int z=Integer.valueOf("1234");	//Unboxing
		Integer z1=Integer.valueOf("1234");	//none
		
		Integer z2=(int)Integer.valueOf("1234");//Auto-Boxing
		
		boolean result=Boolean.valueOf(10>9);//unboxing
		System.out.println(result);
		
	}
	
	
}
