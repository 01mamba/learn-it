package com.learn.govi.primitiveTypes;

public class PrimitiveTypes {
	public static void main(String args[]) {
		byte b = 1; 
		short s;
		s=2;
		int i3 = 3;
		long l = 4; 
		char c = 'a';
		boolean bool = true; 
		
		float f = 1.2f;
		long l2 = 2_000_000_000_000L;
		double d = 1.3;
		var v = 1.3;
		char c2=100;
		System.out.println(c2);
		
		b = (byte)i3;
		byte b2 = (byte)1000;
		System.out.println(b2);
		
		long number = 499_000_000_000_000L;
		double converted = (double) number;
		System.out.println(number - (long)converted);
		
		
				
	}

}
