package day25_arraysUtility;

public class warmup
{
	public static void main(String[] args)
	{
		int arr[]= {1,1,2,3,3,5,7,7,8,9};				//print unique characters in an array
		
		for (int j = 0; j < arr.length; j++)
		{
			int count=0;
			for (int i = 0; i < arr.length; i++)
			{
				if(arr[j]==arr[i])
				{
					count++;
				}
				
			}
			if(count==1)	
			System.out.print(arr[j]);
		
		}
		System.out.println();
		//***************************************************//   unique String from array
	
		String str[]= {"tuna","cemre","arda","tuna"};
		
		for (int i = 0; i < str.length; i++)
		{
			int counts=0;
			for (int j = 0; j < str.length; j++)
			{
				if(str[i].equals(str[j]))
						counts++;
				
			}
			if(counts==1)
				System.out.println(str[i]);
		}
		
	}
}
