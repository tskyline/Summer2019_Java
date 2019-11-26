package day33_arrayList;

import java.util.ArrayList;

public class arrayList
{
	public static void main(String[] args)
	{
		ArrayList<String> arr=new ArrayList<>();
		arr.add("Tuna");
		System.out.println(arr);
		arr.get(0);
		arr.add(0,"Cemre");
		
		System.out.println(arr.size());
		System.out.println(arr);
		
		//set method	replaces the object at the given index
		arr.set(0, "TK");
		System.out.println(arr);
		
		
		//contains(object) checks if the given object is contained in the ArrayList or not, returns boolean value
		System.out.println(arr.contains("TK"));
		
		
		
		//equal(ArrayList): checks if the two arraylist have same objects or not, returns boolean
		
		//remove(int): removes the given index, adjusts the size and returns a boolean value
		arr.remove(1);
		System.out.println(arr);
		
		arr.clear();
		
		
		ArrayList<Integer>a=new ArrayList<>();
					a.add(1);	//auto boxing index 0... add only accepts object
					a.add(2);	//auto boxing index 1
					a.add(3);	//auto boxing index 2
					a.add(4);	//auto boxing index 3
					a.add(5);	//auto boxing index 4
					
					a.remove(4);//removes the first matching object
					
				System.out.println(a);
				
				a.remove(Integer.parseInt("2")); //parse returns primitive
				System.out.println(a);
				
				a.remove(Integer.valueOf("3"));	//valueof returns wrapper class
				System.out.println(a);
				int aa=6;
				a.remove(aa);
				/*
				Integer i=1;
				boolean r=a.remove(i);
				System.out.println(a);
				System.out.println(r);
				*/
				
					
		
		
		
	}
}
