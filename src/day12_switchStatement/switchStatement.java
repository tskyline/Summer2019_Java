package day12_switchStatement;

public class switchStatement //functions as else-if statement
{
	public static void main(String[] args)
	{
		short score=1;
		switch(score)
		{
			case 1	:System.out.println("Score is 1");
				
			case 2	:System.out.println("Score is 2");
				
			default	:System.out.println("Score can not be calculated");
			//you can change the location of the cases. It wouldn't matter.
		
			
		}
		 String str ="Java";
	        
	        switch (str) {
	            
	            case "C#":
	                System.out.println("C# programming Language");
	                break;  
	            // System.out.println("C# programming Language"); 
	                    // case was closed at line 76
	                
	            case "Python":
	                System.out.println("Python programming language");
	            
	            default:  // else
	                System.out.println("Invalid");
	        }
	    
	    
	    
	    char grade = 'A';
	    
	    switch(grade) {
	                
	        case 'B': 
	                System.out.println("Passed with B");
	                
	        case 'C':
	                System.out.println("Passed with A");
	                
	        default:
	            System.out.println("Failed");
	            
	    }  // switch statement only exits when there is break statement or }
	    
	    
	    
	    
	}
	
	
}
