package day30_arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayListPractice
{
	public static void main(String[] args)
	{
		ArrayList<String> namelist=new ArrayList<>();
		namelist.add("Tuna");
		namelist.add("Arda");
		namelist.add("Cemre");
		namelist.add("Ilknur");
		
		System.out.println(namelist);
		
		Scanner s=new Scanner(System.in);
		ArrayList<String> studentNames=new ArrayList<>();
		
		
		String name="";
		while(true)
		{
			name=s.nextLine();
			studentNames.add(name);
			System.out.println("Would you like to add more students to the list?");
			
			String ans=s.nextLine().toLowerCase();
			
			if(ans.contentEquals("no"))
				break;
			
		}
			System.out.println(studentNames);
		
		
	}
}
