package day38_customClass;


public class bankAccount
{
	String accountHolder;
	long accountNumber;
	double balance;
	
	public String acc()
	{
		String acc=""+accountNumber;
		String x="********";
		String accountN=x+acc.substring(8);
		return accountN;
	}
	
	public void accSetup(String name,long accountNumber)
	{
		this.accountHolder=name; //this. is used to call instance variable
		this.accountNumber=accountNumber;//if not used method will use local variable first
	}
	
	public void deposit(double money)
	{
		
		balance+=money;
		System.out.println("Hi,"+ accountHolder+ " your balance in your "+acc()+" account is $"+balance);
	}
	public void withdraw(double money)
	{
		
		if(balance<=0)
			System.out.println("No Money in the account, sorry pal");
		else if(money>balance)
		balance-=money+35;
		else
			balance-=money;
		
		System.out.println("Hi,"+ accountHolder+ " your balance in your "+acc()+" account is $"+balance);
	}
	public void balance()
	{
		
		System.out.println("Hi,"+ accountHolder+ " your balance in your "+acc()+" account is $"+balance);
	}
}
