package day53_interfaceContinue;

public interface Interface_VS_AbstractClass
{
 // Access-modifier  className() {  }
    
    // public Interface_VS_AbstractClass() { }
    // public void mm() {}
    
    static int num = 300;
    
    //static {  }   
// variables in interface are static and final by default, final variables cannot be reAssigned
    
    
    
    public abstract void method1();
    public abstract int method2();
    
     void method3();   // public
     void method4();  // public
     
     public default void mm() {
         // predicate 
     }
     
     
    // protected abstract void method5();
     //public protected abstract void method5();
     
     int a = 10;  // public
     // public final static int a;
     
     
     public static void main(String[] args) {
        System.out.println(a);  // static only accepts static
        
        System.out.println(   Interface_VS_AbstractClass.a  );
        
        
    // Interface_VS_AbstractClass  obj = new Interface_VS_AbstractClass();
        //  interface is not class.  
        //  abstraction is not concrete, but object HAS to be concrete
        
        
        
        
    }
    
    
    
}
class Test implements Interface_VS_AbstractClass {
    @Override
    public void method1() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public int method2() {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public void method3() {
        // TODO Auto-generated method stub  
    }
    @Override
    public void method4() {
        // TODO Auto-generated method stub
        
    }
    /*
     	Interface: used for achieving abstraction
            we can store abstract methods
        Interface is meant to be implemented, cannot be final
        we can implement multiple interfaces to the class by implements keyword
        When we override Interfaces' abstract methods, the access modifier needs to be more visible
            
        we cannot create object from both interface and abstract class, because object needs to be concrete
    Interface Can Have:
            methods: abstract method, static method, default method
                    public abstract void methods();
                    public void method();
                public access modifiers are given by default to all methods
            variables: public static final ==> automatically
    Interface Can Not Have:
            Methods: Constructor, instance methods
            variables: instance variable
            blocks: static initializer block, instance initializer block
Restrictions of abstract method:
                    cannot have body
                    cannot have private access modifiers 
                    cannot have static and final specifiers
                    MUST be created in abstract class or an Interface
Abstract class VS Interface:
            both can have abstract methods, used for achiving abstractiom
            cannot create object from them
            both of them cannot be final
            Abstract class: meant to be extended to the regular class, extends keyword
                    methods: abstract and all non-abstract methods
                    variables: any variables
                    blocks: both instance and static blocks
                sub class can only extend one abstract class
            Interface: meant to be implemnted to the regular class, implemnts keyword
                    methods: we can only have abstract, static, and defult methods
                    variables: public final static  by default
                    blocks: cannot have any blocks
                sub class can implemnet multiple interfaces

     */
    
}
