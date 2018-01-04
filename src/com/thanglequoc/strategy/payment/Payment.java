package com.thanglequoc.strategy.payment;

public interface Payment {
	public void pay(int amount) throws PaymentException;
	
	public String getPaymentType();
}
