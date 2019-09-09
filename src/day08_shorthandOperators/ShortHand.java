package day08_shorthandOperators;

public class ShortHand
{
	public static void main(String[] args)
	{
		int A=100;
		A*=200;	//A=A*200
		System.out.println(A);
		
		/*
		 	+= 	: x+=y 	==> x=x+y
		 	-=	: x-=y	==> x=x-y
		 	*=	: x*=y	==> x=x*y	
		 	/=	: x/=y	==> x=x/y
		  	%=	: x%=y	==> x=x%y
		  
		 */
		
		//int z=10%3; 	//remainder 1
		int e=10;
		e%=2;	//E=10%2
		System.out.println(e); 	//0
		
		int j=300;
		int k=10;
		j+=j%=k;
		System.out.println(j);//300
		
		
	}
}
