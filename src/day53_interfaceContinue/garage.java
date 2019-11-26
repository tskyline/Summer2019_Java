package day53_interfaceContinue;

public class garage
{
	public static void main(String[] args)
	{
		teslaModel3 car=new teslaModel3();
		car.start();
		car.charge();
		car.selfDriver();
		System.out.println();
		
		jeepWrangler jeep=new jeepWrangler();
		jeep.start();
		jeep.pumpGas();
		System.out.println();
		
		toyotaMirai joke=new toyotaMirai();
		joke.charge();
		joke.pumpGas();
		joke.start();
		joke.selfDriver();
	}
}
