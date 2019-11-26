package day24_review;

public class arrayClass
{
	public static void main(String[] args)
	{
		/*
		  	Array Declerations:
		  		DataType[] VariableName={Value1, Value2,...};
		  		
		 
		 */
		int[] arr= {1,2,3};
		int[] ar= {4,5,6};
		int[] a=new int[ar.length+arr.length];
		
		for (int i = 0; i < arr.length; i++)
		{
			a[i]=arr[i];
			
		}
		for (int i = 0;i<ar.length; i++)
		{
			
			a[i+ar.length]=ar[i];
		}
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]);
		}
	}
}
