package day33_arrayList;

import java.util.ArrayList;

public class arrayListMethodPractice
{
	public static void main(String[] args)
	{
		ArrayList<String> Javenger=new ArrayList<>();
		Javenger.add("Jena");
		Javenger.add("Mary");
		Javenger.add("Tarah");
		Javenger.add("Mahriban");
		
		Javenger.set(1, "seyfoo");
		Javenger.remove(0);
		Javenger.add(0,"Pilot Nijat Borhan");
		System.out.println(Javenger);
		
		
		//remove(int): 		removes the index
		//remove(object): 	removes the first matching object and returns boolean value
		ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1); //0
        numbers.add(2); //1
        numbers.add(3); //2
        numbers.add(4); //3
        numbers.add(5); //4
        
        numbers.remove( 3 );  // removes index 3 ==>[1, 2, 3, 5]
    System.out.println(numbers);
    
//  numbers.remove( Integer.parseInt( "3" ) );  // parse method returns primitives  
boolean result = numbers.remove(  Integer.valueOf("3") ); // value of method returns wrapper class
    
System.out.println(numbers);
System.out.println(result);
		
		
		
	}
}
