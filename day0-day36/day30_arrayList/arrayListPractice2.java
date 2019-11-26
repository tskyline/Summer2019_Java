package day30_arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class arrayListPractice2
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list=new ArrayList<>();
		for (int i = 0; i < 31; i++)
		{
			if(i%2==0)
			list.add(i);
		}
		System.out.println(list.size());
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++)
		{
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		for(Integer each:list)
			System.out.print(each+" ");
		
		int num=list.get(7);	//unboxing
		list.clear();
		System.out.println();
		//sorting the ArrayList: Collections.sort();   presented in "java.util" package
		ArrayList<Integer> col=new ArrayList<Integer>();
		col.add(10);
		col.add(7);
		col.add(13);
		col.add(1);
		
		Collections.sort(col);
		System.out.println(col);
		
		
	}
}
