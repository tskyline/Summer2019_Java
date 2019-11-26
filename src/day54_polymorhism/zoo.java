package day54_polymorhism;

public class zoo
{
	/*
	11/19/2019
Topic:  Polymorphisim
            IS A relationship VS Has A Relationship
package name: day54_Polymorphisim
OOP:
    1. Encapsulation: hiding the data, getter & setter
    2. Inheritance: super&sub relationship, sub class gets rich
    3. Abstractiom: hiding the implemntation, abstract class & interface
    4. Polymorphisim: objects to behave in multiple forms
WarmUp:
    Create a class called Animal (Do not use abstraction for now):
                Actions: Talk()
    create sub classes of Animal class:
                1. Tiger:
                        Actions: Hunts()
                2. Octopus:
                        Actions: Swim()
        override super class' instance method Talk()
    create a class called Zoo:
            Create Arrays of Tiger
            Create Arrays of Octopus
Is A rerlation: is inherited relationship between classes
            Ex: class Dog extends Animal 
                class Husky extends Dog
                Dog is An animal 
                Husky is A Dog
                Husky is an Animal
                Animal obj = new Husky();
Has A relation: instance of the class (object) is used in another classes
            class Car{
                Engine obj = new Engine();
            }
            Car Has An engine
            class Zoo{
                    Tiger obj1 = new Tiger();
                    Octopus obj2 = new Octopus();
                    Animal obj3 = new Tiger();
            }
            Zoo Has A Tiger
            Zoo Has An Octopus
            Zoo Has an Animal
            Tiger Is An animal
        classA            obj   =   new classA();
        referencetype                   object
        object MUST be created from Non-Abstract class
Polymorphisim: 
            occures when the super class/interface is reference type, and object is created from the classes that have IS A relashion with the super class/interface
        Ex:
            WebDriver driver = new ChromeDriver();
                driver.get("google.com")  // overridden method will be executed
                        opens the chrome browser
            WebDriver driver1 = new FireFoxDriver();
                    driver1.get("google.com"); 
                        opens the firefox browser  
    2 IMPORTANT RULES:
        1) reference type decides what is accessible and what can be used
        2) reference type can be parent class or interface, and objects can be any sub class

	 */
}
class animal
{
	public void talk()
	{
		System.out.println("Animal is talking");
	}

	public static void main(String[] args)
	{
		tiger tiger1=new tiger();
		tiger[] tigers= {tiger1,new tiger()};
		
		octopus octo1=new octopus();
		octopus[]octo= {octo1,new octopus()};
		
		animal ani1=new tiger();
		ani1.talk();
		//ani1.hunt():
		animal ani2=new octopus();
	}

}


class tiger extends animal
{
	public void hunt()
	{
		System.out.println("Tiger is hunting");
	}
	@Override
		public void talk()
		{
			System.out.println("Tiger is ROAARRRRing");
		}
}


class octopus extends animal
{
	public void swim()
	{
		System.out.println("Octopus is swimming");
	}
	@Override
	public void talk()
	{
		System.out.println("Octopus is GLULGLUing");
	}
	
}