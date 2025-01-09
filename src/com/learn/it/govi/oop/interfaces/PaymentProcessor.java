package com.learn.it.govi.oop.interfaces;

public interface PaymentProcessor {
	int RETRY_ATTEMPTS = 5; 
	// all fields in interfaces are public static final 
	
	void processPayment(PayemntData payment);
	
	default void someDefaultMethod() {
		System.out.println("THis is the default method");
	}
	static void  someStaticMethod() {
		System.out.println("This is the static method");
	}
}
