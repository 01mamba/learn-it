package com.learn.govi.string;

import java.util.*;

public class Hw {
	public static void main(String args[]) {
		
		double s = Math.PI;
		System.out.printf("%.1f%n",s);
		System.out.printf("%.2f%n",s);
		
		
//		Program starts and asks user to input any text
//		Program prints array of words entered by user without any spaces or punctuation marks
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any text: ");
		String userInput = sc.nextLine();
		System.out.print("You entered these words: ");
		System.out.println(Arrays.toString(userInput.split("[\\p{P}\\s]+")));
	}

}
