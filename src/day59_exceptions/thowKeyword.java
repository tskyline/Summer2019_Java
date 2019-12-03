package day59_exceptions;

import java.io.IOException;

public class thowKeyword
{
	public static void main(String[] args)
	{
		RuntimeException name=new RuntimeException();
		
		//throw name;
		throw new RuntimeException();
		//After throwing an exception any code after that considered dead until exception is handled.
		//throw new IOException();
	}
}
