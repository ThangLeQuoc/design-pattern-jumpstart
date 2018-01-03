package com.thanglequoc.strategy.payment;

public class PayWithCardStrategy implements Payment {
	
	private static String CARD_NUMBER = "3451 1241 1234 3123";
	
	private int balance;
	
	public PayWithCardStrategy() {
		balance = 500;
	}
	
	
	@Override
	public void pay(int amount) throws PaymentException {
		if(balance < amount) throw new PaymentException(PaymentException.NOT_ENOUGH_MONEY);
		else {
			balance-=amount;
			System.out.println("--------------------------------");
			System.out.println("Checkout successfully with: "+CARD_NUMBER);
			System.out.println("Balance: "+balance);
		}
	}


	@Override
	public String getPaymentType() {
		return CARD_NUMBER;
	}
}
