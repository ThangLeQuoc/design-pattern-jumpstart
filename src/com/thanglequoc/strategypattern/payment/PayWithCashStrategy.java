package com.thanglequoc.strategypattern.payment;

public class PayWithCashStrategy implements Payment {
	
	private static String WALLET_INFO = "My cheap wallet";
	
	private int moneyInPocket;
	
	public PayWithCashStrategy() {
		moneyInPocket = 120;
	}
	
	@Override
	public void pay(int amount) throws PaymentException {
		if(amount> moneyInPocket) throw new PaymentException(PaymentException.NOT_ENOUGH_MONEY);
		else {
			moneyInPocket-=amount;
			System.out.println("--------------------------------");
			System.out.println("Checkout successfully with: "+WALLET_INFO);
			System.out.println("Remaining money: "+moneyInPocket);
		}
	}

	@Override
	public String getPaymentType() {
		return WALLET_INFO;
	}

}
