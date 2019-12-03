package day59_exceptions;

import java.util.NoSuchElementException;
public class multiCatch_blocks {
    
    public static void main(String[] args) {
        /*
        try {
            System.out.println(9/0);
        }catch (RuntimeException e) {
            System.out.println("Arithmetic exception");
        } catch(ArithmeticException e) {
            
        }
        Multi-catch block CONDITION: parent exception type needs to be after it's sub exception type
        */
        
        
        /*
        try {
            
        } catch (ArithmeticException e) {
            // TODO: handle exception
        } catch (ArithmeticException e) {
            // TODO: handle exception
        }
        
        Conflicted
        */
        
        
        int[] arr = {1,2,3};
        
    try {   
        System.out.println( arr[100] );
        
    }catch (NullPointerException e) {
        System.out.println("Null pointer exception");
        
    } catch(ClassCastException e) {
        System.out.println("Class Cast Exception");
        
    } catch (NoSuchElementException e) {
        System.out.println("No such Element Exception");
        
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Array Index Out Of Bound");
        
    } catch (IndexOutOfBoundsException e) {
        System.out.println("Index Out of Bound Exception");
        
    }
        
        
    System.out.println("=================================");
        
    try {
        System.out.println( 11/0);
        
    }catch(ClassCastException e) {
        System.out.println("Class cast");
        
    } catch(ArithmeticException e) {
        System.out.println("Arithmetic");
        
    } catch(RuntimeException e) {
        System.out.println("Runtime");
        
    }catch(Exception e) {
        System.out.println("Exception");
        
    }
    
    System.out.println("Hello");
    try {
        System.out.println(10/0);
    }catch(Exception e) {
        // code here
        System.out.println(" unexpected event occured at line 78");
    }
    
    System.out.println("World");
    System.out.println("Test completed");
    
    
        
        
        
    }
    
    
}
