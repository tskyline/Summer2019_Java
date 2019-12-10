package day62_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class setInterface
{
	public static void main(String[] args)
	{
		Set<Integer> st1=new HashSet<>();
					st1.add(100);
					st1.add(100);
					st1.add(100);
					System.out.println(st1);
	
	// set does not have index number
    
    System.out.println("======================");
Set<Integer> hashset = new HashSet<Integer>();
        hashset.add(100);
        hashset.add(10);
        hashset.add(5);
        hashset.add(4);
        hashset.add(3);
        hashset.add(1);
        hashset.add(100);
    
        System.out.println(hashset);  // HashSet does not keep the objects order as it is
        
Set<Integer> linkedhashset = new LinkedHashSet<>();
        linkedhashset.add(100);
        linkedhashset.add(10);
        linkedhashset.add(5);
        linkedhashset.add(4);
        System.out.println(linkedhashset);  // LinkedHashSet keeps the order as it is 
    // doubly-linked: add() & remove() are faster than HashSet
    
        SortedSet<String> treeset = new TreeSet<>();
        treeset.add("Z");
        treeset.add("Y");
        treeset.add("X");
        treeset.add("W");

        System.out.println( treeset );
        
//Task: remove duplicates from an ArrayList, and sorted
    List<Integer> list = new ArrayList<>();
            list.addAll(Arrays.asList(10,9,8,7,6,10,10,10,10));
            Collections.sort(list);  // how to sort List
            
            
            System.out.println(list);

//solution:             
List<Integer> list2 = new ArrayList<>();
    list2.addAll(Arrays.asList(10,9,8,7,6,10, 10, 10, 10));
    
TreeSet<Integer> ts = new TreeSet<>(list2  );   
System.out.println(ts);
            
            
/*
String str="AAAABBBCCCDDD"; 
write program that can remove duplicates from String

*/
String str = "ZZZZYYYXXAAAABBBCCCDDD";  // ZYXABCD
String[] arr =  str.split("");
System.out.println( Arrays.toString(arr) );

// TreeSet<String> restroom = new TreeSet<>( Arrays.asList(arr) );

LinkedHashSet<String> restroom = new LinkedHashSet<>( Arrays.asList(arr) );
String result = restroom.toString().replace("[", "").replace("]", "").replace(", ", "");

System.out.println(result); 
            
// second soluition
String str2 =   new LinkedHashSet<String>(Arrays.asList(arr)).toString();
System.out.println(str2);



}

    
    
    
    


	
}
