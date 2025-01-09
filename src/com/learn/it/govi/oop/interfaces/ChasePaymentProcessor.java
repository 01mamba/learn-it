package com.learn.it.govi.oop.interfaces;

public class ChasePaymentProcessor implements PaymentProcessor, PaymentValidator {

	@Override
	public void processPayment(PayemntData payment) {
		// TODO Auto-generated method stub
		
		/* String secureToken = ChaseApi.requestSecureTokenForApp();
		 * initPaymentPage(secureToken, payment.getPaymentAmount);
		 * ...
		 */	
	}

	@Override
	public boolean validatePayment(PayemntData payemntdata) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
