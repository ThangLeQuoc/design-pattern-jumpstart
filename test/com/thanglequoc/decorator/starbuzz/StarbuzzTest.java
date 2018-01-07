package com.thanglequoc.decorator.starbuzz;

import org.junit.Test;

public class StarbuzzTest {
    @Test
    public void should_PrepareEspressoWithMochaAndSteamedMilk_When_WrappedIt(){
	Beverage myEspresso = new Espresso();
	/**
	 * I would like my espresson would have mocha with steamed milk
	 * */
	myEspresso = new Mocha(myEspresso);
	myEspresso = new SteamedMilk(myEspresso);
	
	System.out.println(myEspresso.getDescription());
	System.out.println("Price: "+ myEspresso.cost());
    }
}
