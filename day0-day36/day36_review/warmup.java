package day36_review;

import java.util.ArrayList;
import java.util.Arrays;

public class warmup
{
	/*
	  
    2. write a return method that can remove the duplicated objects from a String arraylist
    3. write a return method that can remove the duplicated objects from a Character arraylist
    4. write a return method that can remove the duplicated objects from a Double arraylist


	 */
	//1. write a return method that can remove the duplicated objects from an Integer arraylist
	public static ArrayList<Integer> RemoveDup(ArrayList<Integer> list)
	{
		ArrayList<Integer> result=new ArrayList<>();
		/*
		for (Integer each : result)
		{
			if (!result.contains(each))
			{
				result.add(each);
			}
		}
		Alternative
		 */
		
		for (int i = 0; i < list.size(); i++)
		{
			if (!result.contains(list.get(i)))
				result.add(list.get(i));
				
		}
		
		return result;
	}
	public static void main(String[] args)
	{
		ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,1,2,3,4,4,5,6));
		
		System.out.println(RemoveDup(list));
	}
}
