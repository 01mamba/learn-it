package com.learn.govi.oop.inheritance;

public class Phone extends Product{


	// Default constructor
	public Phone() {
		super("Nokia");
		System.out.println("Some code");
	}

	@Override
	public Product[] listVariants() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}
	public void ring() {
		System.out.println("Ring!");
	}
	public int calculateAmountOfVariants() {
		return listVariants().length;
	}
}
