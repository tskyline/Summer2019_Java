package day09_review;

public class task04_https
{
	public static void main(String[] args)
	{
		int status=9;
		if(status==200)
		{
			System.out.println("OK");
		}
		else if(status==201)
		{
			System.out.println("Created");
		}
		else if(status==202)
		{
			System.out.println("Accepted");
		}
		else if(status==301)
		{
			System.out.println("Moved Permanently");
		}
		else if(status==303)
		{
			System.out.println("See Other");
		}
		else if(status==304)
		{
			System.out.println("Not Modified");
		}
		else if(status==307)
		{
			System.out.println("Temporary Redirect");
		}
		else if(status==400)
		{
			System.out.println("Bad request");
		}
		else if(status==401)
		{
			System.out.println("Unauthorized");
		}
		else if(status==403)
		{
			System.out.println("Forbidden");
		}
		else if(status==404)
		{
			System.out.println("Not Found");
		}
		else if(status==410)
		{
			System.out.println("Gone");
		}
		else if(status==500)
		{
			System.out.println("Internal Server Error");
		}
		else if(status==503)
		{
			System.out.println("Service Unavailable");
		}
		else
		{
			System.out.println("You have entered an unknown input");
		}
	}
}
