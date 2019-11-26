package day55_review;

public abstract class scrumTeam implements scrumMeetings
{
	public String name;
	public String jobTitle;
	public double salary;
	public void getInfo()
	{
		System.out.println("=======================");
		System.out.println("Employee Name: $"+name);
		System.out.println("Job Title : $"+jobTitle);
		System.out.println("Salary : $"+salary);
		System.out.println("=======================");
	}
	
}

class testers extends scrumTeam
{
	public testers(String name,String jobTitle,double salary)
	{
		this.name=name;
		this.jobTitle=jobTitle;
		this.salary=salary;
	}
	
	public void findBug()
	{
		
	}

	@Override
	public void dailyStandUp()
	{
		System.out.println("Tester "+name+" is talking.");
		
	}

	@Override
	public void demo()
	{
		System.out.println("Tester "+name+" is doing demo");
		
	}
}

class developers extends scrumTeam
{
	public developers(String name,String jobTitle,double salary)
	{
		this.name=name;
		this.jobTitle=jobTitle;
		this.salary=salary;
	}
	
	public void fixBug()
	{
		
	}

	@Override
	public void dailyStandUp()
	{
		System.out.println("Developer "+name+" is talking.");
		
	}

	@Override
	public void demo()
	{
		System.out.println("Developer "+name+" is doing demo");
		
	}
	
}