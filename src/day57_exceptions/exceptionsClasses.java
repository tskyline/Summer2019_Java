package day57_exceptions;

import java.util.ArrayList;
import java.util.Arrays;

public class exceptionsClasses
{

	/*
    try{
            exception statements/code
        } catch(ExceptionClass name){
            statements
        }
*/

public static void main(String[] args) {

int[] number = {100,200,300};

try {
    
    System.out.println( number[5] );
    System.out.println("Trye block, Checked exception");
    
} catch(ArrayIndexOutOfBoundsException e) {
    
    System.out.println("catch block, unchecked exception");
    
}


System.out.println("===================================================");


try {
    
    Thread.sleep(3000);
    System.out.println("Trye block, Checked exception");
    
}catch(InterruptedException e) {
    System.out.println("catch block, unchecked exception");
}



System.out.println("Work Done");



ArrayList<Integer> list =new ArrayList<Integer>();
    list.addAll(Arrays.asList(1,2,3));
    
    try {
        
    System.out.println(list.get(10 ));
    System.out.println("checked Exception occured in arraylist");
    
    } catch(RuntimeException e) {  
        System.out.println("unchecked Exception occured in arraylist");
    }  
    
    // parent exception class can handle child class' exceptions

    
    
/*  
    try {
    Thread.sleep(100);
    
    } catch(RuntimeException e) {
        
    }

*/

    try {
        
    Thread.sleep(2000);
    
    } catch(Exception e) {
        
    }
    
    
    int[] nums = {1,2,3};
    
    int a;
    
    try {
        a= 100;
        System.out.println(nums[10]);
        
    }catch (Exception e) {
        System.out.println("Checked exception");
    }
    
    
    
    
    
    
    
    
    
    
    System.out.println("Done");

}

public static void method(String kfc) {

}






    
    
}

