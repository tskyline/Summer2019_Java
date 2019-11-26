package day41_initializerBlocks;

import java.util.ArrayList;
import java.util.Arrays;

public class staticBlockPractice
{
	  public static String name;  // "suna" , "Erhan", "mehmet"
	    public static int[] arr1;
	    public static ArrayList<String> list = new ArrayList<>();
	    public static ArrayList<String> students=new ArrayList<>();
	    public static String[] online= {"Arzugul","Tuna","Me","Spike"};
	    public static String[] inclass= {"Daryna","Nadire","Olga","Mizgin"};
	    static double a=100;
	    
	    static {
	        name = "Erhan";
	        arr1 = new int[3];  //{0, 0, 0};
	        arr1[1] = 2;   // {0, 2, 0}
	        
	        list.add("Break");
	        a=300;
	       
	        students.addAll(Arrays.asList(online));
	    }
	    
	    
	    static {
	        name = "Suna";
	        arr1 = new int[5];  //{0, 0, 0, 0, 0};
	        arr1[0] =1;   // { 1, 0, 0,0,0}
	        arr1[2] =3;  //  { 1, 0, 3,0,0}
	        
	        list.add("Coffee");
	        list.add("Tea");
	       
	        students.addAll(Arrays.asList(inclass));
	        
	        a=400;
	    }
	    
	    
	    
	    public static void main(String[] args) {
	        staticBlockPractice obj1 = new staticBlockPractice();
	        
	        System.out.println(name);  // null
	        
	        System.out.println( Arrays.toString( arr1 ) ); 
	        
	        System.out.println(list);
	        
	        System.out.println(students);
	        
	        System.out.println(a);
	    }
	    
	    
	    
	    
	    public staticBlockPractice(){
	        name = "Mehmet";
	    }
}
