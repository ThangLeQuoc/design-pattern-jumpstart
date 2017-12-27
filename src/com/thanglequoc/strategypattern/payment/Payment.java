package com.thanglequoc.strategypattern.payment;

public interface Payment {
	public void pay(int amount) throws PaymentException;
	
	public String getPaymentType();
}
