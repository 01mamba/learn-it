package com.learn.govi.Arrays;

import java.util.Arrays;

public class ArraysDemo {
	
	public static void main(String args[]) {
		
		int[] arr;
		int arr2[];
		
		arr = new int[10];
//		System.out.println(arr[0]);
//		System.out.println(arr.length);
		
		double[] arr3 = new double[10];
//		System.out.println(arr3[0]);
		
		boolean[] arr4 = new boolean[10];
//		System.out.println(arr4[0]);
		
		int[] arr5 = {3,2,1};
		
		int[][] matrix = {{1,2,3},{2,3,5}};
		
		//System.out.println(matrix[0][2]);
		int[][] matrix2 = new int[10][10];
		//System.out.println(matrix2[2]);
		
	//	System.out.println(Arrays.toString(arr5));
	
		Arrays.sort(arr5);
		System.out.print(Arrays.toString(arr5));
		
		// Remove a line ctrl + D
		// clean up import ctrl + shift + 0
	}
}
