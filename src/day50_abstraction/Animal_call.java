package day50_abstraction;

public class Animal_call
{
	public static void main(String[] args)
	{
		dog doge=new dog("male",(byte) 3,"black","skertar");
		doge.drink();
		doge.getInfo();
		doge.speak("havhav");
        /*
        assignment
        
        abstract class: Countries
                   Data: name, flag, language, population, religion, rivals, capital city
                   
                   constructor that can set all those data
                   
               Actions (abstract):  exports(parameter),  import(prameter),
                                       economy(), currency()..
                                       
                                       
           sub class: 
                   South Korea
                   USA
                   Kazakhistan
                   New Zealand
                   Mother Russia
                   Turkey
                   ....
                                   
        abstract method, inheritance, abstract class, method overriding ..         
                
                
                   
                   
                   
           
           
        */
		
	}
}
