package day36_review;

import java.util.Arrays;

public class repl
{
	public static void printUniqueWords(String[] words){
	    //WRITE YOUR CODE HERE
	    for(int i=0;i<words.length;i++)
		    {
		    	int count=0;
		    for (int j = 0; j < words.length; j++)
			{
				if(words[i].equals(words[j]))
					count++;
					
			}
		    if(count==1)
		    	System.out.println(words[i]);
		    }
		    
	}
	public static void main(String[] args)
	{
		int[] r={1,5,77,8};
		int n=2;
		
		int[] new_r=new int[r.length+1];
		new_r[r.length]=n;
		
		int aaa=0;
		for(int each:r)
		{
			
		  new_r[aaa]=each;
		  aaa++;
		}
		
		System.out.println(Arrays.toString(new_r));
		
		
		String words[]= {"aed","aed","afr","ttn"};
		printUniqueWords(words);
		
		Arrays.toString(words);
		
		
		//========================================
		double units=50;
		 double bill = 0.0;
		    
		    //your code here
		    if(units<=50)
		    bill=.60;
		    else if(units>50&&units<=100)
		    bill=(bill*.90);
		    else if(units>100)
		    bill=(bill*.90)+50;
		    else
		    bill=(bill*.90)+100;
		    
		    System.out.println(bill);
		/*/========================================
		String one="javad";
		String two="java";
		
		String r="";
		int k=0;
	    if(one.length()<=two.length())
	    {
	    	for(int i=0;i<one.length();i++)
	    	 r+=""+one.charAt(i)+two.charAt(i);
	    r+=two.substring(one.length());
	    	
	    }else if(one.length()>two.length())
	    {
	    	for(int i=0;i<two.length();i++)
		    	 r+=""+one.charAt(i)+two.charAt(i);
		    r+=one.substring(two.length());
	    }/*else
	    {
	    	k=one.length();
		    for(int i=0;i<k;i++)
		      r+=""+one.charAt(i)+two.charAt(i);
	    }*/
	    	
	    
	    
	   
	     
	    
	   
	    //System.out.println(r);
		//===============================
		String str="aaaabbbbcc";
		String nodup="";
	    for(int i=0;i<str.length()-1;i++)
	    {
	      if(!nodup.contains(""+str.charAt(i)))
	      nodup+=str.charAt(i);
	    }
		/*============
		String words="tuna han kirt";
		int cs=1;
	      for(int i=0;i<words.length();i++)
	      {
	        if(words.charAt(i)==' ')
	        cs++;
	      }
	      */
		//System.out.println(cs);
		//========================
		String check="civic";
		 String bc="";
		    
	      for(int j=check.length()-1;j>=0;j--)
	      {
	      bc+=check.substring(j,j+1);
	      }
	      System.out.println(bc);
	     if( bc.equalsIgnoreCase(check))
	     {
	    	 System.out.println(true);
	     }
	     
	     //=========================
	     int a[]= {1,2,3};
	     int b[]= {4,5,6};
	     int c[]=new int[a.length+b.length];
	     int z=0;
	     for(int each:a)
	     {
	    	    c[z]=each;
	    	    
	     z++;
	     }
	     for(int each:b)
	     {
	    	    c[z]=each;
	    	    
	     z++;
	     }
	     
	     System.out.println(Arrays.toString(c));
	}
}
