package com.learn.govi.method.hw;
import java.util.Arrays;
import java.util.Scanner;

public class FindMaxInt {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter integer numbers separated by space: ");
		String str = sc.nextLine();
		int[] arr=convertToIntArray(str.split("\\s+"));
		
		
		
		System.out.println("*** Initial Array ***");
		System.out.println(Arrays.toString(arr));
		System.out.println("*** Max number in array ***");
		int maxInt = findMaxIntInArray(arr);
		System.out.println(maxInt);
	}
	
	public static int findMaxIntInArray(int[] intArray) {
		int max = intArray[0];
		for(int i: intArray) {
				if(i>max) {
					max =i;
				}
		}
		return max;
	}
	
	public static int[] convertToIntArray(String[] strArr) {
		int[] intArr = new int[strArr.length];
		for(int i=0; i<strArr.length;i++) {
			intArr[i] = Integer.parseInt(strArr[i]);
		}
		return intArr;
	}
}
