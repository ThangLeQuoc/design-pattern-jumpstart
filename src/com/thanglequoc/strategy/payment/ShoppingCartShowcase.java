package com.thanglequoc.strategy.payment;

import com.thanglequoc.program.DesignPatternProgramShowcase;
import com.thanglequoc.program.DesignPatternType;

public class ShoppingCartShowcase implements DesignPatternProgramShowcase {
	
	private static String DESIGN_PATTERN_NAME = "Strategy";
	
	@Override
	public void printDesignPatternName() {
		System.out.println(DESIGN_PATTERN_NAME+" - "+DesignPatternType.BEHAVIORAL_PATTERN);		
	}
	
	

	@Override
	public void perform() {
		/**
		 * It's shoppin' time
		 * */
		ShoppingCart cart = new ShoppingCart();		
		cart.addItemValue(10);
		cart.addItemValue(60);
		cart.addItemValue(200);
		cart.addItemValue(300);
		cart.addItemValue(400);
		
		Payment myPaymentStrategy = null;
		
		/**
		 * Time to reach the cashier
		 * */
		try {
			/**
			 *Pay with money in my wallet first 
			 * */
			myPaymentStrategy = new PayWithCashStrategy();
			cart.selectPaymentStrategy(myPaymentStrategy);
			cart.checkout();
		} catch (PaymentException cashStrategyException) {
			/**
			 * Look like we don't have enough cash in hand, let's use our credit card
			 * */
			try {
				myPaymentStrategy = new PayWithCardStrategy();
				cart.selectPaymentStrategy(myPaymentStrategy);
				cart.checkout();
			} catch (PaymentException cardStrategyException) {
				/**
				 * Look like we don't have enough cash in our credit, let's use everything we got
				 * */						
				try {
					myPaymentStrategy = new PayWithBothWalletAndCardStrategy();
					cart.selectPaymentStrategy(myPaymentStrategy);
					cart.checkout();
				} catch (PaymentException lifeException) {
					/**
					 * We're dead here, no money, no hope, nothing to goes on
					 * */
					System.out.println(lifeException.getMessage());
				} 
			}	
		} finally {
			System.out.println("Thank you for using our service, bye bye");
			System.out.println("========================================");
			System.out.println("My payment strategy was: "+myPaymentStrategy.getPaymentType());
		}
	}
}
