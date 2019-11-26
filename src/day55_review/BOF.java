package day55_review;

import java.util.ArrayList;
import java.util.Arrays;

public class BOF 
{
/*
 	WarmUp:
    1. create an interface called ScrumMeetings
            Actions: DailyStandUp();
                     Demo();
    2. create an abstract class called ScrumTeam
            Data: Name
                  JobTitile
                  Salary
    3. Create the following sub classes of ScrumTeam:
                1. Testers:
                        Actions: FindBug
                2. Developers:
                        Actions: FixBug
    4. Create a class called BOF
            create Array of Testers named sdets, at leats store two objects
            create array of Developers named dev, at least store three objects
            create ArrayList of ScrumTeam:
                    store all the developer' and testers' objects
 */
	public static void main(String[] args)
	{
		
	
	scrumTeam sdet1=new testers("Madina","sdet1",100.00);	//polymorhisim
	scrumTeam sdet2=new testers("Tunahan","sedt2",90.00);
	scrumTeam []sdets= {sdet1,sdet2};
	sdet1.dailyStandUp();
	/*
	for (scrumTeam testers : sdets)
	{
		testers.getInfo();
	}
	*/
	scrumTeam dev1=new developers("Muhtar","dev1",150.00);
	scrumTeam dev2=new developers("Nurzat","dev2",70.00);
	scrumTeam []devs= {dev1,dev2};
	/*
	for (scrumTeam developers : devs)
	{
		developers.getInfo();
	}
	*/
	ArrayList<scrumTeam> scrumTeam=new ArrayList<>();
	scrumTeam.addAll(Arrays.asList(sdets));
	scrumTeam.addAll(Arrays.asList(devs));
	
	for (scrumTeam scrumTeam2 : scrumTeam)
	{
		scrumTeam2.getInfo();
	}
	
	}
	
			
	
}
