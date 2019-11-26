package day43_javaRecap;

public class staticKeyword
{
	 public String InsName ="Filiz";
     
	    public static String StaName = "Nurzat";
	    
	    public static void printName() {
	        //System.out.println(InsName);  // static only accepts static
	        System.out.println( StaName ); // static only accepts static
	        
	    }
	    
	    public void printName2() {
	        System.out.println( InsName );
	        System.out.println( StaName  ); // class members are always accepted
	    }
	    
}
