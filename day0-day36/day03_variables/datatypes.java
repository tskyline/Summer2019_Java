package day03_variables;

public class datatypes 
{
	/*
	 * 	byte	: We can only assign integer with no decimal  	-128			<=byte	<=127
	 *	short	: Same as byte except the range is				-32768			<=short	<=32767
	 *	int		: Same story ...								-2,147,483,648 	<=int	<=2,147,483,647
	 *	long	: very larger than int
	 *	
	 */	
	
	public static void main(String[] args) 
	{
		byte length =3;
		byte width 	=4;
		System.out.println(length+","+width);
		
		long 	longnumber	= 10l;//"L,l" just indicates it's a long data.Doesn't affect the value.
		int 	intnumber	= 10;
		System.out.println(longnumber+intnumber);
		
		byte b=10;				//you can assign smaller datatype to larger datatypes.
		short s=b;
		int i=s;
		long l=i;			
		System.out.println(l);
		
		float f=1.1f;  			//you need to put'f'or 'F' to be able to put a decimal value to float
		double d=f;
		double d2=1.1;
		System.out.println(d+"\n"+d2+"\n"+f);	//difference between float and double and float assigned to double
		
	}

}
