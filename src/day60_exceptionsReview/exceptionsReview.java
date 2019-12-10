package day60_exceptionsReview;

import java.io.FileNotFoundException;

public class exceptionsReview
{
	  public static void main(String[] args) throws InterruptedException {
	        
	        // throw new FileNotFoundException();  // checked exception, compilert is not happy with it
	         
	    //   throw new ClassCastException();  // unchcked, compiler is okay with it 
	         
	    
	    try {
	    //  FileInputStream file =new FileInputStream("path of file");  // checked
	        Thread.sleep(3000);
	        System.out.println("try block");
	        // unchecked exception
	        
	        //statements;
	        
	    }catch(InterruptedException e) {
	        System.out.println("catch block");
	    }finally {
	        System.out.println("finally block");
	    }
	    
	    System.out.println("===================================");
	    
	    try {
	    
	        System.out.println(11/0);
	        System.out.println("try block");
	    }catch(ArithmeticException e) {
	    
	        System.out.println("catch block");
	    }finally {
	        System.out.println("finally block");
	    }
	    
	        
	        System.out.println("next test step");
	        
	        
	        System.out.println("===================================");
	        
	        
	        
	        int[] arr = {1,2,3};
	        try {
	            System.out.println(arr[200]);
	            
	        }catch(NullPointerException e) {
	            System.out.println(1);
	            
	        }catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println(2);
	            
	        }catch(IndexOutOfBoundsException e) {
	            System.out.println(3);
	            
	        } catch (Exception e) {
	            System.out.println(4);
	        }
	        
	            
	    //  method();
	    //  method2();
	        
	    //  method4();
	        
	    //      method5();
	    //  method6();
	        
	    //  method7();
	        
	        int breaktime = 0;
	        if(breaktime !=0) {
	            
	            throw new RuntimeException("Time to Go home");
	        //  System.out.println("hello");
	        }
	        
	        System.out.println("Done");
	        
	        
	        throw new NullPointerException();
	        //  System.out.println("hello");
	        
	    }
	    
	    
	    public static void method() throws InterruptedException {
	        
	        Thread.sleep(3000);
	        
	    }
	    
	    public static void method2() {
	        try {
	            Thread.sleep(3000);
	        }catch(Exception e) {
	            
	        }
	    }
	    
	    public static void method3() throws Exception{
	        Thread.sleep(3000);
	        
	        System.out.println("step 2");
	        System.out.println("step 3");
	        
	        Thread.sleep(3000);
	        
	        System.out.println("step 4");
	        System.out.println("step 5");
	        
	        Thread.sleep(3000);
	        
	        try {
	            int a =10;
	            System.out.println(a/0);
	            
	        }catch(Exception e) {
	            // System.out.println(a);
	        }
	        
	    //  System.out.println(a);
	        
	        
	    }
	    
	    public static void method4() throws RuntimeException{
	        System.out.println(9/0);
	    }
	    
	    public static void method5() throws Exception {
	        
	        try {
	            Thread.sleep(1000);
	        } catch( Exception e ) {
	            
	        }
	        
	    }
	    
	    
	    public static void method6() throws InterruptedException, FileNotFoundException{
	        
	    }
	    
	    
	    public static void method7() {
	        throw new RuntimeException();
	    }
	    
	    
}
