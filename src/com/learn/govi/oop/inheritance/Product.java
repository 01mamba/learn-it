package com.learn.govi.oop.inheritance;

public class Product {
	
	private int id;
	private String name;
	
	public Product(String string) {
		this.name = string;
	}

	public int calculateRemainingAmount() {
		return 100; // just a stub for example
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Product[] listVariants() {
		// some code that fetches the variant products from database
		return new Product[3];
	}

}
