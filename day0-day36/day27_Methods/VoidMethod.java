package day27_Methods;

public class VoidMethod
{
	   public			 static 		void 		myFirstMethod()
//  access-modifier 	specifier	return type			name(){}
//  (  		will learn later 	)	void doesn't return any value
	{
		System.out.println("Hello World");
		System.out.println("Hello Boston");
		System.out.println("Hello Tun");
	}
	   public static void fibo()
	   {

		   int n1=0,n2=1,n3,i,count=10;
			System.out.print(n1+" "+n2);
		   for (i = 2; i < count; i++)
		{
			   n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			
		}
		   
	   }
	  
	   
	   public static void main(String[] args)
	{
		myFirstMethod();
		fibo();
	}
	   
}
