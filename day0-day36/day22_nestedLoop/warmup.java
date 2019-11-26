package day22_nestedLoop;

public class warmup
{
	public static void main(String[] args)
	{
		int i=1;
		String text="";
		while(i<=30)
		{
			/*
			if(i%15==0)
			{
				text+="FINRA ";
			}else if(i%5==0)
			{
				text+="RA ";
			}else if(i%3==0)
			{
				text+="FIN ";
			}else
			{
			text+=i+" ";
			}
			*/
			text+=i%15==0?"FINRA ":i%5==0?"RA ":i%3==0?"FIN ":i+" ";
			i++;
		}
		System.out.println(text);
	}
}

