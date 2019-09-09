package day08_shorthandOperators;

public class logicalOperators
{
	public static void main(String[] args)
	{
		/*
		 * 		&&	: And logic		true  && true  ==> true
		 * 							true  && false ==> false
		 * 							false && true  ==> false
		 * 							false && false ==> false
		 * 
		 * 		||	: Or  logic		true  || true  ==> true
		 * 							true  || false ==> true
		 * 							false || true  ==> true
		 * 							false || false ==> false
		 * 		
		 */
		
		boolean d= true && true || false;
		System.out.println(d);
		boolean e= !(7>5 && 6!=5) && (9>5 || 10>4);
		System.out.println(e);
		int a=100;
		double b=a+=100/20;
		System.out.println(a);
		boolean A=128>'9'||128==127;
		System.out.println(A);
		
		
		
		
	}
}
