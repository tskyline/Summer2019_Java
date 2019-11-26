package day44_accessModifiers;

public class cyberBank
{
	public static void main(String[] args)
	{
		bankAccount Arda=new bankAccount();
		bankAccount Tuna=new bankAccount();
		Arda.setAccountHolder("Arda Aydoganlar");
		Arda.setAccountNumber(435027299952L);
		Tuna.setAccountHolder("Tunahan Kirtil");
		Tuna.setAccountNumber(435027299951L);
		Tuna.deposit(130.43);
		Arda.deposit(3482.98);
		
		Arda.accountInfo();
		
	}
}
