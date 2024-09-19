package com.learn.govi.loops.hw;

import java.util.Arrays;
import java.util.Scanner;

public class NewLineForDigit {

	public static void main(String[] args) {
		System.out.print("Please, enter any integer: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] cArr=str.toCharArray();
		
		for(char i: cArr) {
			System.out.println(i);
		}
	}

}
