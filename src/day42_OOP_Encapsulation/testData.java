package day42_OOP_Encapsulation;

/*
 	Topic: OOP Encapsulation
            1. private access modifier
            2. getter & setter
            3. multi-class
package: day42_OOP_Encapsulation
OOP: Object Oriented Programming
class:
        data/attribute ==> instance variables
 
        Actions     ==>  instance method
instance variable: belongs to the object. each object has its own copy of instance variable
Encapsulation: to hide the instance variable (hiding the data)
            1. hiding the data by giving private access modifier
            2. grants other classes get access to the private data using public getter and setter
    getter (Read only): an instance method that returns the private data, does not pass any parameter
                the return of the method MUST match with the data-type of the instance variable
                access modifier needs to be public 
    Setter(Modify): an instance method, passes a parameter. return-type is void
                the parameter's data-type MUST match with instance variable'
                the Argument MUST be assigned to the instance variable
                if the parameter has the same name with instance variable, we need to use this. keyword to call the instance variable
private: if the feature is private, the feature is only visible within the class
        codes outside the class cannot access to the data
        not accessible to any other class  -- Khurshad
this. : used for calling the instance variables in an object isntance
        we only use it when the local variable has the same name with the instance variable

 */
public class testData
{
	private String Name="Tuna";	//data is not visible to any other classes
	private int ID=100;
	
	
	public int getID() 			//getter
	{	
		return ID;
	}
	
	public String getName()		//getter
	{
		return Name;
	}
	
	
	
	public void setName(String Name)	//setter
	{
		this.Name=Name;//this. calls the instance variable
	}
	
	public void setID(int ID)
	{
		this.ID=ID;
	}
	/*
	 	shortcuts for setter and getter
	 	1.declare private datas
	 	2. right click -->source-->generate getters and setters
	 	3. select the instance variables you wanna generate getters and setters with
	 	4. click generate button
	 */
	
}
