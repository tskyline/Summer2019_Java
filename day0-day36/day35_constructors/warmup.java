package day35_constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class warmup
{
	
	 	//1. write a return method that accepts an int array and returns it as an ArrayList
	public static ArrayList<Integer> ar(int[] a)
	{
		Integer aa[]=new Integer[a.length];
		for (int i = 0; i < a.length; i++)
		{
			aa[i]=(Integer.valueOf(a[i]));
		}
		ArrayList<Integer> ar=new ArrayList<>(Arrays.asList(aa));
		return ar;
		
		/*
		 * Alternate solution
		  int[] arr = {1,2,3,4,5};
        
            ArrayList<Integer> list    =  ArrayToArrayList(arr);
            
            System.out.println(list);
            
            System.out.println( ArrayToArrayList(arr) );
            
            
            double[] arr2 = {1.5, 2.5, 3.5};
            ArrayList<Double> list2 = ArrayToArrayList(arr2 );
            
            System.out.println(list2);
            
		 */
		
	}
	// 2. write a return method that accepts an Integer array and returns the maximum number
    //DO NOT USE SORT METHOD
	public static int Maxnum(ArrayList<Integer> list)

	{
			int max= Integer.MIN_VALUE;
			
			for(int each:list)//unboxing
			{
				if(each>max)
					max=each;
			}
			return max;
	}
	//3. write a return method that accepts an Integer arrayList and returns the second maximum number
    //DO NOT USE SORT METHOD
	public static int SecondMax(ArrayList<Integer> list)
	{
		Integer max=Maxnum(list);// max is now an object not a primitive
		list.removeAll(Arrays.asList(max));//if max was an int, function would try to remove index(max) which is not the one we want to remove
		int secondMax=Maxnum(list);
		
		return secondMax;
	}
	//4. write a return method that accepts an Integer array and returns the minimum number
    //DO NOT USE SORT METHOD
	public static int Minnum(ArrayList<Integer> list)
	{
		int min= Integer.MAX_VALUE;
		
		for(int each:list)//unboxing
		{
			if(each<min)
				min=each;
		}
		return min;
	}
    // 5. write a return method that accepts an Integer arrayList and returns the second minimum number
    //   DO NOT USE SORT METHOD
	public static int SecondMin(ArrayList<Integer> list)
	{
		Integer min=Minnum(list);
		list.removeAll(Arrays.asList(min));
		int secondMin=Minnum(list);
		return secondMin;
	}
	
	public static void main(String[] args)
	{
		//task1
		int a[]= {1,2,3};
		System.out.println(ar(a));
		//task2
		ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,1,2,3,4,5,6,6));
		System.out.println(Maxnum(list));
		//task3
		System.out.println(SecondMax(list));
		//task4
		System.out.println(Minnum(list));
		//task5
		System.out.println(SecondMin(list));
		
		 
		
	}
}
