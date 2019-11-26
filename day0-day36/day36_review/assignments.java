package day36_review;

public class assignments
{
	public static void main(String[] args)
	{
		//numbers in String 0~999
		int num=301;
		String []decten= {" ","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String []dec2= {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String []dec1= {" ","ten","twenty","thirty","fourty","fifty","sixty","seventy","eighthy","ninety"};
		String dec0="hundred";
		int a=num%100;
		String out="";
		String out2="";

		
		if(a==0)
			out=dec2[0];
		else if(a%10==0)
			out=dec1[a/10];
		
		else if(a<10&&a>0)
			out=dec2[a%10];
	
		else if(a>10&&a<20)
			out=decten[a%10];
	
		else if(a>=20&&a<100)
			out=dec1[a/10]+" "+dec2[a%10];
		
		if(num<100)
		{
			out2=out;
		}
		else if(num>=100)
		{
		
		if(num==100)
			out2=dec2[1]+" "+dec0;
		else if(num>100&&num%100!=0)
			out2=dec2[num/100]+" "+dec0+" "+out;
		else if(num>100&&num%100==0)
			out2=dec2[num/100]+" "+dec0;
		}
			
		
		System.out.println(out2);	
	}
	
}
