package com.strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {
	
	private String name;
	private String cardNumber;
	private String cvv;
	
	

	public CreditCardPaymentStrategy(String name, String cardNumber, String cvv) {
		super();
		this.name = name;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
	}



	@Override
	public void pay(double amount) {
		System.out.println("Paying the amount : " + amount + " through caredit card with number : " + this.cardNumber + " belongs to " + this.name);
		
	}

}
