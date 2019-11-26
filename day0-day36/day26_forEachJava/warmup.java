package day26_forEachJava;
import java.util.Arrays;
public class warmup
{
	

	
		/*
		1. write a program that can check if two Strings are build out of same letters
			Ex: 
				if str1 = "aabbbc";  str2 ="cab";
				output: true
		
				if str1 ="abcd";  str2 ="abc";
				output: false
		 
		 */
		
		public static void main(String[] args) {
			String a ="aabbbc",  b ="cabbccaabbbaa" ;
			//	a = "abc"        b ="cab"
			
			String a1 = "" ;   // store all the non duplicated values from a
			
		for(int j= 0; j < a.length(); j++) {	
			for(int i = 0;  i < a.length() ; i++ ) {
				if(!a1.contains( a.substring(j, j+1)  )  ) {
					a1 += a.substring(j, j+1) ;
				}
			}
		}
			
			System.out.println(a1);
			
			
			//  b = "cabbccaabbbaa";
			
			String b1 = ""; // "cab"
			

			for(int i=0; i < b.length(); i++ ) {
				
				if(! b1.contains( ""+b.charAt(i) )) {
					//				b.substring(i,i+1)
					//						  4, 5
					b1 += ""+b.charAt(i);
					//    b.substring(i,i+1);
				}
				
			}
			
			System.out.println(b1);
			
			
			// a1 ="abc",   b1 ="cab"
			
				 char[] ch1 = a1.toCharArray();
				 System.out.println(  Arrays.toString(ch1) );
				 
				 char[] ch2 =b1.toCharArray();		
				 System.out.println(  Arrays.toString(ch2) );
				 
				 Arrays.sort(ch1);
				 Arrays.sort(ch2);
				 
				 System.out.println("=======================");
				 System.out.println(  Arrays.toString(ch1) );
				 System.out.println(  Arrays.toString(ch2) );
				 
				 String str1 = Arrays.toString(ch1);
				 String str2 = Arrays.toString(ch2);
				 
				 if(str1.equals(str2)) {
					 System.out.println("True, they are build out of same letetrs");
				 } else {
					 System.out.println("False, different letters");
				 }
			
				 
				 
			
		}
		

	

}
