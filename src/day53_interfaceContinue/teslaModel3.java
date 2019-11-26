package day53_interfaceContinue;

public class teslaModel3 implements cars,electricVehicles
{

	@Override
	public void charge()
	{
		System.out.println("Charging");
		
	}

	@Override
	public void selfDriver()
	{
		System.out.println("Destination calculating..");
		
	}

	@Override
	public void start()
	{
		System.out.println("Started already");
		
	}

}
