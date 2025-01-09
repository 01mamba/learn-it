package com.learn.it.govi.oop.interfaces;

public class Client {

	 private PaymentProcessor paymentProcessor;
	 
	 {
		 paymentProcessor = new PayPalPaymentProcessor(); 
	 }
	 public void checkout(PayemntData payment) {
		 
		 paymentProcessor.processPayment(payment);
		 PaymentProcessor.someStaticMethod(); // demo static method invocation
	 }
	 
	 public void setPaymentProcessor(PaymentProcessor paymentProcessor) {
		 this.paymentProcessor = paymentProcessor;
	 }
}
