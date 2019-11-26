package day07_unerayShorthand;

public class quiz
{
	public static void main(String[] args)
	{
		//q1
		int a=30;
		int b=(byte) a;
		System.out.println(b);
		
		//q2
		//System.out.println(a+1);		//error
		//int a=100;
		
		//q3
		System.out.print("Result A"+0+1);
		System.out.println("; Result B"+(1)+(2));
		
		//q5
		float a1=100.98765432F;
		short s=(short)a1;
		System.out.println(s);
		
		//q6
		//byte a2=200; comp error
		int a2=200;
		int b2=2;
		System.out.println(a2+b2-a2*b2+a2/b2);
		//	200+2-400+100
		//	-98
		
		//q7
		System.out.println((2+3)*2/3%2);	//1
		
		//q9
		long l=3_000L;
		double d=(float)l;	//narrowing
		int i=(int)d;
		System.out.println(i);
		
		//q10
		double d1=10/3d; //without d the result will be whole number  	3.0
		System.out.println(d1);					//						3.333333
		
		System.out.println(10.0/3);  //also decimal 					3.333333
		
		
		//q12
		String str="10.5";	//string of text
		System.out.println(str);
		//int n=str;
		//int n=(int)str;	won't work because string is not primitive
		
		//q13
		int I=10,J=20,K=30;
		I=I%5;	//0
		J=J%5;	//0
		K=I*J;
		System.out.println(K+"\t"+I+"\t"+J);
		
		
		
		
	}
}
