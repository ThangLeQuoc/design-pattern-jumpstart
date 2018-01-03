package com.thanglequoc.strategy.payment;

public class PayWithBothWalletAndCardStrategy implements Payment{
	
	
	private static String PAYMENT_DETAIL = "My whole life";
	private int myWholeCareerAmount;
	
	public PayWithBothWalletAndCardStrategy() {
		myWholeCareerAmount = 620;
	}
	
	@Override
	public void pay(int amount) throws PaymentException {
		if(myWholeCareerAmount < amount) {
			throw new PaymentException(PaymentException.TOTALLY_BROKE);
		} else {
			myWholeCareerAmount-=amount;
			System.out.println("--------------------------------");
			System.out.println("Checkout successfully");
			System.out.println("Remaining life: "+ myWholeCareerAmount);
		}
	}

	@Override
	public String getPaymentType() {
		return PAYMENT_DETAIL;
	}
	
	public int getMyWholeCareerAmount() {
		return myWholeCareerAmount;
	}

}
