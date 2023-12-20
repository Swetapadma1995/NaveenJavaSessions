package JavaSessions;

import java.util.Arrays;

public class TwoDimArrayConcept {

	public static void main(String[] args) {
		
		int arr[][] = new int[4][5];
		arr[0][0] = 100;
		arr[0][0] = 200;
		arr[0][0] = 300;
		arr[0][0] = 400;
		System.out.println(arr.length);
		
		//Array Literals
		
		int num[][] = {
				{2,6,8},
				{4,7,6},
				{8,9,5}
		};
		System.out.println(num.length);
		System.out.println(Arrays.toString(num));
		
		//to iterate 2D array: use two loops:
		
		for(int row=0; row<num.length; row++)
		{
			for(int col=0; col<num[0].length; col++)
			{
				System.out.print(num[row][col] + " ");
			}
			System.out.println();
			break;
		}
		
		Object empInfo[][] = {
				{"Sam", 23, "TL", true},
				{"San", 25, "SDET1", false},
				{"Ram", 27, "SDET2", true}
		};
		
		for(int row=0; row<empInfo.length; row++) {
			for(int col=0; col<empInfo[0].length; col++)
			{
				System.out.print(empInfo[row][col]+" ");
			}
			System.out.println();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

