package com.learn.govi.oop.inheritance;

public class Demo {

	public static void main(String args[]) {
		Product product = new Phone();
		product.setName("nokia 1100");
		System.out.println("productname == "+product.getName());
		System.out.println("Remaining amount in stock: "+product.calculateRemainingAmount());
		
		//product.right();
		
		Phone phone2= new Phone();
		phone2.ring();
		
		if(product instanceof Phone) {
			Phone phone3 = (Phone) product; 
			phone3.ring();
		}
		System.out.println(phone2.calculateAmountOfVariants());
	}
}
