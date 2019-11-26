package day04_variables2;

public class primitiveDataTypes2 
{
	public static void main(String[] args) 
	{
		/*	
		 	Primitives	: byte,short,int,long,float,double
		 	Primitives2	: boolean,char 
		 */
		boolean q=true;
		boolean a=false;
		boolean interesting=9<3;
		System.out.println(q+" "+a+" "+interesting);
		char c=65;  //ascii code
		char C='A';
		System.out.println(c+" "+C);
		
		char z='z';
		int i=z;					//you can initialize char to all other numerical primitive data types.
		int j='z';
		System.out.println(i+","+j);
		
		//byte b=j;  the reason it won't compile is char is 2byte and char is 1byte.
		byte b='z';
		System.out.println(b);
		
		//short won't compile as well due to range differences. Eventhough both are 2bytes
		// Char's range is 0-65535 while short -32768 to 32767.
		
	}
}
