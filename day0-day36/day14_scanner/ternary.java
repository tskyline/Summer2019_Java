package day14_scanner;

public class ternary
{
	public static void main(String[] args)
	{
		int num=0;
		if(100==num)
			num=100;
		else
			num=50;
		
		//						in ternary 
		//if(condition) 	==>(condition)?
		//else				==>		:
		//else if(condition)==>	:(condition)?
		
		num=(num==0)? 100:50;//in ternary's body we can only give a single value
		//must be initialize to a variable
		num=100;
		int n=0;
		n=(num==100)? 50:(num==0)? 100:1 ;
		System.out.println(n);
		
		String schoolName="";
		boolean batch12=true;
		
		schoolName=(batch12)? "Cybertek":"Invalid";
		System.out.println(schoolName);
		
		char finalGrade='C';
		String group="";
		
		group=(finalGrade=='A')? "earlybird":(finalGrade=='B')? "After Group" :
			(finalGrade=='C')? "Late Group":"invalid";
		System.out.println(group);
		
		
		int score=101;
		char finals=' ';
		
		finals=(score>=90&&score<101)? 'A':
			(score>=80&&score<90)? 'B':
				(score>=70&&score<80)? 'C':
					(score>=60&&score<70)? 'D':
						(score<60)? 'F':'?';
		System.out.println(finals);
		
		
		
	}
}
