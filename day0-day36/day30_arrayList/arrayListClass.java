package day30_arrayList;

import java.util.ArrayList;

public class arrayListClass
{
	public static void main(String[] args)
	{
		/*
		 		1.presented it "java.util" package
		 		2.doesn't support primitives
		 		3.similar to Array, objects are stored in ArrayList
		 		4.size is dynamic, adjusted automatically
		 		5.arraylist is ordered(index numbers)
		 */
		//Declaration of ArrayList
		//1.way ArrayList<ClassType> variableName=new ArrayList<> ();
		//2.way ArrayList<ClassType> variableName=new ArrayList<ClassType> ();
		ArrayList<Integer> i=new ArrayList<>();
		
		//methods of arraylist
		
		i.add(10);	//add
		i.add(20);	//auto-boxing
		i.add(30);
		System.out.println(i.get(2));	//get(index) method
		
		System.out.println(i.size()); 	//size() :to get the size of arraylist
		
		i.clear();						//clear() :removes all the values from the arraylist
		System.out.println(i.size());
		
		/*
		 		ArrayList vs Array
		 	1.Array's size fixed, ArrayList' size is dynamic
		 	2.Array supports primitive and non-primitives,
		 	Arraylist doesn't support primitives
		 	
		 */
		
		
	}
}
