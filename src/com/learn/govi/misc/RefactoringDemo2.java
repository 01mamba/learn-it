package com.learn.govi.misc;

public class RefactoringDemo2 {

	public static void main(String[] args) {
		printToConsole();

	}

	private static void printToConsole() {
		int sum = printToControl();

		System.out.println(sum);
	}

	private static int printToControl() {
		int i = 10;
		System.out.println("Some code that are not aligned");
		int sum = 10 + 5;
		System.out.println(sum);
		return sum;
	}

	// ctl + Shift + F to format the code
// Alt + shift +  M to extract the method 
	// ctrl + Shift + O to have only required imports with fullName
}
