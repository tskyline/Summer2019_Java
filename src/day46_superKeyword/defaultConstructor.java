package day46_superKeyword;

class B
{
    
    public B()
    {
        System.out.println("super");
    }
    public B(int a) 
    {
    	System.out.println("super int");
    }
    
}
public class defaultConstructor extends B
{
    //              sub                 super
     
    public defaultConstructor()
    {
                // super
        System.out.println("Sub"); // sub
        
    }
    public defaultConstructor(int a)
    {
    	super(a);
    	System.out.println("sub");
    }
    public static void main(String[] args) 
    {
      defaultConstructor obj = new defaultConstructor();
        defaultConstructor obj1=new defaultConstructor(10);
        
        
    }
    
	
/*
 All the rules of of the constructor:
      Constructor: special method. belongs to the object.    
                 1. Every class MUST have constructor. 
                    (if there isn't any, compiler will give no-arg constructor by default)
                 
                 2. Constructor method cannot have return-types or specifiers
                            return-types: primitives, wrapper class, objects,...
                            specifiers: final, static, abstract
                            
                 3. Constructor' name MUST be same with the ClassName
                 
                 4. constructor' execution depends on the creation of the object
                 
                 5. constructor can only be called in other constructor. 
                                ( methods or blocks cannot call constructor)
                 
                 6. constructor cannot be called by constructor-name, MUST be called with this or super keyword
                                this(): calls the class' constructor
                                super(): calls the super class' constructor
                                
                 7. constructor cannot call or contain itself
                 
                 8. constructor cannot call more than one constructor
                 
                 9. constructor call MUST be the first step
                 
                 10. class' object MUST be created with existing and visible constructor(s)
                 11. super class' default constructor (no-arg) is called in sub class' constructor(any constructor) by default 
                 12. at least one of the super class' constructors MUST be called in sub class

 */
}


