package com.learn.govi.operators;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class OperationsWithIntegersAndDoubles {
	public static void main(String args[]) {
		
		
		int i = 20;
		System.out.println(i / 3);				// 6
		System.out.println(i - (6 * 3));		// 2
		System.out.println((double)i / 3);		// 6.666666666666667
//		
		
		BigDecimal rideFee = BigDecimal.valueOf(i).setScale(2);
		BigDecimal amountPeople = BigDecimal.valueOf(3);
		BigDecimal chargePerPerson = rideFee.divide(amountPeople, RoundingMode.HALF_UP);
		System.out.println("ChargePerPerson  "+chargePerPerson);
		
//		
		double d = 3.1;
		double d2 = 1.21;
//		
		System.out.println(d - d2);								// 1.8900000000000001
//		
		BigDecimal bd3 = BigDecimal.valueOf(3.1).setScale(2);
		BigDecimal bd4 = BigDecimal.valueOf(1.21).setScale(2);
		System.out.println(bd3.subtract(bd4));					// 1.89
		
	}

}
