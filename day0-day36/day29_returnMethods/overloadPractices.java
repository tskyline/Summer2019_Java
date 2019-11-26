package day29_returnMethods;

public class overloadPractices
{
	public static void main(String[] args)		//All methods can be overloaded
	{
		System.out.println("String Array");
		int[]array= {1,2,3};
		main(array);
	}
	public static void main(int[]args)
	{
		System.out.println("Int Array");
	}
	
	//Why do we need overload method
	/*
	 	1.improves the reusability
	 	2.improves the readability
	 	3.easier to remember
	 	4. overload methods is very flexible
	 	
	 */
	
}
