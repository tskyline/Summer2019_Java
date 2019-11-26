package day37_classObject;

public class carObject
{
	
	public static void main(String[] args)
	{
		
		   car		 car1		=	new		 car();
	//	classname	objectname	  keyword	constructor
		car1.make="VW";
		car1.model="GTI";
		car1.color="Gun Metal Gray";
		car1.mileage=146653;
		//car1.price=1000000.0; can not price this gem.
		car1.year=2011;
		car1.vin="WVWGV7AJ7BW012548";
		
			car car2=new car();
		car2.make="VW";
		car2.model="Jetta";
		car2.color="Silk Blue";
		car2.mileage=16277;
		car2.price=23389.56;
		car2.year=2019;
		car2.vin="3VWG57BU6KM116518";
		
		car1.drive();
		car2.drive();
		System.out.println();
		car1.specs();
		System.out.println();
		car2.specs();
		
	
		
		
	}
}
