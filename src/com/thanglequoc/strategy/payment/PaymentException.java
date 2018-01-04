package com.thanglequoc.strategy.payment;

public class PaymentException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static String NOT_ENOUGH_MONEY = "You don't have enough money to pay";
	
	public static String TOTALLY_BROKE = "Get out of here, you're scaring the customers";
	
	public PaymentException(String message) {
		super(message);
	}
}
