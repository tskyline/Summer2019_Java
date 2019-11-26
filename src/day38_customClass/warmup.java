package day38_customClass;

public class warmup
{
	public static void main(String[] args)
	{
		bankAccount user1=new bankAccount();
		
		user1.accountHolder="Tunahan Kirtil";
		user1.accountNumber=435027299951L;
		user1.deposit(1355);
		user1.withdraw(1400);
		user1.withdraw(2);
		
		bankAccount user2=new bankAccount();
		user2.accSetup("Cemre Ulker", 435027268321L);
		
		user2.balance();
	}
}
