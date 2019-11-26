package day48_methodOverriding;
//constructors can not be inherited
//constructors and static method can not be overriden
public class bank
{
	public void interestRate()
	{
		System.out.println("9%");
	}
	
	public static void main(String[] args)
	{
		
		
		bankOfAmerica bo=new bankOfAmerica();
		bo.interestRate();
		
		chase ch=new chase();
		ch.interestRate();
		
		capitalOne co=new capitalOne();
		co.interestRate();
	}
}
class bankOfAmerica extends bank
{
	@Override
	public void interestRate()
	{
		System.out.println("6%");
	}
	
}

class chase extends bank
{
	@Override
	public void interestRate()
	{
		System.out.println("3%");
	}
	
}

class capitalOne extends bank
{
	@Override
	public void interestRate()
	{
		System.out.println("5%");
	}
}
