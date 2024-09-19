package com.learn.govi.loops;

public class PrintMatrixToConsole {

	public static void main(String[] args) {

		int[][] matrix = {
				{1, 2, 3, 4, 5,},
				{6, 7},
				{8, 9, 10}
		};
		
		int length = matrix.length;

//		System.out.println(length);
		
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<matrix[i].length;j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
