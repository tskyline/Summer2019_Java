package day25_arraysUtility;

import java.util.Arrays;

public class MultidimensionalArray
{
	//n dimensional array contains multiple (n-1) dimensional arrys 
	public static void main(String[] args)
	{
		int[] []arr2D = { {1,2,3}, {4,5,6}, {7,8,9} };
		
		String[] [] str2D= { {"Tuna","Cemre"}, {"Arda","Ilknur"} };
		//[represents the index of 1dimensional arrays] [represents the index num of values]
		System.out.println(str2D[0][1]); //Cemre
		
		//Arrays.deeptoString(variablename):converts multi dimensional array to string
		
		System.out.println(Arrays.deepToString(arr2D));
		
		System.out.println(arr2D[2][2]);
		
		System.out.println(Arrays.toString(arr2D[2]));
		
		int [][][]arr3d= { { {1,2},{3,4,5} },{ {6,7},{8,9,10} } };
		System.out.println(arr3d[0][1][2]);
		
		int [][][][]arr4d= {{ { {1,2},{3,4,5} },{ {6,7},{8,9,10} } }, { { {11,21},{31,41,51} },{ {16,71},{81,91,101} } }};
		
		
	}
}
