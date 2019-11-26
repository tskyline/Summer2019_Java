package day53_interfaceContinue;

public class jeepWrangler implements cars,gasVehicles
{

	@Override
	public void pumpGas()
	{
		System.out.println("Gasoline ruleeesss");
		
	}

	@Override
	public void start()
	{
		System.out.println("Manual key twist,rrrrrrrrr");
		
	}

}
