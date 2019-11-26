package day53_interfaceContinue;

public class toyotaMirai implements cars,gasVehicles,electricVehicles
{

	@Override
	public void charge()
	{
		System.out.println("can we really?");
		
	}

	@Override
	public void selfDriver()
	{
		System.out.println("somehow I doubt");
		
	}

	@Override
	public void pumpGas()
	{
		System.out.println("is it gas or Hydrogen cell");
		
	}

	@Override
	public void start()
	{
		System.out.println("press start");
		
	}

}
