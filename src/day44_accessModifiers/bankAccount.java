package day44_accessModifiers;
/*
 WarmUp: creata a custom class for bankaccount
    The attributes/data that the class can have are: 
            AccountHolder, AccountName, AvailableBalance
    Actions the class can do are:
            deposit, withdraw, checking balance
    requiremnets:
            1. apply encapsulations
            2. user should be able to deposit, withdraw and check the balance
                2.1 if the withdrawing account is greater than available balance, 35$ penalty fee will be charger from the account
                2.2 if the available balance is less or equal to 0, account holder won't be able to withdraw money
Collapse

 */
	
	
public class bankAccount
{
	private String accountHolder;
	private long accountNumber;
	private double availableBalance;
	
	//getter(read only): instance return method, return-type MUST match with the parameter
	
	public String getAccountHolder()
	{
		return accountHolder;
	}
	public long getAccountNumber()
	{
		return accountNumber;
	}
	public double getAvailableBalance()
	{
		return availableBalance;
	}
	
	
	//setter(modify): instance void method, passes a parameter 
	public void setAccountHolder(String accountHolder)
	{
		this.accountHolder=accountHolder;
	}
	public void setAccountNumber(long accountNumber)
	{
		this.accountNumber=accountNumber;
	}
	
	
	//Actions: 
		//deposit
		public void deposit(double amount)
		{
			availableBalance+=amount;
		}
		
		//withdraw
		public void withdraw(double amount)
		{
			if(availableBalance>0)
			{
			availableBalance-=amount;
			if(availableBalance<amount)
				availableBalance-=35;
			}else
				System.out.println("Your account it fogged u loser.");
		}
		
		//checking balance: 
		public void showBalance()
		{
			System.out.println("Your balance is"+availableBalance);
		}
		
		//get account info
		public void accountInfo()
		{
			System.out.println("Name: "+getAccountHolder());
			System.out.println("Account Number: "+ getAccountNumber());
			System.out.println("Available Balance: $"+ getAvailableBalance());
		}
}
