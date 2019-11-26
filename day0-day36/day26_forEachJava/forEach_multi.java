package day26_forEachJava;

public class forEach_multi
{
	public static void main(String[] args)
	{
		int []  arr1d= {1,2,3,4};
		for(int each:arr1d)
			System.out.print(each);
		
		System.out.println();
		
		
		
		int[][] arr2d= { {1,2,3,4}, {5,6,7,8} };
		for (int i = 0; i < arr2d.length; i++) 	//counts 1D arrays
		{							
			for (int j = 0; j < arr2d[i].length; j++)
			{
				System.out.print(arr2d[i][j]);
			}
		}
		
		//for each loop
		System.out.println();
		for(int[] each1:arr2d)
		{
			for(int each2: each1)
			System.out.print(each2);
		}
		System.out.println();
		
		String[][] str2d= { {"tuna","cemre"},{"arda","ilknur"} };
		for(String[] each1:str2d)
		{
			for(String each2:each1)
				System.out.print(each2+" ");
				System.out.println();
		}
		
		String[][][] str3d={ { {"tuna","cemre"},{"arda","ilknur"} },{ {"anut","ermec"},{"adra","runkli"} } };
		for(String[][]each1:str3d)
		{
			for(String[]each2:each1)
				for(String each3:each2)
					System.out.print(each3+" ");
			System.out.println();
		}
		
		
		
		
	}
}
