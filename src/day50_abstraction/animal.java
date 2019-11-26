package day50_abstraction;

public abstract class animal
{
	public String gender;
	public byte age;
	public String color;
	public String name;
	
	public animal(String gender,byte age,String color,String name)
	{
		this.gender=gender;
		this.age=age;
		this.color=color;
		this.name=name;
	}
	public void speak()
	{
		
	}
	public abstract void speak(String language);
	public abstract void eat();
	public abstract void sleep();
	public abstract void drink();
	/*
 	WarmUp:
    create an Animal abstract class
            data/attributes: gender, age, color, name
            create one constructor that can set the gender, name, color and age
            Actions: Speak(), Eat(), Sleep(), Drink();
        create sub classes of the Animal and override those actions:
                    dog: Speak()    ==> woof
                         Sleep()    ==> 8 hours
                         Eat()      ==> KFC
                         Drinks()   ==> Milk Shake
                    Cat: Speak()    ==> meow
                         Sleep()    ==> 14 hours
                         Eat()      ==> m&m
                         Drinks()   ==> Hot chocolate
                    cow: Speak()    ==> moo
                         Sleep()    ==> 5 hours
                         Eat()      ==> grace
                         Drinks()   ==> Coffee with sugar
        create  zoo class and store some of those animals' objects
 */
	public void getInfo()
	{
		System.out.println("Name of the animal is "+name+".");
		System.out.println("It is "+gender+" and "+color+" color.");
		System.out.println("It is "+age+" years old.");
	}
}

class dog extends animal
{	
	public dog(String gender, byte age, String color, String name)
	{
		super(gender, age, color, name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void speak(String language)
	{
		System.out.println("woof");
		
	}
	@Override
	public void sleep()
	{
		System.out.println("8 Hours");
		
	}
	@Override
	public void eat()
	{
		System.out.println("kfc");
		
	}
	@Override
	public void drink()
	{
		System.out.println(name+" drinks milkshake");
		
	}
}

class cat extends animal
{	
	public cat(String gender, byte age, String color, String name)
	{
		super(gender, age, color, name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void speak(String language)
	{
		System.out.println("meow");
		
	}
	@Override
	public void sleep()
	{
		System.out.println("14 Hours");
		
	}
	@Override
	public void eat()
	{
		System.out.println("m&m");
		
	}
	@Override
	public void drink()
	{
		System.out.println("hot chocolate");
		
	}
}

class cow extends animal
{	
	public cow(String gender, byte age, String color, String name)
	{
		super(gender, age, color, name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void speak(String language)
	{
		System.out.println("moo");
		
	}
	@Override
	public void sleep()
	{
		System.out.println("5 hours");
		
	}
	@Override
	public void eat()
	{
		System.out.println("grapes");
		
	}
	@Override
	public void drink()
	{
		System.out.println("rasberry mocha");
		
	}
}



