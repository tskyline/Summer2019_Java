package day58_exceptionContinue;

import java.io.FileInputStream;
import java.util.Properties;

public class warmup
{
	/*
	 	1. Write a method called "wait" that causes the current executing thread to sleep for the specific number of seconds
            parameters: double seconds
            return-type: void
            Thread.sleep();
        Note: Exceptions MUST be handled within the methods
	 */
	public static void main(String[] args)
	{
		Wait(2.5);
		System.out.println("TK");
		
		String filePath="/Users/TK/eclipse-workspace/Summer2019_Java/src/day58_exceptionContinue/Data.properties";
		System.out.println(getData("ID", filePath));
		
		filePath="files/TestData.properties";
		System.out.println(getData("Age",filePath));
		
		
	}
	
		public static void Wait(double seconds)
		{
			try
			{
				Thread.sleep();
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		/*2. write a method called "getData" that can retrieve the data from properties files
        parameters: String Key, String FilePath
        return-type: String
    Note: Exceptions MUST be handled within the methods
    */
		
		public static String getData(String key,String filePath)
		{
			String data="";
			
			Properties property=new Properties();
			
			try
			{
				FileInputStream file=new FileInputStream(filePath);
				property.load(file);
				
			} catch (Exception e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			data=property.getProperty(key);
			
			return data;
		}
}
