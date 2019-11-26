package day05_recap;

public class concatenation 
{
	public static void main(String[] args) 
	{
		/*	Main Method Types
		 1. public static void main(String[] args) 
		 2. static public void main(String[] args) 
		 3. public static void main(String... args) 
		 
		 concatenation = combining, linking things together by using '+'.
		 
		 */
			String myName="Tuna "+"Skyline";
			System.out.println(myName);
			
			String year="This is "+2019;
			System.out.println(year);
			
			System.out.println("1"+2+3);  //123
			//System.out.println("1"+1-3);  //
			
			System.out.println("3"+'3');  //char+string ==> char will use character/not the ascii code
			System.out.println("3"+3);
			System.out.println(3+'3');
	}
}
