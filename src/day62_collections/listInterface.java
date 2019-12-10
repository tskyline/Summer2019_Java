package day62_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class listInterface
{
	public static void main(String[] args)
	{
		//List<Integer> list1=new List<>(); can not create from object (interface)
		
		List<Integer> list2 = new ArrayList<> ();
		List<String> list3=new LinkedList<String>();
		List<Double> list4=new Vector<>();
		
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.remove(1);
		System.out.println(arrayList);
		
		LinkedList<Integer> linkedList=new LinkedList<>();
			linkedList.add(10);
			linkedList.add(20);
			linkedList.add(30);
			linkedList.remove(1);
			System.out.println(linkedList);
			System.out.println("=================================");
			
		String []arr= {"A","B","B"};
		List<String> list=new ArrayList<>(Arrays.asList(arr));
		LinkedList<String> listt=new LinkedList<>(Arrays.asList(arr));
		System.out.println(list);
		System.out.println(listt);
			
		 Vector<Integer> vt = new Vector<Integer>();
         vt.add(1);
 
 
         
System.out.println("============================");   
 Stack<Integer> st =new Stack<Integer>();
     st.add(1);
     st.add(2);
     st.add(3);
     st.add(4);
     System.out.println(st);
     
     System.out.println( st.pop() );  // LIFO
 
     System.out.println(st); 
     
     System.out.println( st.pop() ); 
     System.out.println(st);
 
}


// arraylist:
public void add1(int a) {
 
}

// vector
public synchronized void add2() {
 
}
	
		
	
}
