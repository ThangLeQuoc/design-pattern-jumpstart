package com.thanglequoc.strategy.payment;

public class ShoppingCart {
	private int totalAmount;
	private Payment paymentStrategy;
	
	public ShoppingCart() {
		totalAmount = 0;
	}
	
	public void addItemValue(int money) {
		totalAmount+=money;
	}
	
	
	public void selectPaymentStrategy(Payment paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}
	
	public void checkout() throws PaymentException {
		paymentStrategy.pay(totalAmount);
	}
	
}
