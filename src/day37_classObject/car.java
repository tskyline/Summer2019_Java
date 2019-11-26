package day37_classObject;
/*
 10/15/2019 Tuesday
Topic:  Class & Object
            1. instance variables
            2. instance methods
            3. custom class
Package: day37_classAndObject
car
    data/attribute
        model, Year, brand, color, price, milage,VIN....
    actions:
        start, driver, accelerate, stop, drift, brake, get ticket..
    car1 --> Audi Q7 2020, white,  100K, 10, 1232112112
        car1.start() ==>  Audi
    car2 --> Tesla ModelS 2025, red, 60K, 20, 231123123
        car2.start()  ==> Tesla
object: instance of the class, created from the class
class: where the objects came from, determines how the object should behave
Dog
    Attributes/data:
            breed, size, age, color, name ...
    actions:
        eat, sleep, bark, play ...
    Dog1 --> German Shepard, XXL, 5, pink, Lassie
        Dog1.eat() ==>   Lassie
    Dog2 --> Tibetan mastiff, small, 3, red, KIKO
        Dog2.eat() ==> KIKO
instance variable: object variables, MUST be declared in the lcass and outside any method
local variable: variables that's created within the method

 */
public class car
{
	/*data/attribute
    model, Year, brand, color, price, milage,VIN....
actions:
    start, driver, accelerate, stop, drift, brake, get ticket..
	*/
	
	String	make;
	String 	model;
	short 	year;
	String	color;
	double	price;
	int		mileage;
	String	vin;
	
	public void drive()
	{
		System.out.println(year+" "+make+" "+model+" is being driven.");
	}
	
	public void specs()
	{
		System.out.println("SPECS of The Vehicle\n"+year+" "+make+" "+model+"\n"+color+"\n"+mileage+"\n"+vin+"\n$"+price);
	}
	public static void main(String[] args)
	{
		//assignment: create custom class for employees
		/*
		 * Attributes:
		 	EmployeeName
		 	EmployeeID
		 	Jobtitle
		 	ssn
		 	gender
		 	salary
		 	
		 	Actions:
		 	 getinfor()
		 	 ajkasnd()
		 	 askdasd()
		 	 
		 */
	}
}
