package day49_abstractionIntro;

public abstract class pokemon
{
	public abstract void fight();
	public abstract void effective();
}
//concrete
class air extends pokemon
{
	@Override
	public void fight()
	{
		System.out.println("1. Wind attack");
		System.out.println("2. Peck");
	}
	
	@Override
	public void effective()
	{
		System.out.println("ground");
	}
}

class ground extends pokemon
{
	@Override
	public void fight()
	{
		System.out.println("1. Body kick");
		System.out.println("2. Scratch");
	}
	
	@Override
	public void effective()
	{
		System.out.println("electric");
		
	}
}

class water extends pokemon
{
	@Override
	public void fight()
	{
		System.out.println("1. Splash");
		System.out.println("2. Hyper Beam");
	}
	
	@Override
	public void effective()
	{
		System.out.println("fire");
		
	}
}