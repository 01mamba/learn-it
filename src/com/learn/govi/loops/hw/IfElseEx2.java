package com.learn.govi.loops.hw;

public class IfElseEx2 {
	public static void main(String[] args) {

		if(args[0].contains(".") || args[1].contains(".") ) {
			System.out.println( Double.parseDouble(args[0])+Double.parseDouble(args[1]));
		}
		else {
			System.out.println( Integer.parseInt(args[0])+Integer.parseInt(args[1]));
		}
	}

}
