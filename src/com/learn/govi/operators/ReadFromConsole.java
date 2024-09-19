package com.learn.govi.operators;

import java.util.Scanner;

public class ReadFromConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a word");
		String word = sc.next();
		System.out.println("Entered word "+word);
		System.out.println("Please Enter any integer number");
		int i = sc.nextInt();
		System.out.println("you entered this integer number:"+i);
	}

}
